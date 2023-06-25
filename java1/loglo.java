package jala1;
//5-  local and global variables
public class loglo {
    // Global variable - static
    static int number = 199;

    public static void main(String[] args) {
        // Local variable with the same name as the global variable - int
        int number = 299;

        System.out.println("Local variable: " + number);
        System.out.println("Global variable: " + loglo.number);
    }
}
