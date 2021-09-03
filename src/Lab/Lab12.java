package Lab;
import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        int count = 0, sum = 0; //count and sum variables set to 0

        //Prompt the user to input a number
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number. Negative numbers will end the program");
        int num = input.nextInt();

        while (num >= 0) {
            System.out.println("You entered: " + num);
            count++;
            sum = sum + num;//Add the entered number to the total

            //Prompt the user to input another number
            System.out.println("Input any number. Negative numbers will end the program");
            num = input.nextInt();
        }
        System.out.println("The program has counted " + count + " numbers. The total is " + sum +
                ". Your average is " + (sum/count));
    }
}
