package Lab;

public class Lab23 {
    public static void main(String[] args) {
        final int SIZE = 5; //Array size
        double [] numbers = new double[SIZE]; //New double type array

        //Numbers assigned to every spot of the array
        numbers[0] = 0.1;
        numbers[1] = 3.5;
        numbers[2] = 6.9;
        numbers[3] = 7.8;
        numbers[4] = 10.1;

        //Print all the numbers in the array
        for (int i = 0; i < SIZE; i++) {
            System.out.println(numbers[i]);
        }
    }
}
