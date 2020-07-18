package se.lexicon.zainabahmed;
import java.util.Random;
import java.util.Arrays;

/*   13. Create two arrays with arbitrary size and fill one with random numbers.
           Then copy over the numbers from the array with random numbers so
           that the even numbers are located in the rear (the right side) part of the
           array and the odd numbers are located in the front part (the left side).*/


public class Ex13RandomSizeCopyArray {
    static Random rnd = new Random();
    private static int [] randomArray = new int[rnd.nextInt(20)];

    public static int[] getRandomArray() {
        return randomArray;
    }

    public static int[] fillRandomArray(int [] randomArray){
       int [] arrangedArray =new int [randomArray.length];
       int [] oddNumbers =new int [randomArray.length];
       int [] evenNumbers =new int [randomArray.length];
        int [] finallySortedArray =new int [randomArray.length];
        //        Arrays.fill(randomArray, rnd.nextInt(200));
        System.out.println("Random Array of length : " + randomArray.length);
        int evenCount=0, oddCount =0, k=0;
        for(int number : randomArray ){
            number = rnd.nextInt(200);
            System.out.print(number + " ");
            arrangedArray[k] = number;
            if(number%2==0){
                evenNumbers[k] = number;
                evenCount++;
            }
            if(number%2 !=0){
                oddNumbers[k] = number;
                oddCount++;
            }

            //System.out.print(number + "n ");
            //System.out.print(arrangedArray[k] + "k ");
            k++;
        }
        Arrays.sort(oddNumbers);
        Arrays.sort(evenNumbers);
        oddNumbers = Arrays.copyOfRange(oddNumbers, oddNumbers.length-oddCount, oddNumbers.length-1 );
        evenNumbers = Arrays.copyOfRange(evenNumbers, evenNumbers.length-evenCount, evenNumbers.length-1);
        finallySortedArray = Arrays.copyOf(oddNumbers,oddNumbers.length);
        finallySortedArray = Arrays.copyOf(finallySortedArray, oddNumbers.length+evenNumbers.length-2);
        System.out.println("=======");
        for (int finallyDone : finallySortedArray){
            System.out.print(" F" + finallyDone);
        }
        System.out.println("=======");
        for (int oddN : oddNumbers){
            System.out.print(" odd" + oddN);
        }
        System.out.println();
        for (int evenN : evenNumbers){
            System.out.print(" ev" + evenN);
        }
        System.out.println(" EVEN" + evenCount+" ODD" +oddCount );

        //not using oddEven method, rearranging here as randomArray resets to 0 with correct size when passed??

        return randomArray;
    }
//    public static void printArray(int [] randomArray){
//        int[] savingThing = randomArray;
//        for (int i =0; i<randomArray.length; i++){
//            System.out.print(randomArray[i] + " ");
//        }
//    }
    public static int[] arrangeEvenOdd(){
        int [] sortingArray = fillRandomArray(getRandomArray());

        int [] oddEvenArray = new int [sortingArray.length];
//        for( int number : sortingArray) {
//            System.out.print("SA" + number + " ");
//        }

            for (int i =0, j= sortingArray.length-1; i < sortingArray.length-1; i++,j--){
            if ((sortingArray[i] % 2) != 0){
                oddEvenArray[i] = sortingArray[i];
            }
            else {
                oddEvenArray[j] = sortingArray[i];
            }
        }
        for( int number : sortingArray){
            System.out.print(number + " ");
        }
        return oddEvenArray;
    }

}
