package homework10;

import model.bug.Bug;
import model.bug.BugReporter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.enums.exceptions.IllegalBugPriorityException;

import static org.junit.jupiter.api.Assertions.*;

public class BugPriorityTest {

    static Bug bug;

    @BeforeAll
    static void setup() {

        bug = new Bug("Test Bug", new BugReporter("Test", "Test", "test@test.pl"), 2, true);

    }

    @Test
    void setInvalidPriorityShouldThrowException() {

        assertThrows(IllegalBugPriorityException.class, () -> bug.setBugPriority(0));

    }

    @Test
    void validPriorityShouldBeSetCorrectly() {

        bug.setBugPriority(5);
        assertEquals(5, bug.getBugPriority());
    }

}
