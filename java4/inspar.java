package jala4;
//7-a function to insert an element at a specific position in the array
public class inspar {
	public static void intele(int[] array, int element, int position) {
        // Create a new array with increased length by 1
        int[] newArray = new int[array.length + 1];
        
        // Copy elements from the original array to the new array
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == position) {
                // Insert the element at the specified position
                newArray[j] = element;
                j++;
            }
            newArray[j] = array[i];
        }
     // Update the original array reference
        array = newArray;
        
        // Print the updated array
        System.out.println("Array after inserting element: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int positionToInsert = 4;
        
        intele(numbers, elementToInsert, positionToInsert);
    }
}
