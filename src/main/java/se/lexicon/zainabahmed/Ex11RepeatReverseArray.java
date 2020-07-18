package se.lexicon.zainabahmed;
/* Exercise 11 Reverse integer input and store in array
 * 11.Write a program that ask the user for an integer and repeat that
 * question until user give you a specific value that user already has been
 * told about as a message in your program. Store these values in an array
 * and print that array. After that reverse the array elements so that the
 * first element becomes the last element, the second element becomes
 * the second to last element, etc. Do not just reverse the order in which
 * they are printed. You need to change the way they are stored in the
 * array.
 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Ex11RepeatReverseArray {
    public static Scanner scanner = new Scanner(System.in);
    private static int[] seedArray = new int[0];

    public static int takeUserInput() {
        System.out.println("Enter an integer value: [0 to exit] ");
        String userInput = scanner.nextLine();
//        System.out.println("user input " + userInput);
        return Integer.parseInt(userInput);
    }

    public static int[] addToArray(int userInput, int[] valuesCount) {
        int[] inputValues = Arrays.copyOf(valuesCount, valuesCount.length + 1);
        inputValues[inputValues.length - 1] = userInput;
        return inputValues;
    }

    public static int[] expandArray(int[] inputArray) {
        return Arrays.copyOf(inputArray, inputArray.length + 1);
    }

    public static int[] addInputToArray() {
        int counter = 1;
        int[] appendedArray = new int[0];
        StringBuilder inputString = new StringBuilder("Input array: [ ");
        int userNumber = 1;
        while (userNumber != 0) {
            userNumber = takeUserInput();
            if (userNumber != 0) {
                seedArray = addToArray(userNumber, seedArray);
                appendedArray = Arrays.copyOf(seedArray, seedArray.length);
                counter++;
            /*    System.out.println("values " + appendedArray[counter - 2] //checking values
                        + " size " + appendedArray.length
                        + " counter " + counter + " userNumber " + userNumber);
*/          }
        }
        for (int number : appendedArray) {
            inputString.append(number).append(" ");
        }
        System.out.print(inputString.append("]").append("\n"));
        return appendedArray;
    }
    public static void reverseInput(int [] userArray) {

int[] reversedArray = new int[userArray.length];
StringBuilder reversedString = new StringBuilder("Reversed array: [ ");
        for(int i =userArray.length-1, j=0; i>=0; i--, j++){
            reversedArray[j] = userArray[i];
            reversedString.append(reversedArray[j]).append(" ");
        }
        System.out.println(reversedString.append("]"));
    }
}


