package jala4;
//9- a function to reverse an array of integer values
public class revarr {
	 public static void reve(int[] array) {
	        int start = 0;
	        int end = array.length - 1;

	        while (start < end) {
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        }
	    }

	 public static void main(String[] args) 
	 {
	        int[] numbers = {1, 2, 3, 4, 5};
	        System.out.print("Original array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        reve(numbers);

	        System.out.print("\nReversed array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
}
