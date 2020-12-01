package stream;

import collections.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalMain {

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

        Optional<User> max = users.stream()
                .max(Comparator.comparingInt(User::getAge));

        System.out.println(max);

        //aby dostac sie do jednego elementum (nie powinno się robić get bez zabezpieczenia, bo leci exception

        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("Element does not exist");
        }

        //orElse

        String kasiaName = users.stream()
                .map(User::getFirstName)
                .filter(user -> user.equals("Kasia"))
                .findFirst()
                .orElse("No such name");

        System.out.println(kasiaName);

        Integer maxAge = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(maxAge);

//        orElseGet - return something
        User newUser = users.stream()
                .filter(user -> user.getFirstName().startsWith("Z"))
                .findFirst()
                .orElseGet(() -> new User("ZosiaGet", "TestGet", "zosia@test.com", 36));

        System.out.println(newUser);

        //orElseTrhrow
//        users.stream()
//                .filter(user -> user.getFirstName().startsWith("Z"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("User which name starts with Z does not exist"));

        users.stream()
                .filter(user -> user.getFirstName().startsWith("E"))
                .findFirst()
                .ifPresent(System.out::println);

        users.stream()
                .filter(user -> user.getFirstName().startsWith("Z"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User does not exist"));








    }
}
