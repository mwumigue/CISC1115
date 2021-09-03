package Homework.Assignment4;
import java.util.Scanner;
import java.io.*;

public class Assignment4 {
    public static void main(String[] args) throws Exception {
        String store; //Variable for store name declared
        double quarter1, quarter2, quarter3, quarter4, total; //Variables for each of the quarters and the total

        //Input and output files created and assigned to their respective variables
        File inputFile = new File("C:\\CISC1115\\src\\Homework\\Assignment4\\inputFile.txt");
        PrintWriter outputFile = new PrintWriter("C:\\CISC1115\\src\\Homework\\Assignment4\\outputFile.txt");
        PrintWriter barChartFile = new PrintWriter("C:\\CISC1115\\src\\Homework\\Assignment4\\barChartFile.txt"); //Extra credit file

        Scanner fileInput = new Scanner(inputFile); //New Scanner that reads the input file

        //Output files heading
        outputFile.printf("%8s%12s%12s%12s%12s%12s\n", "Store", "Qtr1", "Qtr2", "Qtr3", "Qtr4", "Total");
        barChartFile.println("Total sales: ");

        //Each time the console is able to read any word
        while (fileInput.hasNext()) {
            //Store will be initialized to the store name
            store = fileInput.next();

            //Each quarter will be initialized to their respective number
            quarter1 = fileInput.nextDouble();
            quarter2 = fileInput.nextDouble();
            quarter3 = fileInput.nextDouble();
            quarter4 = fileInput.nextDouble();

            //Add all quarters to get total
            total = quarter1 + quarter2 + quarter3 + quarter4;

            //Formatted printing with 12 spaces between columns and rounded to 2 decimals
            outputFile.printf("%8s%12.2f%12.2f%12.2f%12.2f%12.2f\n",store,quarter1,quarter2,quarter3,quarter4,total);


            barChartFile.print(store + ": ");
            for (int i = 0; i < total; i += 5) {
                barChartFile.print('-');
            }
            barChartFile.println();
        }
        barChartFile.println("Scale: One dash represents 5 dollars");

        outputFile.close();
        barChartFile.close();
    }
}
