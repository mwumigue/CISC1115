package Lab;
import java.util.Scanner;
import java.io.*;

public class Lab25 {
    public static void main(String[] args) throws IOException {
        Scanner fileInput = new Scanner(new File("C:\\CISC1115\\src\\Lab\\Lab25Array.txt"));
        final int SIZE = 8;
        double [] doubleNumbers = new double[SIZE];
        int [] intNumbers = new int[SIZE];

        int i = 0;
        while (fileInput.hasNextDouble() && i < doubleNumbers.length) {
            doubleNumbers[i] = fileInput.nextDouble();
            intNumbers[i] = fileInput.nextInt();
            System.out.printf("%.2f%8d\n", doubleNumbers[i], intNumbers[i]);
            i++;
        }

    }
}
