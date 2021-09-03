package Lab;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer = 'y';
        while (!(answer == 'n' || answer =='N')) {
            System.out.println("Lets play!");

            System.out.println("Continue? (y/n): ");
            answer = scanner.next().charAt(0);
        }
    }
}
