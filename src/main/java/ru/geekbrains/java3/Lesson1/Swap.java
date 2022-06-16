package ru.geekbrains.java3.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap<T> {

    public void swap(T[] arr, int first, int second){
        T temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public List<T> arrToList(T[] arr){
       return new ArrayList<>(Arrays.asList(arr));
    }
}
