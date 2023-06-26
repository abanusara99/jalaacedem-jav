package jala4;
///4-Write a function(func) to test if array contains a specific value
public class sparr {

    public static boolean containsValue(int[] array, int target) // declared func 
    {
        for (int num : array) //for with if and return
        {
            if (num == target) 
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        int[] numbers = {2, 4, 6, 8, 10};//array
        int target = 8;

        boolean contains = containsValue(numbers, target); //boolean with if-else and calls func

        if (contains) 
        {
            System.out.println("Array contains the value: " + target);
        } 
        else 
        {
            System.out.println("Array does not contain the value: " + target);
        }
    }
}
