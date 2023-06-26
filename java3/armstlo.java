package jala3;
// 8-Armstrong number
// orinumber - original number
public class armstlo {
	public static void main(String[] args) 
	{
        int number = 153; // The number to check

        int orinumber = number;
        int result = 0;
        int digit;

        while (orinumber != 0) 
        {
            digit = orinumber % 10; // math formula
            result += Math.pow(digit, 3);
            orinumber /= 10;
        }

        if (result == number) 
        {
            System.out.println(number + " is an Armstrong number.");
        } else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
