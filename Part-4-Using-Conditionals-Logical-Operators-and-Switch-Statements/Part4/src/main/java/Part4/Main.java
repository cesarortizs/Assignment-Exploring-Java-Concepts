package Part4;

public class Main {
    public static void main(String[] args) {
        // Declare and Initialize Variables
        int scoreOne = 80;
        int scoreTwo = 90;
        int scoreThree = 100;

        int averageScore = (scoreOne + scoreTwo + scoreThree) / 3;

        // Use Conditionals and Logical Operators
        if (averageScore >= 90 && averageScore <= 100)
        {
            System.out.println("Excellent");
        }

        else if (averageScore >= 70 && averageScore <= 89)
        {
            System.out.println("Good");
        }

        else if (averageScore >= 50 && averageScore <= 69)
        {
            System.out.println("Average");
        }

        else
        {
            System.out.println("Poor");
        }

        // Use a Switch Statement
        int day = 5;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
        }
    }
}