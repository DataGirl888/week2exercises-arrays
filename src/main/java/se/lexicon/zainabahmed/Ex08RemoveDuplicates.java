package se.lexicon.zainabahmed;
        /* Exercise 8 DUPLICATES
        8. Write a program which will remove the duplicate elements of a given
                array [20, 20, 40, 20, 30, 40, 50, 60, 50].
                Expected output: Array: 20 20 40 20 30 40 50 60 50
                Array without duplicate values: 20 40 30 50 60
                */

import java.util.Arrays;

public class Ex08RemoveDuplicates {
    private static int[] givenArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};

    public static void removeDuplicates() {
//print given array
        StringBuilder allNumbers = new StringBuilder("Array: ");
        for (int number : givenArray){
            allNumbers.append(number).append(" ");
        }

        Arrays.sort(givenArray);
        int[] uniqueArray = {0};
        StringBuilder uniqueNumbers = new StringBuilder("Array without duplicate values: ");

        for (int i = 0; i < givenArray.length-1; i++) {   //comparing each element to the next in sorted array
            if (givenArray[i] != givenArray[i + 1]) {
                uniqueArray = Arrays.copyOf(uniqueArray, i + 1);  // saving to output string only if unique
                uniqueArray[i] = givenArray[i];
                uniqueNumbers.append(uniqueArray[i]).append(" ");
            }if (i == givenArray.length-2){     //checking last element comparison skipped by for loop condition
                if(givenArray[i] !=givenArray[givenArray.length-1]){
                    uniqueNumbers.append(uniqueArray[i]);
                }
            }
        }
        System.out.println(allNumbers.append("\n").append(uniqueNumbers));
    }
}
