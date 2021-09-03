package Lab;
import java.util.Scanner;
import java.io.*;

public class Lab39 {
    public static void main(String[] args) throws Exception {

        String filename;
        System.out.println("Enter a file name for input: ");
        Scanner sc = new Scanner(System.in);
        filename = sc.next();
        Scanner infile = new Scanner(new File(filename));
        final int CAPACITY = 100;
        // declare arrays
        String[] lastNames = new String[CAPACITY];
        String[] firstNames = new String[CAPACITY];
        String[] phoneNumbers = new String[CAPACITY];
        // n holds the number of elts in the array
        int n = readData(lastNames, firstNames, phoneNumbers, infile);
        printArrays(lastNames, firstNames, phoneNumbers, n);
        sortArray(lastNames, firstNames, phoneNumbers, n);
        System.out.println("\nSorted array: ");
        printArrays(lastNames, firstNames, phoneNumbers, n);
        infile.close();
    }
    /**
     * This method prints a partially filled array.
     * @param arr
     * @param arr2
     * @param k  -- number of elts in the arrays
     */
    public static void printArrays(String[] arr, String[] arr2, String[] arr3, int k) {
        if (k > arr.length) return;
        for (int i=0; i<k; i++) {
            System.out.println(arr[i] + " " + arr2[i] + " " + arr3[i]);
        }
    }
    /**
     *
     * @param arr1
     * @param arr2
     * @param sc
     * @return
     */
    public static int readData(String[] arr1, String[] arr2, String[] arr3, Scanner sc) {
        int numElts=0;
        while(sc.hasNext() && numElts < arr1.length) {
            arr1[numElts]=sc.next();
            arr2[numElts]=sc.next();
            arr3[numElts]=sc.next();
            numElts++;
        }
        return numElts;
    }
    /**
     *
     * @param arr a String array
     */
    public static void sortArray(String[] arr, String[] arr2, String[] arr3, int k) {
        // each iteration of the outer loop, searches for the value
        // that belongs at location i. (i.e. min of all values from i to end)
        for (int i = 0; i < k - 1; i++) {
            int minIndex = i; // initialize minIndex to i
            // j iterates through rest of array and finds min
            for (int j = i+1; j < k; j++) {
                if (arr[minIndex].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            // fell out of j loop, but still inside the i loop
            // swap elt at minIndex with elt at i
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            // now parallel swap second array
            temp = arr2[i];
            arr2[i] = arr2[minIndex];
            arr2[minIndex] = temp;
            // swap third array
            temp = arr3[i];
            arr3[i] = arr3[minIndex];
            arr3[minIndex] = temp;
        }
    }
}
