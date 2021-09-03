package Lab;

public class Lab29 {
    public static void main(String[] args) {
        int [] emplIds = {14845,20121,20319,21034,31021,58302}; //Employee Ids
        if (isSorted(emplIds)) {
            System.out.println("This array is sorted");
        } else {
            System.out.println("This array is NOT sorted");
        }
    }

    /**
     * This method checks if an array is sorted or not
     * @param array evaluates an integer array
     * @return whether the array is sorted or not
     */
    public static boolean isSorted (int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
}
