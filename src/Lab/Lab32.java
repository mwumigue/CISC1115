package Lab;
import java.util.Scanner;

public class Lab32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String msg = input.nextLine();

        int count = 0;
        int loc = msg.indexOf(' ');
        while (loc != -1) {
            count++;
            loc = msg.indexOf(' ', loc + 1);
        }

        System.out.println(msg + " has " + count + " spaces");
    }
}
