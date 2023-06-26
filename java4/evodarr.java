package jala4;
//15-a method to find number of even number and odd numbers in an array
public class evodarr {
    public static void eveodd(int[] array) //function declare method
    {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) 
        {
            if (num % 2 == 0) 
            {
                evenCount++;
            } 
            else 
            {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 3, 6, 9, 4};//function call method
        eveodd(numbers);
    }
}
