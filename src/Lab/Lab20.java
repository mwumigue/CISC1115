/* 3/10/2021
I want to tile my kitchen floor.
I need a program that will figure out how many pkgs of tiles to buy and what the total
cost is.

(I want to do my calculations in methods. No work, other than method calls will go into main.)

Think! What input do I need? What does my program have to do?
Start by writing English:
*1. what is the size of the room
   read in a length and a width
*2. what is the size of a tile
   read in a length and a width
*3. figure out how many tiles I need
   round up
   ceiling(floorLength/tileLength)*ceiling(floorWidth/tileWidth)
*4. how many tiles in a package
   read in an integer
5. how many packages should I buy
   calculate an integer -- be careful to round up -- ceiling
   ceiling ( number of tiles needed/ number of tiles in a pkg)
*6. how much is a package of tiles
   read in a double value
LAB 20: write the method and the method call for step #7:
and also, add in the last statement in the method numPkgs
7. how much will it cost
   multiply price per pkg by number of packages needed
*/

package Lab;
import java.util.Scanner;
import java.io.*;

public class Lab20 {
    /** main is a method that gets called when you run your program
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // read in data for size of tile
        int tileLength = readInt(scanner, "length of tile: ");
        int tileWidth = readInt(scanner, "width of tile: ");
        System.out.println("tileLength: " + tileLength + " tileWidth: " + tileWidth);

        // read in data for size of floor
        double floorLength = readDouble(scanner, "length of floor: ");
        double floorWidth = readDouble(scanner, "width of floor: ");

        System.out.println("floorLength: " + floorLength + " floorWidth: " + floorWidth);
        // read in pricer per package
        double pricePerPkg = readDouble(scanner, "price per package of tiles: ");
        System.out.println("price per pkg of tiles: " + pricePerPkg);
        // read in number of tiles per package
        int numTilePerPkg = readInt(scanner, "number of tiles per package: ");
        System.out.println("numTilePerPkg: " + numTilePerPkg);
        int numTiles = numberOfTiles(floorLength, tileLength, floorWidth, tileWidth);
        System.out.println("numberOfTiles: " + numTiles);
        int numPkgs = numPkgs(numTiles, numTilePerPkg);
        System.out.println("number of packages needed: " + numPkgs);
        double totalPrice = totalPrice(numPkgs, pricePerPkg);
        System.out.printf("%s%.2f", "total price: $", totalPrice);
    }
    /**
     * calculate an integer -- be careful to round up -- ceiling
     ceiling ( number of tiles needed/ number of tiles in a pkg)
     * **/
    public static int numPkgs(int numTilesNeeded, int numTilesPerPkg) {
        if (numTilesNeeded % numTilesPerPkg == 0)
            return numTilesNeeded/numTilesPerPkg;
        else {
            return numTilesNeeded/numTilesPerPkg + 1;
        }
    }

    /**
     * calculate how much it will cost
     */
    public static double totalPrice(int numPkgs, double pricePerPkg) {
        return numPkgs * pricePerPkg;
    }
    /**
     *
     * @param floorLength
     * @param tileLength
     * @param floorWidth
     * @param tileWidth
     * @return
     */
    public static int numberOfTiles(double floorLength, int tileLength, double floorWidth, int tileWidth) {
        return  (int)(Math.ceil(floorLength/tileLength)*Math.ceil(floorWidth/tileWidth));
    }
    /**
     * readInt accepts Scanner and String, prompts the user and reads an integer
     * @param sc
     * @param msg
     * @return integer value that was read in
     */
    public static int readInt(Scanner sc, String msg) {
        System.out.println("Enter " + msg);
        int x = sc.nextInt();
        // input validation
        while (x<=0) {
            System.out.println("That value is not valid, enter another: ");
            x = sc.nextInt();
        }
        return x;
    }
    /**
     * readDouble prompts the user and reads in a double
     * @param sc Scanner
     * @param msg prompt
     * @return double that was read in
     */
    public static double readDouble(Scanner sc, String msg) {
        System.out.println("Enter " + msg);
        double x = sc.nextDouble();
        // input validation
        while (x<=0) {
            System.out.println("That value is not valid, enter another: ");
            x = sc.nextDouble();
        }
        return x;
    }
}
