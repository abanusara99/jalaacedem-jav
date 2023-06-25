package jala2;
//3- equal or not equal
public class eqno {
	// Method to demonstrate equal and not equal operators
    public static void demonstrateEqualityOperators() // function declared
    {
        int a = 92;
        int b = 89;

        // Equal operator- = =
        boolean isEqual = (a == b);
        System.out.println("Equal: " + isEqual);

        // Not equal operator- !=
        boolean isNotEqual = (a != b);
        System.out.println("Not Equal: " + isNotEqual);
    }

    public static void main(String[] args) {
        // Calling the demonstrateEqualityOperators method
        demonstrateEqualityOperators(); // function called
    }
}
