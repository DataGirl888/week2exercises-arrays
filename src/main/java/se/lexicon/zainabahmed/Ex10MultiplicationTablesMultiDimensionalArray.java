package se.lexicon.zainabahmed;

/**
 * 10.Write a program which will represent multiplication table stored in
 * multidimensional array.
 * Hint: You have two-dimensional array with values
 * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 */
public class Ex10MultiplicationTablesMultiDimensionalArray {
private static int[] factorRow    = {1,2,3,4,5,6,7,8,9,10};
private static int[] factorColumn = {1,2,3,4,5,6,7,8,9,10};
private static int[][] multiplicationTable = new int[factorRow.length][factorColumn.length];

public static void multiplyNumbers(){
    for(int rows =0,i=0; rows<multiplicationTable.length; rows++, i++){
        for (int columns =0, j=0; columns < multiplicationTable[rows].length; columns++,j++){
            multiplicationTable[rows][columns] = factorRow[i]*factorColumn[j];
            System.out.print(multiplicationTable[rows][columns] + " ");
        }
        System.out.println("*");
    }
}
}
