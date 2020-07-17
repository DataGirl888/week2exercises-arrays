package se.lexicon.zainabahmed;
import java.util.Arrays;

  /*3. Write a program which will sort string array.
          Expected output: String array: [Paris, London, New York, Stockholm]*/

public class Ex03SortStringArray {
  private static String [] citiesArray = {"Cairo", "Paris", "London", "New York", "Stockholm",
                           "Madrid", "Kisumu", "Adis Ababa", "Beijing", "Timbuctu",
                            "Los Angeles", "Puerto Rico","Warsaw" };
   // METHODS

  /**sort and print String Array
   *displays sorted list
   */
  public static void sortCities (){
    Arrays.sort(citiesArray, String.CASE_INSENSITIVE_ORDER);

    StringBuilder citiesOutput = new StringBuilder("[");

    for (String city : citiesArray){    //generated comma separated list
      citiesOutput.append(city).append(", ");
    }
    System.out.print( citiesOutput.substring(0,citiesOutput.length()-2) + "]");
    }
}
