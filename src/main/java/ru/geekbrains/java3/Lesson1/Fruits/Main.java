package ru.geekbrains.java3.Lesson1.Fruits;

public class Main {

    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());

        orangeBox.pour(orangeBox1);

      / System.out.println(orangeBox1);

        System.out.println(orangeBox);


       //System.out.println(appleBox.compare(orangeBox));
    }
}
