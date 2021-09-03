package Lab;

public class Lab22 {
    public static void main(String[] args) {
        //4 number variables declared and initialized
        double num1 = 45;
        double num2 = 65.7;
        double num3 = 65.8;
        double num4 = 35;

        //max variable initialized to 0
        double max = 0;

        //Compared every number to max
        if (num1 > max) {
            max = num1;
        }

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        if (num4 > max) {
            max = num4;
        }

        System.out.println("The maximum number is: " + max);
    }
}
