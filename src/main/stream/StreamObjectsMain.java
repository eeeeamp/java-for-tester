package stream;

import collections.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamObjectsMain {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Emilka", "Niebieska", "emilka@test.com", 23));
        users.add(new User("Tomek", "Czarny", "tomek@test.com", 12));
        users.add(new User("Marcin", "Biały", "marcin@test.com", 13));
        users.add(new User("Jacek", "Fioletowy", "jacek@test.com", 14));
        users.add(new User("Asia", "Zielona", "asia@test.com", 26));
        users.add(new User("Asia", "Biały", "asia@test.com", 26));
        users.add(new User("Marta", "Czerwona", "marta@test.com", 18));
        users.add(new User("Kasia", "Brązowa", "kasia@test.com", 52));

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::getAge))
                .collect(Collectors.toList());

        System.out.println(sortedUsers);
    }
}
