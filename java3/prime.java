package jala3;
// 9-found prime using for
public class prime {
	public static boolean isPrim(int number) 
	{
        if (number <= 1) 
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) // for loop 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 17; // Change this number to check different values

        if (isPrim(number)) 
        {
            System.out.println(number + " is a prime number.");
        }
        else 
        {
            System.out.println(number + " is not a prime number.");
        }
    }
}
