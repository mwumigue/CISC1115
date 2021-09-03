package Homework.Assignment8;
import java.io.PrintWriter;
import java.util.Scanner;

public class database {
    public static void main(String[] args) throws Exception {
        Scanner keyboard=new Scanner(System.in);
        PrintWriter pw =new PrintWriter("mail2.txt");
        String MB="MB";
        int [] randomzip=new int[10];
        for (int k=0; k< randomzip.length;k++){
            randomzip[k]=(int)(Math.random()*2000+10000);
        }
        for (int i=0;i<100;i++) {
            int random=(int)(Math.random()*8000+1000);
            double weight=(double)(Math.random()*100+1);
            int dice=(int)(Math.random()*9+1);
            MB = "MB" + random;
            pw.printf("%s%12.1f%12d\n", MB, weight, randomzip[dice]);
        }
        pw.close();
    }
}
