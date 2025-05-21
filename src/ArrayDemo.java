import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public void printArray(int[] myArray) {
        for (int value : myArray) {
            System.out.print(value + " ");


        }
        System.out.println(); // For a new line after printing the array
    }

    public void arrayDemo() {
        Scanner SC = new Scanner(System.in);
        int[] myArray = new int[5];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < 5; i++) {
            int numb = SC.nextInt();
            myArray[i] = numb;
        }
        System.out.println(myArray.length);


        // Printing the array using both methods for demonstration
        printArray(myArray);
    }

    public static void main(String[] args) {
        ArrayDemo A = new ArrayDemo();
        A.arrayDemo();
    }
}
