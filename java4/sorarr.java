package jala4;
//19- a function to find the missing number of sorted array of 1 to 100
//soarr -classname
public class sorarr {
    public static int findminumb(int[] arr) 
    {
        int n = arr.length + 1; // Total numbers in the sorted array

        // Calculate the sum of numbers from 1 to n using the formula (n * (n + 1)) / 2
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of the given array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The difference between the expected sum and the actual sum will be the missing number
        int missingNumber = expectedSum - actualSum;

        return missingNumber;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, /* Missing Number */ 14, 15, 16, /* ... */ 99, 100};
        int missingNumber = findminumb(sortedArray);
        System.out.println("Missing Number: " + missingNumber);
    }
}
