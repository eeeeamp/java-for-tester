package utils.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFile {

    public void deleteFile(String fileName) {

        try {
            Files.delete(Paths.get("D:\\kurs\\homework\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
