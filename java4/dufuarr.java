package jala4;
//10-function to find the duplicate values of an array
import java.util.ArrayList; // import is used below for Array import
import java.util.HashSet;// hashSet array

public class dufuarr 
{
    public static void dulpiu(int[] array) 
    {
        HashSet<Integer> set = new HashSet<>(); //hashSet
        ArrayList<Integer> duplicates = new ArrayList<>();//Array 

        for (int num : array) 
        {
            if (set.contains(num)) 
            {
                if (!duplicates.contains(num)) 
                {
                    duplicates.add(num);
                }
            } 
            else 
            {
                set.add(num);
            }
        }

        System.out.println("Duplicate values: " + duplicates);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 3, 2, 5, 6, 4};
        dulpiu(numbers);
    }
}
