package main;

import java.util.Arrays;

public class IntegerArrayOperation {


    public static void sortArray(int[] array){
        Arrays.sort(array);
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    public static boolean isSorted(int[] array){
       int maxIndex = array.length - 1;
       for(int i = maxIndex; i > 0; i-- ){
           if(array[i-1] > array[i]){
               return false;
           }
       }
       return true;
    }
    public static int secondLargestNumber(int[] array){
        if(isSorted(array)){
            return array[array.length -2];
        }
        sortArray(array);
        return array[array.length -2];
    }

    /**
     * Number of occurence of an element in an array
     * @param array - array of integer
     * @param needle - element to search
     * @return int
     */
    public static int countElement(int[] array, int needle){
        int count = 0;
        for(int e: array){
            if(e == needle){
                count++;
            }
        }
        return count;
    }
}
