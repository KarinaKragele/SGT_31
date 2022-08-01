package homework;

import java.util.Arrays;

public class HW7ReverseArrays {
    public static void main(String[] args) {
        int table [] = {234, 45, 24, 568, 456};
        //System.out.println("Original array : " + Arrays.toString(table));
        System.out.print("Original array : ");
        //for(int i = 0; i < table.length; i++);
        System.out.println(Arrays.toString(table));

        System.out.print("Reverse array : ");
        for( int i = table.length-1; i >=0; i--){
            //System.out.print(Arrays.toString(table));
            System.out.print(Arrays.toString(new int[]{table[i]}) + ", ");
            //System.out.print(table[i] + ", ");

        }
        System.out.println();
        System.out.println("Reverse array: " + Arrays.toString(table));

    }
}
