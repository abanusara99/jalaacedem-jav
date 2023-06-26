package jala4;
//5-a function to remove a specific element from an array
public class remsparr {
	public static int[] rmement(int[] array, int target) //func declared with target 
	{
        int[] result = new int[array.length - 1]; //array
        int index = 0;

        for (int i = 0; i < array.length; i++) // for-if-result
        {
            if (array[i] != target) 
            {
                result[index++] = array[i];
            }
        }

        return result;
    }
	public static void main(String[] args) 
	{
        int[] numbers = {2, 4, 6, 8, 10};// array
        int target = 6;

        int[] modiar = rmement(numbers, target);

        System.out.println("Original Array:");
        for (int num : numbers) 
        {
            System.out.print(num + " ");
        }

        System.out.println("\nModified Array:");
        for (int num : modiar) 
        {
            System.out.print(num + " ");
        }
    }
}
