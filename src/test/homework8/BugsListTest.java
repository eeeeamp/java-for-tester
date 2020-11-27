package homework8;

import homework7.Bug;
import homework7.BugReporter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BugsListTest {

    static List<Bug> bugsList;
    static Set<Bug> uniqueBugsList;
    static Set<Bug> orderedUniqueBugsList;


    @BeforeAll
    static void setUp() {

        Bug bug1 = new Bug("Test Bug", new BugReporter("Emilka", "Test1", "eee@test.pl"), 2, true);
        Bug bug2 = new Bug("Ale Bug", new BugReporter("Tester", "Testowy", "ttt@test.pl"), 1, false);
        Bug bug3 = new Bug("Extra Bug", new BugReporter("Tester", "Testowy", "ttt@test.pl"), 5, false);
        Bug bug4 = new Bug("Test Bug", new BugReporter("Emilka", "Testowy", "eet@test.pl"), 4, true);
        Bug bug5 = new Bug("Test Bug", new BugReporter("Emilka", "Testowy", "eet@test.pl"), 4, true);

        //Create list of bugs
         bugsList = new ArrayList<>();

        bugsList.add(bug1);
        bugsList.add(bug2);
        bugsList.add(bug3);
        bugsList.add(bug4);
        bugsList.add(bug5);

        //Only unique values
        uniqueBugsList = new HashSet<>(bugsList);

        //Order by description
        orderedUniqueBugsList = new TreeSet<>(uniqueBugsList);

    }

    @Test
    void sizeOfTheListContainingAllBugsIsCorrect(){
        Assertions.assertEquals(5, bugsList.size());
    }

    @Test
    void listWithUniqueBugsIsOneBugShorter(){
        Assertions.assertEquals(bugsList.size()-1, uniqueBugsList.size());
    }

    @Test
    void uniqueBugsListIsOrderedByDescription(){
        Assertions.assertEquals("Ale Bug", orderedUniqueBugsList.iterator().next().getDescription());
    }

}

