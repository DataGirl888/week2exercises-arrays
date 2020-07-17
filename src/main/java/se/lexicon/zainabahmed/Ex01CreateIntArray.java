package se.lexicon.zainabahmed;
import java.lang.*;

/**
 * Array EX01
 * 1. Write a program which will store elements in an array of type ‘int’ and
 * print it out.
 * Expected output: 11 23 39 etc.
 */
public class Ex01CreateIntArray {
    // INSTANCE VARIABLES
    private static int[] myNumberArray = new int[] {1, 3, 16, 12, 234, 678, 76, 92, 887, 45, 67} ;

    //DISPLAY ARRAY
public static void displayArray(){
    for (int number : myNumberArray ) {
        System.out.print(number + " ");
    }
}
}
