package Lab;
import java.util.Scanner;

public class Lab19 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10) + 1; //
        int tries = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number I am thinking (1-10). You have " + tries + " tries.");
        int guess = input.nextInt();

        while ((!isTheNumber(guess, num)) && tries > 1) {
            tries --;
            System.out.println("Your guess is incorrect. You have " + tries + " tries left.");
            System.out.println("Guess the number I am thinking:");
            guess = input.nextInt();
        }

        if (isTheNumber(guess, num)) {
            System.out.println("Your guess is correct");
        }

        System.out.println("The number is " + num + ".");
    }

    public static boolean isTheNumber(int guess, int num) {
        return num == guess;
    }

}

