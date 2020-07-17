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
        int element = givenArray[0];
        StringBuilder uniqueNumbers = new StringBuilder("Array without duplicate values: ");

        for (int i = 0; i < givenArray.length - 1; i++) {
            if (givenArray[i] != givenArray[i + 1]) {
                uniqueArray = Arrays.copyOf(uniqueArray, i + 1);
                uniqueArray[i] = givenArray[i];
                uniqueNumbers.append(uniqueArray[i]).append(" ");
            } else {
                i++;
            }
        }
        System.out.println(allNumbers.append("\n").append(uniqueNumbers));
    }
}
