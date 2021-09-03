package Lab;

public class Lab24 {
    public static void main (String[] args) {
        final int SIZE = 5; //Array size
        double [] numbers = new double[SIZE]; //New double type array

        //Numbers assigned to every spot of the array
        numbers[0] = 0.1;
        numbers[1] = 2.7;
        numbers[2] = 8.7;
        numbers[3] = 19.2;
        numbers[4] = 10.1;

        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Max: " + max);
    }
}
