package lecturetasks;

import java.util.Scanner;

public class StringInputPractise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name and Age (John 30)");

        //Read string from the user and get rid of space (trim)
        //Get substring of last two characters in the string
        //Convert those to integer
        //If age is over 70 then print "Senior", if not then "Adult"

        /*String data = scanner.nextLine().trim();
        System.out.println(Integer.parseInt(data.substring(data.length()-2)));

        if(Integer.parseInt(data.substring(data.length()-2) >= 70){
            System.out.println("Senior");
        } else{
            System.out.println("Adult");
        }*/

        //Solution
       String input = scanner.nextLine().trim();
        System.out.println("Substring " + input.substring(input.length()-2));
       int age = Integer.parseInt(input.substring(input.length()-2));
        //System.out.println(age *2);
        if(age > 70){
            System.out.println("Senior");
        }else{
            System.out.println("Adult");
        }
    }
}
