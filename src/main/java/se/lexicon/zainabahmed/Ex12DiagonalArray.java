package se.lexicon.zainabahmed;
/*12.Write a program which will print the diagonal elements of two dimensional array.
        Expected output: 1 4 9*/
public class Ex12DiagonalArray {
    private static int [][] numberGrid = {
                        {1,   2,  3,  4,  5,  6,  7,  8,  9, 10},
                        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                        {31, 32, 33, 34, 35, 36, 37, 38, 39, 30},
                        {41, 42, 43, 44, 45, 46, 47, 48, 49, 40},
                        {51, 52, 53, 54, 55, 56, 57, 58, 59, 50},
                        {61, 62, 63, 64, 65, 66, 67, 68, 69, 60},
                        {71, 72, 73, 74, 75, 76, 77, 78, 79, 70},
                        {81, 82, 83, 84, 85, 86, 87, 88, 89, 80},
                        {91, 92, 93, 94, 95, 96, 97, 98, 99,100},
                        };

    public static int[][] getNumberGrid() {
        return numberGrid;
    }

    public static void diagonalValues(int[][] numberGrid){
        StringBuilder diagonals = new StringBuilder("Diagonal values: ");
        for(int row = 0, column = 0; row < numberGrid.length; row++, column++) {
            if(row == column)
            diagonals.append(numberGrid[row][column]).append(" ");
        }
        System.out.println(diagonals);
    }
}
