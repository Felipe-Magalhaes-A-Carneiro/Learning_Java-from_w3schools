import java.util.Scanner;

public class Condition {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // Import the Scanner class to read user input

    System.out.println("Enter your age: ");
    int age = sc.nextInt();

    if(age >= 18) {
        System.out.println("You are an adult.");
    } else {
        System.out.println("You are a minor.");

    };        

    sc.close(); // Close the scanner to prevent resource leaks
    System.out.println("Thank you for using the Condition program!");
    }

    
}