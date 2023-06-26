package jala3;
//5- largest number using for loop
public class thrlop 
{
	public static void main(String[] args) 
	{
        // Four numbers
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;
        int num4 = 30;

        // Using a for loop
        int largestForLoop = num1;
        int[] numbersForLoop = {num2, num3, num4};
        for (int i = 0; i < numbersForLoop.length; i++) 
        {
            if (numbersForLoop[i] > largestForLoop) 
            {
                largestForLoop = numbersForLoop[i];
                
            }
            System.out.println("Largest number using a for loop: " +largestForLoop);
            
            
        }
        
	}
}        