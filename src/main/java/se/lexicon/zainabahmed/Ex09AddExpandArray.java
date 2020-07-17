package se.lexicon.zainabahmed;

import java.util.Arrays;

/**
 * 9. Write a method which will add elements in an array.
 * Remember that arrays are fixed in size so you need to come up with a
 * solution to “expand” the array.
 */
public class Ex09AddExpandArray {
    private static int[] originalArray = {3, 4, 5};

    public static void addToArray(int element){

        int[] expandedArray = Arrays.copyOf(originalArray,originalArray.length+1);
        expandedArray[expandedArray.length-1] = element;
        StringBuilder addedArray = new StringBuilder("Expanded array : ");

        for (int number : expandedArray){
            addedArray.append(number).append(" ");
        }
        System.out.println(addedArray);
    }
}
