package Homework.Assignment7;
import java.util.Scanner;
import java.io.*;

public class Assignment7 {
    public static void main(String[] args) throws IOException{
        //Scanner connected to database file to read and determine array size
        File inputFile = new File("C:\\CISC1115\\src\\Homework\\Assignment7\\Database.txt");
        Scanner input = new Scanner(inputFile);
        //Determine array size
        int size = readSize(input);
        //Arrays for Sticker Ids and Names declared
        String[] stickerIds = new String[size], stickerNames = new String[size];
        input.close();
        //Open new scanner to read data into arrays
        input = new Scanner(inputFile);
        readData(input,stickerIds,stickerNames);
        //Open new scanner to find player name
        input = new Scanner(System.in);
        System.out.print("Enter name you want to find: ");
        String findName = input.nextLine();
        for (int j = 0; j < find(findName,stickerNames).length; j++) {
            System.out.println("Name found at location: " + find(findName, stickerNames)[j]);
        }
        input.close();
    }

    /**
     *
     * @param input reads how many lines the file has
     * @return array size
     */
    public static int readSize(Scanner input) {
        int size = 0;
        String playerID;
        while (input.hasNext()) {
            playerID = input.next();
            if (validatePlayer(playerID)) {
                size++;
            }
            input.nextLine();
        }
        return size;
    }

    /**
     *
     * @param input information and store into arrays 1 and 2 respectively
     * @param array1
     * @param array2
     */
    public static void readData(Scanner input, String[] array1, String[] array2) {
        int i = 0;
        String playerID, playerName;
        while (input.hasNext() && i < array1.length) {
            playerID = input.next();
            playerName = input.nextLine();
            //only add information read in to the arrays if the id meets requirements
            if (validatePlayer(playerID)) {
                array1[i] = playerID;
                array2[i] = playerName;
                i++;
            }
        }
    }

    /**
     *
     * @param playerID
     * @return true if sticker id meets the requirements
     */
    public static boolean validatePlayer(String playerID) {
        if (playerID.startsWith("PLA") && digitCount(playerID) == 3) {
            return true;
        }
        return false;
    }

    /**
     *
     * @param playerID
     * @return how many digits the sticker ID has
     */
    public static int digitCount(String playerID) {
        int digitCount = 0;
        for (int i = 3; i < playerID.length(); i++) { //Start counting from the 4th character in the word
            if (Character.isDigit(playerID.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount;
    }

    /**
     *
     * @param word
     * @param array
     * @return array of indexes with name found
     */
    public static int[] find (String word, String[] array) {
        int size = 0;
        //determine array size
        for (int j = 0; j < array.length; j++) {
            if (array[j].contains(word)) {
                size++;
            }
        }
        int[] words = new int[size];
        int wordIndex = 0;
        for (int i = 0; i < array.length; i++) {
            //add names found indexes to array
            if (array[i].contains(word)) {
                words[wordIndex] = i;
                wordIndex++;
            }
        }
        if (wordIndex == 0) {
            return null;
        }
        return words;
    }
}
