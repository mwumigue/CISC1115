package Lab;
import java.util.Scanner;

public class Lab33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String msg = input.nextLine();
        System.out.print("Enter location: ");
        int n = input.nextInt();

        for (int i = n; i< msg.length() - 5; i+=n) {
            System.out.println("The 5 letters of location " + i + " are: " + msg.substring(i, i+5));
        }
    }
}
