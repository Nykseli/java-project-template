/**
 * Example Main class
 */

package main.java;

import java.util.Scanner;
import main.java.epackage.ExampleObject;

public class ExampleMain {
    public static void main(String[] args) {
        // Print the string from static method
        String staticString = ExampleObject.staticHelloMethod();
        System.out.println(staticString);
        Scanner scanner = new Scanner(System.in);

        // Print the string from nonstatic method
        ExampleObject normalObj = new ExampleObject();
        String normalString = normalObj.normalHelloMethod();
        System.out.println(normalString);

        // Print the user input
        System.out.println("Say something");
        String something = scanner.nextLine();
        System.out.println(something);
        scanner.close();
    }
}
