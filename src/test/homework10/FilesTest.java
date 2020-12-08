package homework10;

import org.junit.jupiter.api.*;
import utils.file.ReadFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FilesTest extends BaseFileTest {

    static String pathToFile = "D:\\kurs\\homework\\src\\readTest.txt";
    ReadFile readFile = new ReadFile();

    @BeforeEach
    void generateFileNames() {

        fileName = randomStringBuilder.generateRandomString(6);

    }

    @Test
    void createAFile() {

        writeToFile.writeToFile(names, fileName);
        assertTrue(Files.exists(Path.of(fileName)));
        deleteFile.deleteFile(fileName);
        assertFalse(Files.exists(Path.of(fileName)));
    }

    @Test
    void fileContainsListOfNames() {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Emilka");
        listOfNames.add("Zosia");
        listOfNames.add("Tomek");
        listOfNames.add("Jacek");
        listOfNames.add("Agatka");

        readFile.readFile(pathToFile);
        assertEquals(listOfNames, readFile.output);

    }

    @Test
    void fileShouldNotcontainNameAndThrowAnException() {

        readFile.readFile(pathToFile);

        assertThrows(IllegalStateException.class, () -> readFile.output.stream()
                .filter(name -> name.contains("Wojtek"))
                .findFirst()
                .orElseThrow(IllegalStateException::new));

    }

    @Test
    void fileShouldContainName() {

        readFile.readFile(pathToFile);

        String searchedName = "Emilka";

        String filteredName = readFile.output.stream()
                .filter(name -> name.contains(searchedName))
                .findFirst()
                .orElseThrow(IllegalStateException::new);

        assertEquals(searchedName, filteredName);
    }
}
