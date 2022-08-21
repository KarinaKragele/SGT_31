package homework;

import java.util.Scanner;

public class HW11RockPaperScissors {
    public static void main(String[] args) {
        //Started with Scanner to ask players what they choose
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 please choose rock, paper or scissors");
        String player1 = scanner.nextLine().trim().toLowerCase(); //used this trim & lowercase as we did with Palindrome
        System.out.println("Player 2 please choose rock, paper or scissors");
        String player2 = scanner.nextLine().trim().toLowerCase();

        //Then started to think that I can eliminate what kind answers from players I can get. But as it was not in the task, decided not to lose so much time on this
        /*String[] replies = new String[3];
        replies[0] = "rock";
        replies[1] = "paper";
        replies[2] = "scissors";*/

        if (player1.equals(player2)) { //here took some time to understand how I can compare string values, not numbers
            System.out.println("TIE");
        } else if(player1.equals("rock") && player2.equals("paper")){
            System.out.println("Player 2 wins!");
        } else if(player1.equals("paper") && player2.equals("rock")){
            System.out.println("Player 1 wins!");
        } else if (player1.equals("paper") && player2.equals("scissors")) {
            System.out.println("Player 2 wins!");
        } else if (player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("Player 1 wins!");
        } else if (player1.equals("rock") && player2.equals("scissors")) {
            System.out.println("Player 1 wins!");
        } else if (player1.equals("scissors") && player2.equals("rock")) {
            System.out.println("Player 2 wins!");
        }

    }
        //Was thinking about switch, too at some point
        //switch (player1,player2)


}
