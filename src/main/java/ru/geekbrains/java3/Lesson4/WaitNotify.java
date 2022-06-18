package ru.geekbrains.java3.Lesson4;

public class WaitNotify {

    private final Object mon = new Object();
    private char ch = 'A';

    private void method1(){
        synchronized (mon){
            try {
                for (int i = 0; i < 5; i++) {
                    while (ch != 'A'){
                        mon.wait();
                    }
                    System.out.print("A");
                    ch = 'B';
                    mon.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void method2(){
        synchronized (mon){
            try {
                for (int i = 0; i < 5; i++) {
                    while (ch != 'B'){
                        mon.wait();
                    }
                    System.out.print("B");
                    ch = 'C';
                    mon.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void method3(){
        synchronized (mon){
            try {
                for (int i = 0; i < 5; i++) {
                    while (ch != 'C'){
                        mon.wait();
                    }
                    System.out.print("C");
                    ch = 'A';
                    mon.notifyAll();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        WaitNotify waitNotify = new WaitNotify();
        new Thread(()-> {
            waitNotify.method1();
        }).start();
        new Thread(()-> {
            waitNotify.method2();
        }).start();
        new Thread(()-> {
            waitNotify.method3();;
        }).start();
    }
}
