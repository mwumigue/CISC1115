package Lab;

public class Lab17 {
    public static void main(String[] args) {
        helloWorld();
        goodBye();

    }

    public static void helloWorld() {
        System.out.println("Hello World");
        goodBye();
    }

    public static void goodBye() {
        System.out.println("Goodbye");
    }
}
