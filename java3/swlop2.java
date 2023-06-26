package jala3;
// 12- m and F print with switch with loop
public class swlop2 {

    public static void main(String[] args) {
        char[] genders = {'M', 'F'}; // Array of genders
        int count = 5; // Number of times to repeat the loop

        for (int i = 0; i < count; i++) {
            char gender = genders[i % 2];

            switch (gender) {
                case 'M':
                    System.out.println("Gender: Male");
                    break;
                case 'F':
                    System.out.println("Gender: Female");
                    break;
                default:
                    System.out.println("Invalid gender");
                    break;
            }
        }
    }
}

