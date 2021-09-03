package Lab;
import java.util.Scanner;
import java.io.*;

public class Lab16 {
    public static void main(String[] args) throws Exception {
        File file = new File("Lab16.txt"); //Lab16.txt file created
        Scanner fileInput = new Scanner(file); //Tell the computer to read from file

        //Tell the computer to exit the program if the file does not exist
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(1);
        }

        //Tell the computer to print the content of the program if it contains strings
        while (fileInput.hasNextLine()) {
            String content = fileInput.nextLine();
            System.out.println("The computer read \"" + content + "\"");
        }
    }
}
