/**
 *  Name: Lillian Hill
 *  Date: 11/19/2024
 *  Updated On: 11/23/2024
 *  Desc: Generate a random word from the words file and let user guess it. The user 
 *        is allowed 7 wrong answers before the game is over, and for every wrong  
 *        answer a new part of the hangman is drawn. 
 */

import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}