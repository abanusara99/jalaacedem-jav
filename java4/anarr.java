package jala4;
//6-function to copy an array to another array
public class anarr {
	public static int[] copyary(int[] source) 
	{
        int[] desti = new int[source.length];//array

        for (int i = 0; i < source.length; i++) 
        {
            desti[i] = source[i];
        }

        return desti;
    }
	public static void main(String[] args) 
	{
        int[] souary = {2, 4, 6, 8, 10};//array

        int[] copiary = copyary(souary);

        System.out.println("Source Array:");
        for (int num : souary) 
        {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied Array:");
        for (int num : copiary) 
        {
            System.out.print(num + " ");
        }
    }
}
