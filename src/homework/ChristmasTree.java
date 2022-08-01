package homework;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter tree size");
        int size = scanner.nextInt();

        //Each level
        for(int i = 0; i< size; i++){

            //We need spaces, in each line it will be different
            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }

            //Move to the next line
            System.out.println();
        }
        //Base level
        for(int i = 0; i < size -1; i++){
            System.out.print(" ");
        }
        System.out.println("#");
    }

}
