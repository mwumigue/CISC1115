package Lab;
import java.util.Scanner; //Scanner class called

public class Lab5 {
    public static void main(String[] args) {
        final int GRADE_STANDARD = 65; //Constant variable for grade
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = scan.nextInt(); //Grade input variable initialized
            //If student's grade is equal or above 65, a passing message will be printed
        if (grade >= GRADE_STANDARD) {
            System.out.println("You passed. Congratulations!");
            //Otherwise, a failing message will be printed
        } else {
            System.out.println("You failed. Try better next time.");
        }
    }
}
