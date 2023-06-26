package jala4;
//8-a function to find the minimum and maximum value of an array
public class minmaxr {
	public static void mima(int[] array) {
        int minimum = array[0];
        int maximum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) 
            {
                minimum = array[i];
            }
            if (array[i] > maximum) 
            {
                maximum = array[i];
            }
        }

        System.out.println("Minimum value: " + minimum);
        System.out.println("Maximum value: " + maximum);
    }

    public static void main(String[] args) 
    {
        int[] numbers = {5, 2, 9, 1, 7};
        mima(numbers);
    }
}
