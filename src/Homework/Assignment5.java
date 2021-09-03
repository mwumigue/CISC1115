package Homework;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Welcome! We are ready to process transactions for your account."); //Welcome Message
        Scanner input = new Scanner(System.in);
        double balance = 4000; //Initial balance set to $4000;
        int choice = menu(input);

        //Display menu until the user chooses to exit
        while (choice != 4) {
            //If the user chooses to withdraw
            if (choice == 1) {
                System.out.println("What is the amount to withdraw?");
                double withdrawAmount = input.nextDouble();
                //If the user tries to withdraw more than what is in the balance, nothing will be withdrawn.
                if (withdraw(balance, withdrawAmount) == -1) {
                    System.out.println("You do not have enough balance to withdraw this amount.");
                } else {
                    balance = withdraw(balance, withdrawAmount);
                    System.out.printf("$%.2f was withdrawn. Current balance is: $%.2f\n", withdrawAmount, balance);
                }
            //If the user chooses to deposit
            } else if (choice == 2) {
                System.out.println("What is the amount to deposit?");
                double depositAmount = input.nextDouble();
                balance = deposit(balance, depositAmount);
                System.out.printf("$%.2f was deposited. Current balance is: $%.2f\n", depositAmount, balance);
            //If the user chooses to check account balance (It will only accept a number greater than 0)
            } else if (choice == 3) {
                if (checkBalance(balance)) {
                    System.out.printf("There is a balance of $%.2f in your account\n", balance);
                } else {
                    System.out.println("There is no balance in your account");
                }
            }
            choice = menu(input);
        }
        System.out.println("Goodbye! Thank you for banking with us.");
        System.exit(1);
    }

    /**
     * Display menu
     * @param input - Scanner variable Main method
     * @return choice
     */
    public static int menu(Scanner input) {
        System.out.println("""
                What would you like to do?
                1. Withdraw
                2. Deposit
                3. Check if there is a balance in the account
                4. Exit
                Enter choice (1-4)""");
        return input.nextInt();
    }

    /**
     * Withdraw amount input by the user from the balance
     * @param balance - balance value in Main method
     * @param withdrawAmount - amount to be withdrawn from the account
     * @return new balance after withdrawn amount if withdrawAmount is less or equal to the balance, otherwise -1
     */
    public static double withdraw(double balance, double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            return balance;
        } else {
            return -1;
        }
    }

    /**
     * Deposit amount input by the user in the balance
     * @param balance - balance value in Main method
     * @param depositAmount - amount to deposit in the account
     * @return new balance after deposited amount
     */
    public static double deposit(double balance, double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
        }
        return balance;
    }

    /**
     * Check if there is balance in the account
     * @param balance - balance value in Main method
     * @return true if balance > 0, otherwise false
     */
    public static boolean checkBalance(double balance) {
        return balance > 0;
    }
}
