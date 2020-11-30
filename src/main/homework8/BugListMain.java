package homework8;

import homework7.Bug;
import homework7.BugReporter;

import java.util.*;

public class BugListMain {

    public static void main(String[] args) {

        Bug bug1 = new Bug("Test Bug", new BugReporter("Emilka", "Test1", "eee@test.pl"), 2, true);
        Bug bug2 = new Bug("Ale Bug", new BugReporter("Tester", "Testowy", "ttt@test.pl"), 1, false);
        Bug bug3 = new Bug("Extra Bug", new BugReporter("Tester", "Testowy", "ttt@test.pl"), 5, false);
        Bug bug4 = new Bug("Test Bug", new BugReporter("Emilka", "Testowy", "eet@test.pl"), 4, true);
        Bug bug5 = new Bug("Test Bug", new BugReporter("Emilka", "Testowy", "eet@test.pl"), 4, true);

        //Create list of bugs

        List<Bug> bugsList = new ArrayList<>();

        bugsList.add(bug1);
        bugsList.add(bug2);
        bugsList.add(bug3);
        bugsList.add(bug4);
        bugsList.add(bug5);

        System.out.println(bugsList.size());

        //Only unique values

        Set<Bug> uniqueBugsList = new HashSet<>(bugsList);
        System.out.println(uniqueBugsList.size());

        Set<Bug> orderedUniqueBugsList = new TreeSet<>(uniqueBugsList);

        for (Bug bug : orderedUniqueBugsList) {
            System.out.println(bug.getDescription() + " " + bug.getBugReporter().getCreatorEmail());
        }

    }
}
