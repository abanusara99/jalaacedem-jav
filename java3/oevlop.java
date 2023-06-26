package jala3;
// 4- get odd and even numbers
public class oevlop {
	public static void main(String[] args) {
        // Printing odd numbers using a while loop
        System.out.println("Odd numbers using a while loop:");
        int i = 1;
        while (i <= 10) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        // Printing even numbers using a for loop
        System.out.println("\nEven numbers using a for loop:");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
