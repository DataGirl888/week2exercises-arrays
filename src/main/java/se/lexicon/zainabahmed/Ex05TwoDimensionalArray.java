package se.lexicon.zainabahmed;
        /** Exercise 5 2D array
         * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d
                array containing any Country and City.
                Expected output: France Paris
                                 Sweden Stockholm
         */
public class Ex05TwoDimensionalArray {
        private static String[][] countryCity = new String[][]{     //= new String[2][2];
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };

public static void displayCapitals(){
        for (String[] rows : countryCity) {
                for (int column = 0; column < rows.length; column++) {
                        System.out.print(rows[column] + " ");
                }
                System.out.println(" ");
        }

 // INITIALIZING VALUES WITH LOOPS

//        private static String[] cities = new String []{"Paris", "Stockholm"};
//        private static String[] countries = new String []{"France", "Sweden"};
//
//        public static void populateCities(){
//                for (int row =0; row < countryCity.length; row++){
//                        for(int column= 0; column<countryCity[row].length; column++){
//                            countryCity[row] [column]= cities[row];
//                                System.out.println(cities[row]);
//                        }
//
//                }
//                for (String capital : cityCountry){
//                        for (String country : countries){
//                        }

        }

//        public static void numberGrid(){
//                int[][] numberSquare = new int[10][10];
//                int[] tens = new int[]{1,2,3,4,5,6,7,8,9,10};
//                int[] twenties = new int[]{11,12,13,14,15,16,17,18,19,20};
//
//                for (int i=0; i < tens.length-1; i++){
//                        for (int j =0; j<twenties.length-1; j++){
//                                numberSquare[i][j] = tens[j];
//                                System.out.print(numberSquare[i][j] + "-");
//                        }
//                        System.out.println("*");
//                        numberSquare[i][twenties.length+1-i] = twenties[i];
//                        System.out.print(numberSquare[i][twenties.length+1-i]);
//                }
//        }
}
