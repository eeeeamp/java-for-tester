package utils.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToFile {


    public void writeToFile(List<String> names, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (String name : names) {
                writer.write(name + System.lineSeparator());
            }
            writer.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
