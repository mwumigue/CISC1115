package Lab;

public class Lab36 {
    public static void main(String[] args) {
        int[] nums = {10, 12, 12, 25, 36};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(checkDuplicates(nums)[i]);
        }
    }

    public static int[] checkDuplicates(int[] arr) {
        // checking for duplicates in an UNsorted array
        int size = 5, count = 0;
        int[] duplicateIndexes = new int[size];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateIndexes[count] = j;
                    count++;
                    //System.out.println("found a duplicate at locations " + i + " " +j
                    //+ " value is: " + arr[i]);
                }
            }
        }
        return duplicateIndexes;
    }
}
