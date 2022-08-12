package homework;

import java.util.Arrays;

public class HW10MinAndMaxMethods {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, -15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original Array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array = " + max(my_array));
        System.out.println("Minimal value for the above array = " + min(my_array));
    }

    public static int max(int[] my_array) {
        int max = my_array[0];
        for(int i = 1; i < my_array.length; i++){
            if(my_array [i] > max){
                max = my_array[i];
            }
        }
        return max;
    }
    public static int min(int [] my_array){
        int min = my_array[0];
        for(int i = 1; i < my_array.length; i++){
            if (my_array [i] < min){
                min = my_array[i];
            }
        }
        return min;
    }

}
