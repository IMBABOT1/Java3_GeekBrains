package ru.geekbrains.java3.Lesson1;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Swap<Integer> swap = new Swap();
        swap.swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
