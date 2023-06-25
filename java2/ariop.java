package jala2;
//1- arithmetic operators
public class ariop 
{
    // Function to perform arithmetic operations
    public static void performArithmeticOperations() // function declared
    {
        int a = 100;
        int b = 50;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {
        // Calling the performArithmeticOperations function
        performArithmeticOperations(); // function called
    }
}
