package homework;

import java.util.Scanner;

public class HW6Arrays {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        if(size >0){
            System.out.println("Enter the elements of the array one by one");
            for(int i = 1; i <= size; i++){
                System.out.println("Please enter element number: " + i);
                int element = scanner.nextInt();
                //sizeArray[0] = 1;
                //System.out.print("Source Array: " + sizeArray[size] + " ");
            } //int[] sizeArray = new int[size];
            //System.out.print("Source Array: " + sizeArray[???] + " ");
        }else{
            System.out.println("Please check the number, it should be positive");
        }
    }
}
