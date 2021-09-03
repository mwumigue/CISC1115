package Homework.Assignment8;
import java.util.Scanner;
import java.io.*;

public class Assignment8 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("C:\\CISC1115\\src\\Homework\\Assignment8\\Database.txt"));
        final int SIZE = 101;
        //Declare arrays for mailbox Ids, zipcodes, and weight of mails
        String[] mailboxIds = new String[SIZE], zipCodes = new String[SIZE];
        double[] weightOfMails = new double[SIZE];
        //Read in file into their respective array
        int num = readData(input, mailboxIds, weightOfMails, zipCodes);
        //Determine sum of weight in mail
        sumZipCode(mailboxIds,weightOfMails,zipCodes,num);
        input.close();
    }

    /**
     *
     * @param zipCode
     * @return true if zip code meets requirements and false if it does not
     */
    public static boolean validateZipCode(String zipCode) {
        int digitCount = 0;
        for (int i = 0; i < zipCode.length(); i++) { //Start counting from the 4th character in the word
            //only count digit if character is a digit (0-9)
            if (Character.isDigit(zipCode.charAt(i))) {
                digitCount++;
            } else {
                return false;
            }
        }
        if (digitCount == 5) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param input reads in values from database file
     * @param array1
     * @param array2
     * @param array3
     * @return size of array
     */
    public static int readData(Scanner input, String[] array1, double[] array2, String[] array3) {
        int i = 0;
        String mailboxID, zipCode;
        double weightOfMail;
        do {
            mailboxID = input.next();
            weightOfMail = input.nextDouble();
            zipCode = input.next();
            //only add information read in to the arrays if the mailbox id meets requirements
            if (validateZipCode(zipCode)) {
                array1[i] = mailboxID;
                array2[i] = weightOfMail;
                array3[i] = zipCode;
                i++;
            } else {
                System.out.println("ERROR Zip Code not valid: " + zipCode);
            }
        } while (input.hasNext() && i < array1.length);
        return i;
    }

    /**
     *
     * @param array1
     * @param array2
     * @param array3 evaluated for parallel sorting
     * @param num array size
     */
    public static void sortArray(String[] array1, double[] array2, String[] array3, int num) {
        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < num; j++) {
                if (Integer.parseInt(array3[minIndex]) > Integer.parseInt(array3[j])) {
                    minIndex = j;
                }
            }
            String temp = array1[i];
            array1[i] = array1[minIndex];
            array1[minIndex] = temp;

            double temporary = array2[i];
            array2[i] = array2[minIndex];
            array2[minIndex] = temporary;

            temp = array3[i];
            array3[i] = array3[minIndex];
            array3[minIndex] = temp;
        }
    }

    /**
     *
     * @param array1
     * @param array2 values added for duplicated zipcodes
     * @param array3 evaluate to find zip code duplicates
     * @param num array size
     */
    public static void sumZipCode(String[] array1 ,double[] array2, String[] array3, int num) {
        //sort array first to compare zip codes
        sortArray(array1, array2, array3, num);
        double total;
        int i = 0;
        //loop through zip code array and compare index value with next value
        while (i < num - 1) {
            total = array2[i]; //total initalized to value of array at a specific index
            while (array3[i].equals(array3[i+1])) {
                total += array2[i + 1];
                i++;
            }
            System.out.printf("The weight of all mail in the zip code " + array3[i] + " is: %.1f\n", total);
            i++;
        }
    }
}
