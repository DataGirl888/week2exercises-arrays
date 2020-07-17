package se.lexicon.zainabahmed;
 /*7. Write a program which will set up an array to hold 10 numbers and print
         out only the uneven numbers.
         Expected output: Array: 1 2 4 7 9 12
         Odd Array: 1 7 9
*/
public class Ex07OddNumbersArray {
 private static int[] myNumbers = new int[] {2, 9, 11, 13, 17, 23, 36, 45, 64, 79};

 public static void printOddNumbers(){
  StringBuilder allNumbers = new StringBuilder("Array: ");
  StringBuilder oddNumbers = new StringBuilder("Odd Array: ");
  for (int number : myNumbers) {
       allNumbers.append(number).append(" ");
       if (number%2!=0) {
        oddNumbers.append(number).append(" ");
       }
  }
  System.out.println(allNumbers.append("\n").append(oddNumbers));
 }
}
