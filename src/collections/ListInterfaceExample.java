package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        //ArrayList Declaration
        ArrayList<String> car = new ArrayList<String>(); //2nd String is not mandatory

        //Add elements
        car.add("Volvo"); //index 0
        car.add("Mercedes"); //index 1
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        //Print out all elements
        System.out.println(car);
        //Get elements by index
        System.out.println(car.get(0));

        //Add element at a specific index
        car.add(2, "Ford");
        System.out.println(car);

        //Change element value
        car.set(3,"Toyota");
        System.out.println(car);

        //Remove element at index
        car.remove(5);
        System.out.println(car);

        //Size, shows how many elements, not indexes
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);




    }
}
