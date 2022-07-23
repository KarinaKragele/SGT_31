package homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int num1 = scanner.nextInt();

        System.out.println("Input the 2st number:");
        int num2 = scanner.nextInt();
        System.out.println("Input the 3st number:");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("The greatest: " + num1);
        } else if (num2 > num3){
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("The greatest:" + num3);
        }
    }
}
