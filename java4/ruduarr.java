package jala4;
//12-a method to remove duplicate elements from an array
import java.util.Arrays; // Array import

public class ruduarr {
	public static int[] rmarr(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = array[i];
            }
        }

        return Arrays.copyOf(result, index);
    }
	 public static void main(String[] args) {
	        int[] array = {1, 2, 2, 3, 4, 4, 5};
	        int[] uniqueArray = rmarr(array);

	        System.out.println("Original array: " + Arrays.toString(array));
	        System.out.println("Array with duplicate elements removed: " + Arrays.toString(uniqueArray));
	    }
}
