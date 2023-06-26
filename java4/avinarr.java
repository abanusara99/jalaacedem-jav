package jala4;
//2-calculate avg values of int arrays
public class avinarr {
	public static double calavg(int[] array) //declared function
	{
        int sum = 0;
     // Calculate the sum of all elements in the array
        for (int num : array) {
            sum += num;
        }
     // Calculate the average by dividing the sum by the number of elements
        double avg = (double) sum / array.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        double result = calavg(numbers); // call function

        System.out.println("Average of the array elements: " + result);
    }
}
