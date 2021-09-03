package Lab;
import java.util.Scanner;

public class Lab41 {
    public static void main(String[] args) throws Exception {
        String msg = "Hello, how are you? Today is the last official day of class.";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character to find: ");
        char findChar = input.next().toLowerCase().charAt(0);
        int countChar=0;
        // Solution 1: iterate through characters
        for (int i=0; i<msg.length(); i++) {
            if (msg.charAt(i) == findChar) {
                countChar++;
            }
        }
        System.out.println("numbers of characters: " + countChar);
        countChar=0;
        // Solution 2: use indexOf
        int loc = msg.indexOf(findChar);
        while (loc != -1) {
            countChar++;
            loc = msg.indexOf(findChar, loc+1);
        }
        System.out.println("numbers of characters: " + countChar);
    }
}
