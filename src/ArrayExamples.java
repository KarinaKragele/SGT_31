import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        //Declare Array that will hold 3 String type variables
        String[] names = new String[3];

        //How to set array's element values
        names[0] = "Karina";
        names[1] = "Toms";
        names[2] = "Tina";

        //How to get array' s elements value
        System.out.println(names[2]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 1;
        grades[3] = 7;
        grades[4] = 5;
        grades[5] = 2;
        grades[6] = 9;
        grades[7] = 10;
        grades[8] = 6;
        grades[9] = 4;

        //How to get Array's size
        System.out.println("Array's size: " + grades.length);

        //Print out all elements
        for(int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");

            System.out.println(Arrays.toString(grades));
        }

        //Example
        int table[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < table.length; i++) {
            int value = table[i];
            if (value % 2 == 0) {
                System.out.println("even number: " + value);
            } else {
                System.out.println("odd number: " + value);
            }
        }
    }
}
