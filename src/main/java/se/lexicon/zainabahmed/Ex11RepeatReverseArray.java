package se.lexicon.zainabahmed;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 11.Write a program that ask the user for an integer and repeat that
 * question until user give you a specific value that user already has been
 * told about as a message in your program. Store these values in an array
 * and print that array. After that reverse the array elements so that the
 * first element becomes the last element, the second element becomes
 * the second to last element, etc. Do not just reverse the order in which
 * they are printed. You need to change the way they are stored in the
 * array.
 */

public class Ex11RepeatReverseArray {
Scanner scanner = new Scanner(System.in);

public void reverseArray(){

    String userInput = "a";
    while (userInput.equals("x")){
        System.out.println("Enter an integer value: [X to exit] ");
        userInput = scanner.nextLine();
    }
}

}
