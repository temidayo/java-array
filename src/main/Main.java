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




        System.out.println("Before sort:");
        IntegerArrayOperation.printArray(numbers);
        System.out.println(IntegerArrayOperation.isSorted(numbers));

        IntegerArrayOperation.sortArray(numbers);
        System.out.println("After sort:");
        IntegerArrayOperation.printArray(numbers);
        System.out.println(IntegerArrayOperation.isSorted(numbers));

        System.out.println("Second largest number " + IntegerArrayOperation.secondLargestNumber(numbers));

    }
}