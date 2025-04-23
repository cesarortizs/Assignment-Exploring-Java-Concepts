package Part2;

public class Main {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        int counter = 10;

        // Perform Increment and Decrement Operations
        System.out.println("\nManual increment and decrement");
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        // Use Increment and Decrement in Loops
        System.out.println("\nAutomatic increment with for loop");
        for(int i = 10; i < 15; i++)
        {
            counter++;
            System.out.println(counter);
        }

        System.out.println("\nAutomatic decrement with while loop");
        while(counter > 10)
        {
            System.out.println(counter);
            counter--;
        }

    }
}