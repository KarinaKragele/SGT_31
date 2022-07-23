package homework;

import java.util.Scanner;

public class Homework4Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        if (year > 0){
            if (year % 400 == 0) {
                System.out.println("Leap year");
            } else if (year % 100 == 0){
                System.out.println("Not a leap year");
            } else if (year % 4 ==0){
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Please check the number, it should be positive");
        }
    }


}
