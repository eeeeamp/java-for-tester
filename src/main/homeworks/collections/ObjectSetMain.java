package homeworks.collections;


import model.user.User;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ObjectSetMain {

    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("Emilka", "Test", "emilka@test.pl", 25));
        users.add(new User("Emilka", "Test", "emilka@test.pl", 25));
        users.add(new User("Emilka", "Anonim", "emilka@test.pl", 14));
        users.add(new User("Emilka", "Sobiejest", "emilka@test.pl", 14));
        users.add(new User("Bartek", "Test", "bartek@test.pl", 18));
        users.add(new User("Bartek", "Testowy", "bartek@test.pl", 19));
        users.add(new User("Tomek", "Tested", "tomek@test.pl", 38));

        System.out.println(users.size());

        for (User user : users) {

            System.out.println(user.getFirstName() + " " + user.getLastName());
        }

        Set<User> sortedUsers = new TreeSet<>(users);

        for (User user : sortedUsers) {

            System.out.println(user.getFirstName() + " " + user.getLastName());
        }
    }
}
