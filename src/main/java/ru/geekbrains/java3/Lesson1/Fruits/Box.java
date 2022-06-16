package ru.geekbrains.java3.Lesson1.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit>  {
    private List<T> list;

    public Box(){
        list = new ArrayList<>();
    }

    public void addFruit(T t){
        list.add(t);
    }

    public float getWeight(){
        float result = 0;
        for (T t : list){
            result += t.getWeight();
        }
        return result;
    }

    public void pour(Box<T> t){
        for (T t1 : list){
            t.list.add(t1);
        }
        this.list.clear();


    }

    public boolean compare(Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T t : list){
            sb.append(t);
        }

        return sb.toString();
    }
}
