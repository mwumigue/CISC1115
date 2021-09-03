package Lab;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args){
        //Prompt user to input number
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any integer");
        int num = scan.nextInt();

        //If number is not divisible by 3 or less than 100
        if (num%3 != 0 || num < 100){
            System.out.println(num + " satisfies the requirements");
        } else {
            System.out.println(num + " does not satisfy the requirements");
        }
    }
}
