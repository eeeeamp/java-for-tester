package homeworks.collections;

import model.user.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectArrayListMain {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Emilka", "Test", "emilka@test.pl", 26));
        users.add(new User("Bartek", "Test", "bartek@test.pl", 14));
        users.add(new User("Zosia", "Test", "zosia@test.pl", 28));
        users.add(new User("Asia", "Test", "asia@test.pl", 37));

//        for (collections.User user : users){
//            System.out.println(user.getFirstName());
//        }

        Collections.sort(users, Comparator.comparing(User::getFirstName));
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        System.out.println(users);

    }



}
