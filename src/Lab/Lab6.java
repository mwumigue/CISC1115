package Lab;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        //Employee 1
        // 1. read in hours and pay per hour
        Scanner scanner = new Scanner(System.in);
        double hours, payRate;
        System.out.println("Enter hours and pay rate for Employee 1: ");
        hours = scanner.nextDouble();
        payRate = scanner.nextDouble();
        System.out.println("You entered " + hours + " hours and "
                + payRate + " rate.");
        // 2. calculate pay for the week
        double grossPay = hours * payRate;
        // 3. subtract taxes (pay < $500 tax is 10%, and pay >= $500 tax is 13%)
        double taxes;
        if (grossPay < 500) {
            taxes = .1 * grossPay;
        }
        else {
            taxes = .13 * grossPay;
        }
        // 4. print gross pay and net pay
        double netPay = grossPay - taxes;
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Net Pay: " + netPay + "\n");

        //Employee 2
        // 1. read in hours and pay per hour
        System.out.println("Enter hours and pay rate for Employee 2:");
        hours = scanner.nextDouble();
        payRate = scanner.nextDouble();
        System.out.println("You entered " + hours + " hours and "
                + payRate + " rate.");
        // 2. calculate pay for the week
        grossPay = hours * payRate;
        // 3. subtract taxes (pay < $500 tax is 10%, and pay >= $500 tax is 13%)
        if (grossPay < 500) {
            taxes = .1 * grossPay;
        }
        else {
            taxes = .13 * grossPay;
        }
        // 4. print gross pay and net pay
        netPay = grossPay - taxes;
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Net Pay: " + netPay);
    }
}
