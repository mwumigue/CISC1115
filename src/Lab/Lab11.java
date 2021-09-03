package Lab;
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user to input any even number
        System.out.println("Input any even number");
        int num = input.nextInt();

        while (num % 2 == 0) {
            System.out.println("You entered an even number\n");

            //Prompt user to input another even number
            System.out.println("Input any even number");
            num = input.nextInt();
        }
    }
}
