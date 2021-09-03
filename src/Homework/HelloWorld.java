package Homework;
    /*
* 2/1/2021
* Day 1 of CISC 1115
* Here is our very first java program
* Recall: java is a HLL which will be compiled (translated)
Important: You have to save file as exactly the same name as the class with
.java extension
*/

public class HelloWorld {
    public static void main(String[] args) {
/* the following is a Java statement
every Java statement ends in a ;
You have to follow specific grammar rules of the language also called
SYNTAX
List of constructs that we are looking at:
1. "Hello World" --- this is called a string literal and anything inside
of double quotes is a string literal. Does not get translated.
2. System is a class in the Java API (application programmer interface)
containing lots of code that can be used by all java programmers
It interfaces with the OS and allows us to print messages to the screen.
*/
            System.out.println("Hello from Miguel!");
    }
}