package Lab;
import java.util.Scanner; //Scanner class called

public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //New scanner declared
        //First number
        System.out.println("Enter your first number");
        double num1 = scan.nextDouble();
        //Second number
        System.out.println("Enter your second number");
        double num2 = scan.nextDouble();
        //Third number
        System.out.println("Enter your third number");
        double num3 = scan.nextDouble();
        System.out.println("All three numbers add to: " + (num1 + num2 + num3));
    }
}
