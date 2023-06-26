package jala3;
//10 - find palindrome by while
// reverse - rev
//orinumber - original number
public class palin {
	public static boolean isPalin(int number) 
	{
        int rev = 0;
        int orinumber = number;

        while (number != 0) 
        {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number /= 10;
        }

        return orinumber == rev;
    }

    public static void main(String[] args) 
    {
        int number = 12321; // Change this number to check different values

        if (isPalin(number)) {
            System.out.println(number + " is a palindrome.");
        } else 
        {
            System.out.println(number + " is not a palindrome.");
        }
    }
}