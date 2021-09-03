package Lab;
import java.util.Scanner;

public class Lab21 {
    public static void main(String[] args) {
        System.out.println("Average of 5 numbers: " + average(5));
        System.out.println("Average of 10 numbers: " + average(10));
    }

    /**
     * @param n (amount of numbers to be read in)
     * @return total/n
     * This method will read in n amount of numbers from the user and return the average
     */

    public static double average(int n) {
        Scanner input = new Scanner(System.in);
        double total = 0, numRead;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            numRead = input.nextDouble();
            total += numRead;
        }
        return total/n; //return average (total/amount of numbers read in)
    }
}
