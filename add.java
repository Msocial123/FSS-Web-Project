import java.util.Scanner;

public class AddWithTwist {
    // Function to add two numbers using bitwise operators
    public static int addNumbers(int a, int b) {
        while (b != 0) {
            // Carry now contains common set bits of a and b
            int carry = a & b;

            // Sum of bits of a and b where at least one is not set
            a = a ^ b;

            // Carry is shifted by one so that it can be added in the next iteration
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Perform addition using the custom method
        int result = addNumbers(number1, number2);

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + result);

        // Close the scanner
        scanner.close();
    }
}
