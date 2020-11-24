import homework2and3.Bug;

public class BugMain {

    public static void main(String[] args) {

        Bug bug = new Bug("Bug", "emilka@test.pl", 4, true);
        Bug bug1 = new Bug("Bug", "emilka@test.pl", 4, true);

        //toString method
        System.out.println(bug);

        //equals method
        System.out.println(bug.equals(bug1)); //compare references, we need to override method to compare data inside

        System.out.println("--------------------------------");
        //homework2
        bug.presentAllInfo();
        bug.presentCreatorEmail();
        System.out.println("Priority of bug is: " + bug.priorityOfBug());

        System.out.println("--------------------------------");
        //homework3
        Bug newBug = new Bug ("Description of new bug", "tester@test.pl", 1, false);

        System.out.println("Try to create to short description");
        newBug.setDescription("Test");

        System.out.println("Try to add a creator with email missing @ sign");
        newBug.setCreatorEmail("emilkatester.pl");

        System.out.println("Try to apply to low priority");
        newBug.setBugPriority(-1);

        System.out.println("Try to apply to high priority");
        newBug.setBugPriority(6);

        System.out.println("Information about bug was not changed: ");
        newBug.presentAllInfo();

        System.out.println("Were created " + Bug.getBugCounter() + "bugs");



    }

}
