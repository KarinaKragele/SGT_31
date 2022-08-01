package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HW7CopyAnArray {
    public static void main(String[] args) {
        int table [] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Source Array : " + Arrays.toString(table));

        //int [] newtable = new int[10];
        int [] newtable = new int[table.length];
        System.out.print("New Array: ");
        for(int i = 0; i < table.length; i++) {
            newtable[i] = table[i];
            //System.out.print(Arrays.toString(new int[] {table[i]}));
        //Without [ ] reverse, not the goal of this task
        //for (int i = table.length-1; i >= 0; i--){
        //System.out.print(table[i] + ", ");

           //System.out.print(table[i] + ", ");
            //System.out.print(Arrays.toString(new int[]{table[i]}));
            //System.out.println("]");
        }
        System.out.println("New Array : " + Arrays.toString(newtable));
    }
}
