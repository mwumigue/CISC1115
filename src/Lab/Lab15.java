package Lab;
import java.io.*;
import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) throws Exception {
        PrintWriter file = new PrintWriter("Lab15.txt");//Lab15.txt created
        Scanner input = new Scanner(System.in);

        //Ask the user how many numbers want to print
        System.out.println("How many numbers do you want to print?");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            file.println(i);//Output printed to Lab15.txt
        }
        file.close();
    }
}
