package Lab;
import java.util.Scanner;

public class Lab37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num = input.nextInt();
        for (int i = 0; Math.pow(2,i) < num; i++) {
            System.out.println(Math.pow(2,i));
        }
    }
}
