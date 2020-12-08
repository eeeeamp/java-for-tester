package homeworks.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Tom");
        names.add("Franek");
        names.add("Feliks");
        names.add("Romek");
        names.add("Max");

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(str -> System.out.println(str));

        names.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        names.stream()
                .filter(str -> str.length() <= 3)
                .map(str -> "Short name: " + str)
                .forEach(str -> System.out.println(str));

        long count = names.stream()
                .filter(str -> str.length() <= 3)
                .count();

        System.out.println(count);

        boolean anyMatch = names.stream()
                .anyMatch(str -> str.contains("a"));
        System.out.println(anyMatch);

        boolean allMatch = names.stream()
                .allMatch(str -> str.length() > 3);
        System.out.println(allMatch);

        boolean noneMatch = names.stream()
                .noneMatch(str -> str.endsWith("ski"));
        System.out.println(noneMatch);

        List<String> fNames = names.stream()
                .filter(name -> name.startsWith("F"))
                .collect(Collectors.toList());
        System.out.println(fNames);

    }
}
