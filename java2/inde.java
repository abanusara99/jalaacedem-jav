package jala2;
//2- increment and decrement
public class inde {
    // Method to demonstrate increment and decrement operators
    public static void demonstrateIncrementAndDecrement() // function declared
    {
        int num = 9;

        // Increment operator
        num++;
        System.out.println("After increment: " + num);

        // Decrement operator
        num--;
        System.out.println("After decrement: " + num);
    }

    public static void main(String[] args) {
        // Calling the demonstrateIncrementAndDecrement method
        demonstrateIncrementAndDecrement(); // function called
    }
}
