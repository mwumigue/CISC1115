package Lab;
import java.util.Scanner;

public class Lab30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        if (str1.equals(str2)) {
            System.out.println(str1 + " and " + str2 + " are equal");
        } else {
            System.out.println(str1 + " and " + str2 + " differ at location: " + differAt(str1,str2));
        }
    }

    public static int differAt(String s1, String s2) {
        String min;
        if (s1.length() < s2.length()) {
            min = s1;
        } else {
            min = s2;
        }
        for (int i = 0; i < min.length(); i++) {
            if(s1.charAt(i)!=(s2.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
