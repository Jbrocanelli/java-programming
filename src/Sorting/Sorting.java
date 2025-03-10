package Sorting;

import java.util.Arrays;

// Implement selection sort
public class Sorting {
    public static void main(String[] args){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);

    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for(int n : array){
            if (n < smallest){
                smallest = n;
            }
        }
        return smallest;
    }

    public static int indexOfSmallestValue(int[] array){
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] =  temp;

    }

    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i , smallest);
            System.out.println(Arrays.toString(array));

        }
    }
}
