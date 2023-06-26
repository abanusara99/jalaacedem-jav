package jala3;
//11- find whether the num is odd or even using for and switch
public class swtlop {
	public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 10; // End of the range

        for (int number = start; number <= end; number++) // use of for loop
        {
            switch (number % 2) //use of switch
            {
                case 0:
                    System.out.println(number + " is even");
                    break;
                case 1:
                    System.out.println(number + " is odd");
                    break;
            }
        }
    }

}
