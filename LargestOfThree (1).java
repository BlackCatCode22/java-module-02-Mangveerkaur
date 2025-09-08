    // LargestOfThree.java
    // dh 08/21/25
    // Mangveer Kaur

    // Reference:
    // Gemini flowchart
    // https://www.w3schools.com/java/java_conditions.asp

    // Discription of program
    // This program will input three ints from the user
    // Processing will be finding the largest of the three with nested statements
    // Output will bw a understandable statement of the largest number

    // I need to import the scanner class from
    // Java.util.Package this is how I do it

    import java.util.Scanner;

    public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Largest Of Three program");


        // Create the variables needed
        //initialize num1 to 0
        // 0 is assigned to num1
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        // Get input from the user.
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for first int.
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();
        // Output the user's input to make sure program is working.
        System.out.println("\n the user entered " + num1 + " for num1 ");

        // Prompt the user for second int.
        System.out.println("\n Please enter a whole number for num2: ");
        num1 = scanner.nextInt();
        // Output the user's input to make sure program is working.
        System.out.println("\n the user entered " + num2 + " for num2 ");

        // Prompt the user for third int.
        System.out.println("\n Please enter a whole number for num3: ");
        num1 = scanner.nextInt();
        // Output the user's input to make sure program is working.
        System.out.println("\n the user entered " + num3 + " for num3 ");

        // Processing
        // Use nested if statements to find the largest.
        if (num1 > num2) {
            if (num1 > num3) {
                // this is the true part
                largest = num1;
            }
            else {
                // this is false part
                largest = num3;
            }
        }
        else {
            if (num2 > num3) {
                // this is the true part
                largest = num2;
            }
            else {
                // this is false part
                largest = num3; }
        }

        // output meaningful information to the user
        System.out.println("\n you entered " + num1 + " for  the value of num1. \n ");
        System.out.println("\n you entered " + num2 + " for  the value of num2. \n ");
        System.out.println("\n you entered " + num3 + " for  the value of num3. \n ");

        System.out.println("\n the largest number is " + largest);




    }
    }
