package homework10;

import org.junit.jupiter.api.*;
import utils.file.ReadFile;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FileEndToEndTest extends BaseFileTest {

    static String fileName = randomStringBuilder.generateRandomString(6);
    ReadFile readFile = new ReadFile();

    @Test
    @Order(1)
    void createAFile() {

        writeToFile.writeToFile(names, fileName);
        assertTrue(Files.exists(Path.of(fileName)));

    }

    @Test
    @Order(2)
    void readAFile() {
        readFile.readFile(fileName);
        assertEquals(names, readFile.output);
    }

    @Test
    @Order(3)
    void deleteAFile() {

        deleteFile.deleteFile(fileName);
        assertFalse(Files.exists(Path.of(fileName)));
    }

}
