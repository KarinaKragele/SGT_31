package homework;

import java.util.Scanner;

public class HW11RockPaperScissorsSpockLizard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 please choose rock, paper, scissors, spock or lizard");
        String player1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Player 2 please choose rock, paper, scissors, spock or lizard");
        String player2 = scanner.nextLine().trim().toLowerCase();

        if (player1.equals(player2)) {
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
        }else if (player1.equals("spock") && player2.equals("lizard")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("lizard") && player2.equals("spock")) {
            System.out.println("Player 1 wins!");
        }else if (player1.equals("scissors") && player2.equals("lizard")) {
            System.out.println("Player 1 wins!");
        }else if (player1.equals("lizard") && player2.equals("scissors")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("lizard") && player2.equals("rock")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("rock") && player2.equals("lizard")) {
            System.out.println("Player 1 wins!");
        }else if (player1.equals("paper") && player2.equals("lizard")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("lizard") && player2.equals("paper")) {
            System.out.println("Player 1 wins!");
        }else if (player1.equals("scissors") && player2.equals("spock")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("spock") && player2.equals("scissors")) {
            System.out.println("Player 1 wins!");
        }else if (player1.equals("rock") && player2.equals("spock")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("spock") && player2.equals("rock")) {
            System.out.println("Player 1 wins!");
        }else if (player1.equals("spock") && player2.equals("paper")) {
            System.out.println("Player 2 wins!");
        }else if (player1.equals("paper") && player2.equals("spock")) {
            System.out.println("Player 1 wins!");
        }
    }
}
