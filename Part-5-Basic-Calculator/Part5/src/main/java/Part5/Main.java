package Part5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String operation;

        // Read User Input
        Scanner input = new Scanner(System.in);

        System.out.print("\nWrite your number: ");
        num1 = input.nextInt();
        System.out.print("Write another number: ");
        num2 = input.nextInt();
        input.nextLine();

        System.out.println("\nChoose one of the following operations:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");

        System.out.print("\nWrite your choice: ");
        operation = input.nextLine();

        // Perform Arithmetic Operations
        if (operation.equalsIgnoreCase("addition"))
        {
            result = num1 + num2;
        }

        else if (operation.equalsIgnoreCase("subtraction"))
        {
            result = num1 - num2;
        }

        else if (operation.equalsIgnoreCase("multiplication"))
        {
            result = num1 * num2;
        }

        else if (operation.equalsIgnoreCase("division"))
        {
            result = num1 / num2;
        }

        System.out.println("\nYour current result is: " + result);

        // Increment and Decrement Operations
        System.out.println("\nSelect an option for your current result");
        System.out.println("Increment");
        System.out.println("Decrement");
        System.out.println("None");

        System.out.print("\nWrite your choice: ");
        operation = input.nextLine();

        switch(operation.toLowerCase())
        {
            case "increment":
                result++;
                break;
            case "decrement":
                result--;
                break;
            default:
                System.out.println("Invalid operation");
        }

        // Display Results
        System.out.println("\nYour final result is: " + result);
    }
}