package jala3;
//3- equal or not equal using for and while loops
public class eqlop {
	public static void main(String[] args) {

        // Using while loop
        System.out.println("\nUsing while loop:");
        int j = 1;
        while (j <= 5) {
            if (j != 3) {
                System.out.println("Number is not 3");
            } else {
                System.out.println("Found the number 3!");
            }
            j++;
        }
    }
}
