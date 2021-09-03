package Lab;

public class Lab38 {
    public static void main(String[] args) {

    }
    public static void sortArray(String[] arr, int size) {
        // each iteration of the outer loop, searches for the value
        // that belongs at location i. (i.e. min of all values from i to end)
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i; // initialize minIndex to i
            // j iterates through rest of array and finds min
            for (int j = i+1; j < size; j++) {
                if (arr[minIndex].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            // fell out of j loop, but still inside the i loop
            // swap elt at minIndex with elt at i
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
