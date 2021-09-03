package Lab;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        boolean cont = true;

        Scanner input = new Scanner(System.in);
        //Prompt user to input any even number

        while (cont) {
            int sum = 0;
            System.out.println("Input any even number");
            int num = input.nextInt();

            while (num % 2 == 0) {
                sum = sum + num;

                //Prompt user to input another even number
                System.out.println("Please enter another even number");
                num = input.nextInt();
            }
            System.out.println("The sum of this group is " + sum);

            //Prompt user to answer whether to continue or not
            System.out.println("Do you want to continue? (Y/N)");
            char ans = input.next().charAt(0);

            if (ans == 'N' || ans == 'n'){
                cont = false;
            }
        }
    }
}
