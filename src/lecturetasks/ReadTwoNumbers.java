package lecturetasks;

import java.util.Scanner;
/*Write an application, that will read two numbers from user (of type int)
and will print true, if both numbers are the same sign (both are positive,
or both are negative), or false otherwise. If at least one of given numbers
is equal to 0, your application should print false.*/
public class ReadTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int input1 = scanner.nextInt();

        System.out.println("Please enter second number");
        int input2 = scanner.nextInt();

        // if(input1 > 0 && input2 > 0)
        // if(input1 < 0 && input2 < 0)
        if((input1 > 0 && input2 > 0) || (input1 < 0 && input2 < 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
