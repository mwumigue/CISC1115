package Homework;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String [] args) {
        //Description of the game
        System.out.println("Welcome to the Dice Spinning Game! In this game, each player will roll two dice. " +
                "The player with higher sum of numbers on the dice wins the round. " +
                "There is no winner in case of a tie.\n");

        Scanner input = new Scanner(System.in);
        boolean anotherRound = true; //Conditional variable set originally to yes
        int dice1, dice2, total1, total2; //Variables for the dice and their respective sum declared
        int player1Victories = 0, player2Victories = 0;//Player1 victories and Player2 victories set to 0

        while (anotherRound) { //As long as the user wants to play another round
            //Player1 turn
            dice1 = (int)(Math.random() * 6) + 1; //Choose a random number from 1-6
            dice2 = (int)(Math.random() * 6) + 1; //Choose another random number from 1-6
            total1 = dice1 + dice2; //Total number for Player1
            System.out.println("Player 1 got " + dice1 + " and " + dice2 + ". Total = " + total1);

            //Player2 turn
            dice1 = (int)(Math.random() * 6) + 1; //Choose a random number from 1-6
            dice2 = (int)(Math.random() * 6) + 1; //Choose another random number from 1-6
            total2 = dice1 + dice2; //Total number for Player2
            System.out.println("Player 2 got " + dice1 + " and " + dice2 + ". Total = " + total2);

            //If Player1 number is higher, Player1 will win the round and the victory counter for Player1 will go up
            if (total1 > total2) {
                System.out.println("Player1 won this round!");
                player1Victories++;
            //If Player2 number is higher, Player2 will win the round and the victory counter for Player2 will go up
            } else if (total1 < total2) {
                System.out.println("Player2 won this round!");
                player2Victories++;
            //In case there is a tie there is no winner
            } else {
                System.out.println("This round was a tie!");
            }

            //Ask the user whether to continue playing or not
            System.out.println("Do you want to play another round? (Y/N)");
            char answer = input.next().charAt(0);

            /* Until the user answer yes or no, the computer will display an error message and ask the user whether to
            continue playing or not*/
            while (!(answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n' )) {
                System.out.println("ERROR");
                System.out.println("Do you want to play another round? (Y/N)");
                answer = input.next().charAt(0);
            }

            /*In case the player chooses not to continue playing, the game will stop and the computer will display how
            many rounds each player won*/
            if (answer == 'N' || answer == 'n') {
                anotherRound = false;
                System.out.println("Player1 got " + player1Victories + " victories and Player2 got " + player2Victories
                        + " victories.");
            }
        }
    }
}
