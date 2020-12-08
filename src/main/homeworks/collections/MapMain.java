package homeworks.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Emilka");
        names.put(5, "Emilka2");
        names.put(3, "Emilka3");
        names.put(9, "Emilka4");

        System.out.println(names);

        for(Map.Entry<Integer, String> name : names.entrySet()){
            System.out.println(name.getValue());
        }

        Map<Integer, String> sortedNames = new TreeMap<>(names);
        System.out.println(sortedNames);

    }
}
