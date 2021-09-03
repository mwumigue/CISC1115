package Lab;
import java.util.Scanner;

public class Lab28 {
    public static void main(String[] args) {
        int [] emplIds = {14845,31021,21034,58302,20319,20121};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int inputID = input.nextInt();
        System.out.println("ID Location: " + linearSearch(emplIds,inputID));
    }

    public static int linearSearch(int[] array, int key) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
