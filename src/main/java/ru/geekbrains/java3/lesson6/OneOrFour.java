package ru.geekbrains.java3.lesson6;

public class OneOrFour {

    private boolean oneOrFour(int[] arr){
        boolean isContainsOne = false;
        boolean isContainsFour = false;
        boolean isContainsTemp = false;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 1){
                isContainsOne = true;
            }else if (arr[i] == 4){
                isContainsFour = true;
            }else if ((arr[i] != 1) || (arr[i] !=4)){
                isContainsTemp = true;
            }
        }

        return (isContainsOne == true && isContainsFour == true) && isContainsTemp == false;

    }
}
