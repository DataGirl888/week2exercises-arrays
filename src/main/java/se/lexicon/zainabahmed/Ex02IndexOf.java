package se.lexicon.zainabahmed;
import java.util.Random;

/**
 * EX02
 * 2. Create a program and create a method with name ‘indexOf’ which will
 * find and return the index of an element in the array. If the element
 * doesn’t exist your method should return -1 as value.
 * Expected output: Index position of number 5 is: 2.
 */
public class Ex02IndexOf {
    //VARIABLES
    static int[] myNumbersArray = new int[]{23, 45, 67, 43, 789, 56, 43, 23, 19, 845};

    //METHOD
    //return index

    public static int indexOf() {
        int foundTerm = 0;
        Random rnd = new Random();
        int searchTerm = myNumbersArray[rnd.nextInt(myNumbersArray.length)];  //randomly pick member of array

        for (int i = 0; i < myNumbersArray.length; i++) {
            if (myNumbersArray[i] == searchTerm) {
                System.out.println("Index position of " + searchTerm + " is : " + i);
                foundTerm =i;
            } else {
                foundTerm = -1;
            }
        }
        return foundTerm;
    }
}
