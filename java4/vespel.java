package jala4;
//17-a method to verify if the array contains two specified elements(12,23)
// class -vespel
//method- spvele
public class vespel {
    public static boolean spvele(int[] array, int element1, int element2) //method declare 
    {
        boolean conelement1 = false;
        boolean conelement2 = false;

        for (int num : array) 
        {
            if (num == element1) 
            {
                conelement1 = true;
            }
            if (num == element2)
            {
                conelement2 = true;
            }
        }

        return conelement1 && conelement2; //return with AND operator
    }

    public static void main(String[] args) 
    {
        int[] numbers = {10, 23, 15, 12, 18};
        boolean conelements = spvele(numbers, 12, 23);// function call

        if (conelements) {
            System.out.println("Array contains both specified elements");
        } else {
            System.out.println("Array does not contain both specified elements");
        }
    }
}
