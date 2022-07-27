package lecturetasks;

import java.util.Arrays;
import java.util.Scanner;

public class SumAllElements {
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int myArray[] = new int[size];

        for(int i = 0; i < size; i++ ){
            System.out.println("Please enter element number: " + (i+1));
            myArray[i] = scanner.nextInt();
           // sum += myArray[i];

        }
        System.out.print("Source Array: ");
        for(int i = 0; i < size; i++ ){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        //Printing out all array' s elements using For-each loop
        System.out.print("Source Array: ");
        for(int temp : myArray){
            System.out.print(temp + " ");
        }
        System.out.println("Sum of all elements: " + Arrays.stream(myArray).sum());

        // int sum = 0;
        // for (int i = 0; i < numberArray.length; i++){
        // sum += numberArray[i];
        // System.out.println(sum);

        //Karlis solution
        //int sum = 0; at the beginning
        // System.out.println("Sum of all elements : " + sum);
    }
}
