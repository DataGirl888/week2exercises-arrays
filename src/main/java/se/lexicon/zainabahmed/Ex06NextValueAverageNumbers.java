package se.lexicon.zainabahmed;
/*6. Write a program which will set up an array to hold the next values in this
        order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        Expected output: Average is: 17.3*/


public class Ex06NextValueAverageNumbers {
    private static int[] averageArray = new int[] {43, 5, 23, 17, 2, 14};

    static public void averageNumber (){
        int average = 0;
        for (int element : averageArray){
            average += element;
        }
        // calculate average, format to one decimal place, replace 17,3 with 17.3, print to screen
        System.out.println("Average is: " + String.format("%.1f", (double)average/averageArray.length).replace(',','.'));
    }
}
