package Lab;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask the user how many numbers want to print
        System.out.println("How many numbers do you want to print?");
        int num = input.nextInt();

        System.out.println("Here are your numbers:");
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
