package Homework;

public class Variables_Homework {
    public static void main(String[] args) {
        System.out.println("This program calculates the average speed of two different cars.\n"); //Description of the program
        int firstTripDistance; //First trip distance variable declared
        double firstTripTime; //First trip time variable declared
        int secondTripDistance; //Second trip distance variable declared
        double secondTripTime; //Second trip time variable declared
        // Car 1
        firstTripDistance = 45; //First trip distance = 45 miles
        firstTripTime = 35; //First trip time = 35 minutes
        firstTripTime = firstTripTime/60; //First trip time converted to hours

        secondTripDistance = 125; //Second trip distance = 125 miles
        secondTripTime = 75; //Second trip time = 75 minutes
        secondTripTime = secondTripTime/60; //Second trip time converted to hours

        double averageSpeed; //Average speed variable declared
        //Average speed calculated as (d1 + d2) / (t1 + t2) and rounded to the closest integer
        averageSpeed = Math.round((firstTripDistance + secondTripDistance)/(firstTripTime + secondTripTime));

        System.out.println("Car 1           " + "Distance                   " + "Time");
        System.out.println("Trip 1:         " + firstTripDistance + " miles " + firstTripTime + " hours");
        System.out.println("Trip 2:         " + secondTripDistance + " miles" + secondTripTime + " hours");
        System.out.println("Average Speed:  " + (int)averageSpeed + " mph\n");

        //Car 2
        firstTripDistance = 50; //First trip distance value reassigned to 50 miles
        firstTripTime = 40; //First trip time value reassigned to 40 minutes
        firstTripTime = firstTripTime/60; //Reassigned first trip time value converted to hours

        secondTripDistance = 75; //Second trip distance value reassigned to 75 miles
        secondTripTime = 65; //Second trip time value reassigned to 65 minutes
        secondTripTime = secondTripTime/60; //Reassigned second trip time value converted to hours

        //Average speed equation updated with Car 2 values and rounded to the closest integer
        averageSpeed = Math.round((firstTripDistance + secondTripDistance)/(firstTripTime + secondTripTime));

        System.out.println("Car 2           " + "Distance                   " + "Time");
        System.out.println("Trip 1:         " + firstTripDistance + " miles " + firstTripTime + " hours");
        System.out.println("Trip 2:         " + secondTripDistance + " miles" + secondTripTime + " hours");
        System.out.println("Average Speed:  " + (int)averageSpeed + " mph");
    }
}
