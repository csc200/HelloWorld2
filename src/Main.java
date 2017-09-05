import java.util.Scanner;
/**
 * Purpose: Display Hello World
 * @author Tanes Kanchanawanchai
 * @version 1.0 9/5/2017
 */
public class Main {
    /**
     * This is a main method for the application.
     * @param args any string input
     */
    public static void main(String[] args) {
        //this is a scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        /*
            using scanner to read a string input.
            This sc is an object  of Scanner class
         */
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
