package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if(arr == null || arr.length == 0)
            return;

        for(int sortStartIndex = 0; sortStartIndex < arr.length; ++sortStartIndex) {

            int minIndex = sortStartIndex;
            for (int i = sortStartIndex; i < arr.length; ++i) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }

            //swap
            int temp = arr[sortStartIndex];
            arr[sortStartIndex] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}