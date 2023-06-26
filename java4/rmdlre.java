package jala4;
//18- program to remove the duplicate elements and return the new array without function and array
//class= rmdlre
import java.util.Arrays;

public class rmdlre 
{
    public static void main(String[] args) 
    {
        int[] originalArray = {2, 4, 6, 4, 8, 2, 10, 6};
        int[] newArray = new int[originalArray.length];
        int newIndex = 0;

        for (int i = 0; i < originalArray.length; i++) 
        {
            boolean isDuplicate = false;
            for (int j = 0; j < newIndex; j++) 
            {
                if (originalArray[i] == newArray[j]) 
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) 
            {
                newArray[newIndex] = originalArray[i];
                newIndex++;
            }
        }

        // Truncate the new array to remove unused elements
        newArray = Arrays.copyOf(newArray, newIndex);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array without duplicates: " + Arrays.toString(newArray));
    }
}
