package Lab;
import java.util.Scanner;
import java.io.*;

public class Lab40 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        int[] counters = new int[101], numbers = new int[SIZE]; // zeroed out automatically
        System.out.println("Enter a set of numbers from 0-100, -1 to exit:");
        numbers[0] = scanner.nextInt();
        int i = 0;
        while (numbers[i] !=-1) {
            i++;
            numbers[i] = scanner.nextInt();
        }
        counter(numbers, counters);
        for (int j=0; j<counters.length; j++) {
            System.out.println(i + ":" + counters[j]);
        }
    }

    public static void counter(int[] array1, int[] array2) {
        int i=0;
        while (array1[i] != -1) {
            array2[array1[i]]++; // increments the counter at location number
            i++;
        }
    }
}
