package binarysearch;

import java.util.Arrays;
import java.util.Scanner;


public class TestBinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array's capacity: ");
        int size = input.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter element of array: ");
            myArray[i] = input.nextInt();
        }

        System.out.println("Display the array " + Arrays.toString(myArray));

        System.out.print("Enter a number to search: ");
        int number = input.nextInt();

/*        BinarySearch lmao = new BinarySearch();
        int index = lmao.binarySearch(myArray, number);
        if (index != -1) {
            System.out.println("Your number " + number + " can be found at index " + index);
        } else {
            System.out.println("Cannot find your number");
        }*/

        BinarySearchWithRecursion lol = new BinarySearchWithRecursion();
        int index = lol.binarySearch(myArray, 0, myArray.length - 1, number);
        if (index != -1) {
            System.out.println("Your number " + number + " can be found at index " + index);
        } else {
            System.out.println("Cannot find your number");
        }

    }

}
