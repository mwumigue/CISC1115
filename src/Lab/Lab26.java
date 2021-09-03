package Lab;

public class Lab26 {
    /**
     * method arrayMin takes in an array and finds the smallest number
     * @param array is taken into the method to be evaluated
     * @return minimum number inside the array
     */
    public static double arrayMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
