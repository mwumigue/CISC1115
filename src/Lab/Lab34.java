package Lab;
import java.util.Scanner;

public class Lab34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        if (isRepeated(sentence)) {
            System.out.println("There are characters repeated");
        } else {
            System.out.println("There are no characters repeated");
        }
    }

    public static boolean isRepeated (String sentence) {
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == sentence.charAt(i+1) && sentence.charAt(i) != ' ') {
                return true;
            }
        }
        return false;
    }
}
