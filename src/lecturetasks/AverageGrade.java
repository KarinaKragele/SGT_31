package lecturetasks;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        System.out.println("Enter the required size of the array :: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        float sum = 0;

        float myArray[] = new float[size];

        for(int i = 0; i < size; i++ ){
            System.out.println("Please enter element number: " + (i+1));
            myArray[i] = scanner.nextFloat();
            sum += myArray[i];

        }
        System.out.print("Source Array: ");
        for(int i = 0; i < size; i++ ){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        //Printing out all array' s elements using For-each loop
        System.out.print("Source Array: ");
        for(float temp : myArray){
            System.out.print(temp + " ");
        }
        System.out.println("Average grade: " + sum/myArray.length);
        System.out.println("There was passed " + myArray.length + " values");
    }

}
