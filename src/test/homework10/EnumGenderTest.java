package homework10;

import model.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static utils.enums.Gender.FEMALE;
import static utils.enums.Gender.MALE;

public class EnumGenderTest {

    static List<User> users;

    @BeforeAll
    static void createUsers() {

        users = new ArrayList<>();
        users.add(new User("Emilka", "Test", "emilka@test.pl", 26, FEMALE));
        users.add(new User("Kamil", "Kamyk", "kamil@test.pl", 26, MALE));
        users.add(new User("Zosia", "Testowa", "zosia@test.pl", 35, FEMALE));
        users.add(new User("Tomek", "Tomkowy", "tomek@test.pl", 45, MALE));

    }

    @Test
    void numberOfWomenIsCorrect() {

        List<User> female = users.stream()
                .filter(user -> user.getGender().equals(FEMALE))
                .collect(Collectors.toList());

        assertEquals(2, female.size());

    }
}
