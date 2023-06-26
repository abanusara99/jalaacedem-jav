package jala4;
//16-a function to get the difference of largest and smallest value
public class diflasmar {
    public static int lasmar(int[] array) //function declaration
    {
        if (array.length == 0) 
        {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1}; 
        int difference = lasmar(numbers);//function call
        System.out.println("Difference between largest and smallest value: " + difference);
    }
}
