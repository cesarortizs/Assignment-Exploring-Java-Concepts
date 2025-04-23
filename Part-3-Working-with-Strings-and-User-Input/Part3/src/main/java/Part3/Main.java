package Part3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read User Input
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter your first name");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        // Manipulate Strings
        String fullName = firstName + " " + lastName;
        String fullNameUpper = fullName.toUpperCase();

        int firstLetterCounter = 0;

        for(int i = 0; i < fullName.length(); i++)
        {
            if (fullName.toLowerCase().charAt(i) == fullName.toLowerCase().charAt(0))
            {
                firstLetterCounter++;
            }
        }

        System.out.println("\nThe full name is " + fullName);
        System.out.println("The full name in uppercase is " + fullNameUpper);
        System.out.println("The first letter of the full name appears " + firstLetterCounter + " times in the string");
    }
}