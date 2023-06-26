package jala4;
//3-find index of array element
public class arrinfi {

    public static int findIndex(int[] array, int target) // declared function
    {
        for (int i = 0; i < array.length; i++) // for loop
        {
            if (array[i] == target) 
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int target = 6;

        int index = findIndex(numbers, target); // call function

        if (index != -1) 
        {
            System.out.println("Element " + target + " found at index: " + index);
        } else 
        {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
