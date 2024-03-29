package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        //HashSet
        HashSet<String> names = new HashSet<>(); //default constructor
        //Adding elements
        names.add("Bob");
        names.add("Anna");
        names.add("Anna"); //it discards the double element
        names.add("Liam");
        //Print all elements/ They are not in order
        System.out.println(names);

        //Remove. We do not have indexes here, so we remove values
        names.remove("Bob");
        System.out.println(names);

        //Size
        System.out.println(names.size());

        //Check if this data structure contains particular value
        System.out.println(names.contains("Liam")); //response true/false
        System.out.println(names.contains("Bob"));

        //Iterate
        for(String str: names){
            System.out.println(str);
        }

        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //HashSet example 2
        HashSet<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("insSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2: " + intSet2);
        //Find union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union: " + union);
        union.addAll(intSet2);
        System.out.println("union: " + union);

        //Find intersection/ duplicate values
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection: " + intersection);

        //Find difference
        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2); //remove all elements that you can find in intSet2
        System.out.println("difference: " + difference);

        //LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Sweden");
        System.out.println(linkedHashSet);

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);

    }
}
