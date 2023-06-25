package jala2;
// 5- AND, OR and NOT logical operators
public class lobol {
	public static void demonstrateLogicalOperators() // function declared
	{
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND operator
        boolean res1 = condition1 && condition2;
        System.out.println("Logical AND: " + res1);

        // Logical OR operator
        boolean res2 = condition1 || condition2;
        System.out.println("Logical OR: " + res2);

        // Logical NOT operator
        boolean res3 = !condition1;
        System.out.println("Logical NOT: " + res3);
    }

    public static void main(String[] args) {
        // Calling the demonstrateLogicalOperators method
        demonstrateLogicalOperators(); //function called
    }
}
