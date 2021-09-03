package Lab;
import java.util.Scanner;

public class Lab31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String msg = input.nextLine(), str = "aaa";

        if (msg.compareTo(str) < 0) {
            System.out.println(msg + " comes first");
        } else if (msg.compareTo(str) > 0) {
            System.out.println(str + " comes first");
        } else {
            System.out.println(msg + " and " + str + " are equal");
        }

        msg = msg.toLowerCase();
        System.out.println("Lowercase message: " + msg);

        if (msg.compareTo(str) < 0) {
            System.out.println(msg + " comes first");
        } else if (msg.compareTo(str) > 0) {
            System.out.println(str + " comes first");
        } else {
            System.out.println(msg + " and " + str + " are equal");
        }
    }
}
