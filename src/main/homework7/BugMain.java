package homework7;

public class BugMain {

    public static void main(String[] args) {

        BugReporter bugReporter = new BugReporter("Emilka", "test", "emilka@test.pl");
        Bug newBug = new Bug("This is a bug!", bugReporter, 3, true);
        Bug closedBug = new Bug("This is a bug!", bugReporter, 3, false);

        System.out.println(newBug);
        System.out.println(closedBug);

        newBug.getBugReporter().setCreatorEmail("changetest.pl");
        System.out.println(newBug);

        newBug.setStatus(false);
    }

}
