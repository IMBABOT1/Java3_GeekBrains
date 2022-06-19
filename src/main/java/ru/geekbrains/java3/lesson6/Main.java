package ru.geekbrains.java3.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {




    public static void main(String[] args) {
         int[] arr = new int[]{1,3,5,10,16,22,4,7,3,2,1};

         ContainsFour containsFour = new ContainsFour();
        System.out.println(Arrays.toString(containsFour.containsFour(arr)));

        //int[] arr = new int[]{1, 1, 1, 4, 4, 1, 4, 4};
//        int[] arr1 = new int[]{1, 1, 1, 1, 1, 1};
//        int[] arr2 = new int[]{4,4,4,4};
//        int[] arr3 = new int[]{1, 4, 4, 1, 1, 4, 3};
//        int[] arr4 =new int[]{1,4,1,0};

    }
}
