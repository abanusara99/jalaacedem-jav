package jala4;
//13 and 14 -a method to find the second largest number in an array
public class selarr 
{
    public static int selarn(int[] array) 
    {
        int lar = Integer.MIN_VALUE;
        int secondlar = Integer.MIN_VALUE;

        for (int num : array) 
        {
            if (num > lar) 
            {
                secondlar= lar;
                lar = num;
            } else if (num > secondlar && num < lar) {
                secondlar = num;
            }
        }

        return secondlar;
    }

    public static void main(String[] args) 
    {
        int[] numbers = {9, 5, 2, 8, 3, 10, 7};
        int result = selarn(numbers);
        System.out.println("Second largest number: " + result);
    }
}
