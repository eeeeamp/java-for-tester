package homework10;

import org.junit.jupiter.api.BeforeAll;
import utils.RandomStringBuilder;
import utils.file.DeleteFile;
import utils.file.ReadFile;
import utils.file.WriteToFile;

import java.util.ArrayList;
import java.util.List;

public class BaseFileTest {

    static List<String> names;
    static WriteToFile writeToFile;
    static RandomStringBuilder randomStringBuilder;
    static String fileName;
    static DeleteFile deleteFile;

    @BeforeAll
    static void setUp() {

        names = new ArrayList<>();
        names.add("Emilka");
        names.add("Tobiasz");
        names.add("Alek");
        names.add("Wojtek");
        names.add("Ola");

        writeToFile = new WriteToFile();
        randomStringBuilder = new RandomStringBuilder();
        deleteFile = new DeleteFile();
    }

}
