package jala4;
//11- a program to find the common values between two arrays
public class comva {
	public static void main(String[] args) 
	{
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.print("Common values: ");
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
    }
}
