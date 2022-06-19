package ru.geekbrains.java3.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ContainsFour {

    public int[] containsFour(int[] arr){
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();


        boolean contains = IntStream.of(arr).anyMatch(x -> x == 4);
        if (contains == false){
            throw new RuntimeException("Array must contains at least one value of 4");
        }

        for (int i = arr.length -1; i >= 0 ; i--) {
            list.add(arr[i]);
        }

        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) == 4){
                break;
            }else {
                result.add(list.get(i));
            }
        }

        Collections.reverse(result);

        int[] res = result.stream().mapToInt(i -> i).toArray();


        return res;
    }
}
