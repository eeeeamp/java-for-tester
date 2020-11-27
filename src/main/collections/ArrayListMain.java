package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();
        names.add("Bartek");
        names.add("Tomek");
        names.add("Marcin");
        names.add("Asia");

        names1.add("Bartek");
        names1.add("Asia");

        System.out.println(names);

        for (String name : names){
            System.out.println(name);
        }

//        names.remove(0);

//        names.remove("Marcin");

        System.out.println(names.get(3));
        System.out.println(names.size());

        names.isEmpty();
        names.contains("Bartek");

        names.addAll(names1);
        System.out.println(names);

//        names.removeAll(names1);

        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);

    }
}
