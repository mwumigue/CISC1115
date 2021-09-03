package Homework.Assignment6;
import java.util.Scanner;
import java.io.*;

public class Assignment6 {
    public static void main(String[] args) throws IOException {
        //New Scanner and PrintWriter assigned to input and output files respectively
        Scanner input = new Scanner(new File("C:\\CISC1115\\src\\Homework\\Assignment6\\Database.txt"));
        PrintWriter pw = new PrintWriter("C:\\CISC1115\\src\\Homework\\Assignment6\\OutputFile.txt");

        //Read in the number of lines inside of the input file
        int n = 0;
        while (input.hasNextLine()) {
            input.nextLine();
            n++;
        }

        //prizeIds and ticketsBought declared as new arrays
        int [] prizeIds = new int[n];
        int [] ticketsBought = new int[n];
        readInfo(prizeIds,ticketsBought,n); //Store input file data inside prizeIds and ticketsBought
        pw.println("Total tickets bought: " + sumArray(ticketsBought)); //Find total of tickets bought
        pw.println("Prize id with most tickets bought: " + findMost(prizeIds,ticketsBought)); //Find prizeId with most tickets bought
        printArrays(prizeIds,ticketsBought,pw); //Print PrizeIds and ticketsBought
        pw.close();
    }

    /**
     * Reads in data from input file
     * @param array1 stores the first column of the data file
     * @param array2 stores the second column of the data file
     * @param k indicates the number of lines inside the data file
     * @throws IOException for Scanner
     */
    public static void readInfo(int [] array1, int [] array2, int k) throws IOException{
        Scanner input = new Scanner(new File("C:\\CISC1115\\src\\Homework\\Assignment6\\Database.txt"));
        int i = 0;
        while (input.hasNextInt() && i < k) {
            array1[i] = input.nextInt();
            array2[i] = input.nextInt();
            i++;
        }
    }

    /**
     *
     * @param array --> ticketsBought
     * @return sum of elements inside the array
     */
    public static int sumArray(int [] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    /**
     *
     * @param array1 --> prizeIds
     * @param array2 --> ticketsBought
     * @return prizeId for maximum amount of ticketsBought
     */
    public static int findMost(int [] array1, int [] array2) {
        int max = array2[0];
        int maxID = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
                maxID = array1[i];
            }
        }
        return maxID;
    }

    /**
     *
     * @param array1 --> prizeIds
     * @param array2 --> ticketsBought
     * @param pw prizeIds and ticketsBought to outputFile.txt
     */
    public static void printArrays(int [] array1, int [] array2, PrintWriter pw) {
        pw.printf("%s%30s\n","Prize ID","Amount of tickets bought");
        for (int i = 0; i < array1.length; i++) {
            pw.printf("%8d%30d\n",array1[i],array2[i]);
        }
    }
}
