package homework;
import java.util.Scanner;

public class HW8Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine().trim();
        name = name.toLowerCase();

        //System.out.println(name.charAt((0)));
        //System.out.println(name.charAt(name.length()-1));
        int length = name.length();
        for (int i = 0; i < (length / 2); i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                System.out.println(name + " is not a palindrome");
                break;
            } else {
                System.out.println(name + " is a palindrome");
                break;
            }
        } //WRONG solution
    }
}
