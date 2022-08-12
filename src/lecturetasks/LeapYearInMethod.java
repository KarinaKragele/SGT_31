package lecturetasks;

import java.util.Scanner;

public class LeapYearInMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //these next 3 lines for reading
        System.out.println("Please enter any year");
        int year = scanner.nextInt(); //we read the input
        determinLeapYear(year); //we call the method - it is searching in the file for the method called determinLeapYear,
        // I will pass what was passed to me, will execute whatever inside and come back
        String result = determinLeapYear1(year);
        System.out.println(result);
    }
    public static void determinLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
    public static String determinLeapYear1(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return "Leap year";
        }else{
        } return "Not a leap year";
    }
}
