package jala3;
//13- find large numbers using multi ifelse 
public class ifellop {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30}; // Array of numbers
        int largest = numbers[0]; // Assume the first number is the largest

        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > largest) 
            {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
