package main;

import java.util.Random;

public class Main {
    public static void main (String[] arg){
        //System.out.println("Hello");
        //generate random array
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        //QuickSort qsort = new QuickSort();
        System.out.println("Before sort:");
        QuickSort.printArray(numbers);
        QuickSort.quicksort(numbers);
        System.out.println("After sort:");
        QuickSort.printArray(numbers);


    }
}