package Homework;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //Description of the program
        System.out.println("This program allows the user to choose 3 different plans, and returns a specific offer " +
                "according to the user's election\n");
        //Prices variables declared and initialized
        double monthlyPrice;
        final double EXTRA_PHONE = 9.99; //Phone package set to $9.99
        final double COMPLETE_PACKAGE = 25; //Phone + TV package set to $25
        //Prompt user to choose a plan
        System.out.println("Plan A: Internet service only");
        System.out.println("Plan B: Internet + Phone");
        System.out.println("Plan C: Internet + Phone + TV");
        Scanner scan = new Scanner(System.in);
        System.out.println("What plan do you choose?");
        char plan = scan.next().charAt(0);
        //Prompt user to choose an internet speed
        System.out.println("Now choose a speed:");
        System.out.println("100 mbps $25");
        System.out.println("200 mbps $35");
        System.out.println("400 mbps $50");
        System.out.println("Speed:");
        int speed = scan.nextInt();
        System.out.println("You selected Plan " + plan + " speed " + speed);
        //If plan A gets chosen, it will only charge the internet speed price
        //If the user chooses 100 mbps of speed, the monthly cost will start from $25
        if (speed == 100) {
            monthlyPrice = 25;
            //If the user chooses 200 mbps of speed, the monthly cost will start from $35
        } else if (speed == 200) {
            monthlyPrice = 35;
            //If the user chooses 400 mbps of speed, the monthly cost will start from $50
        } else {
            monthlyPrice = 50;
        }
        //If plan B is chosen it will charge the internet speed plus the phone package ($9.99)
        if (plan =='B') {
            monthlyPrice = monthlyPrice + EXTRA_PHONE;
            //If plan C is chosen with 400 mbps internet, it will charge $65 for everything
        } else if (plan == 'C') {
            if (speed == 400) {
                monthlyPrice = 65;
            /*If plan C is chosen with 100 or 200 mbps internet, it will charge the internet speed plus the phone
            + TV package ($25) */
            } else {
                monthlyPrice = monthlyPrice + COMPLETE_PACKAGE;
            }
        }
        System.out.println("Price per month is $" + monthlyPrice + " Annual price $" + (monthlyPrice * 12));
    }
}
