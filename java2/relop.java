package jala2;
//6 - relational operators
public class relop {
	public static void main(String[] args) {
        int num1 = 19;
        int num2 = 900;

        // Less than operator
        boolean lessThan = num1 < num2;
        System.out.println("Less than: " + lessThan);

        // Less than or equal to operator
        boolean lessThanOrEqual = num1 <= num2;
        System.out.println("Less than or equal to: " + lessThanOrEqual);

        // Greater than operator
        boolean greaterThan = num1 > num2;
        System.out.println("Greater than: " + greaterThan);

        // Greater than or equal to operator
        boolean greaterThanOrEqual = num1 >= num2;
        System.out.println("Greater than or equal to: " + greaterThanOrEqual);
    }
}
