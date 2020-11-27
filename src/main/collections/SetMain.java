package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {

        //HashSet keeps only unique values
        //we can't define the order of elements
        Set<String> names = new HashSet<>();
        names.add("Bartek");
        names.add("Marcin");
        names.add("Tomek");
        names.add("Jacek");
        names.add("Asia");
        names.add("Asia");

        System.out.println(names.size());
        System.out.println(names);

        //TreeSet - ordered and unique elements
        Set<String> sortedNames = new TreeSet<>(names);
        System.out.println(sortedNames);


    }
}
