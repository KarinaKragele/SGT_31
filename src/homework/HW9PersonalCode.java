package homework;

import com.sun.source.tree.PatternTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW9PersonalCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';
        while(runAgain == 'y') {

            System.out.println("Enter your personal number");
            String input = scanner.nextLine().trim();
            Pattern pattern = Pattern.compile("[0-9]{6}-?[0-9]{5}"); //"?" means we accept number with "-" or w/t "-"
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.println("Your inputted personal number is valid");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check your personal number again? y/n");
            runAgain = scanner.next().charAt(0);
            scanner.nextLine();
        }




    }
}
