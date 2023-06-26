package jala4;
//1- add int value with array
public class intarr 
{
	 public static int sumarr(int[] array) 
	 {
	        int sum = 0;

	        for (int num : array) 
	        {
	            sum += num;
	        }

	        return sum;
	    }

	    public static void main(String[] args) 
	    {
	        int[] numbers = {2, 4, 6, 8, 10}; // array syntax -dataType[] arrayName = new dataType[arraySize];

	        int result = sumarr(numbers);

	        System.out.println("Sum of the array elements: " + result);
	    }
}
