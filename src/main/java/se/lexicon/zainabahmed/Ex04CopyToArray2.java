package se.lexicon.zainabahmed;
import java.util.Arrays;

  /** Exercise 4 copy arrays
   * 4. Write a program which will copy the elements of one array into another
          array.
          Expected output: Elements from first array: 1 15 20
          Elements from second array: 1 15 20
          */
public class Ex04CopyToArray2 {
  private static int[]  myFirstArray = {1, 15, 20};
  private static int[]  mySecondArray = new int[myFirstArray.length];

  //METHODS

    // getters
    public static int[] getMyFirstArray(){
      return myFirstArray;
    }
    public static int[] getMySecondArray(){
      return myFirstArray;
    }
  //Copy arrays, then print
  public static void copyArray(int[] myFirstArray, int [] mySecondArray){
    StringBuilder arrayOutput = new StringBuilder("Elements from first array: ");
    int indexFirst = arrayOutput.indexOf("f",13);

    for (int i=0, j=0; i<myFirstArray.length; i++, j++){
      mySecondArray[j] = myFirstArray[i];  // copy to secondArray
      arrayOutput.append(myFirstArray[i]).append(" ");
    }
    System.out.println(arrayOutput);
    System.out.println(arrayOutput.replace(14, 19, "second")); //.insert(20,' '));
  }

}
