package jala2;
//7-print small and large number
public class spnum {
	public static void main(String[] args) {
        int num1 = 90;
        int num2 = 20;

        int smaller = (num1 < num2) ? num1 : num2;
        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("Smaller number: " + smaller);
        System.out.println("Larger number: " + larger);
    }
}
