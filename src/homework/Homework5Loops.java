package homework;

import java.util.Scanner;

public class Homework5Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = scanner.nextInt();
        if (num >=0){
            while (num >= 0) {
                System.out.print(num + " ");
                num = num -1;
            }
        } else {
            while(num <= 0){
                System.out.print(num + " ");
                num = num +1;
            }
        }
    }
}
