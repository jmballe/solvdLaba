package com.solvd.tareas.sortingAlgo;

public class Sorting {
    public static void main(String[] args){
        int[] array = {5,4,7,8,2,1,9,3,6};
        insertionSort(array);
        for(var elem : array){
            System.out.print(elem + " ");
        }
    }

    private static void insertionSort(int[] arr){
        for(int i=0; i<arr.length; ++i){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int key = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = key;
                j = j-1;
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int min = i;
            //Save in min the index of the smallest element in the unsorted part of the array.
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            //Swap the smallest element with the i element.
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
