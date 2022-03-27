import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //create scanner
        Scanner scan = new Scanner(System.in);
        //create placeholder for the length of the array and read it
        int length = scan.nextInt();
        //now that you have the length initialise the array
        int[] numbersArray = new int[length];
        //go through the array putting the values read from scanner
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = scan.nextInt();
        }
        //create a variable to store the value we will be looking for and read it
        int search = scan.nextInt();
        //print the result of the called method that will do the job
        System.out.println(countElementTimesInArray(numbersArray, search));
    }


    //this method is responsible for calculation
    public static int countElementTimesInArray(int[] array, int value) {
        int result = 0;
        for (int element: array) {
            if (element == value) {
                result++;
            }
        }
        return result;
    }
}