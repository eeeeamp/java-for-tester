package utils.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {

    public List<String> output = new ArrayList<>();

    public List<String> readFile(String filename) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String currentLine = reader.readLine();
            output.add(currentLine);
            while (currentLine != null) {
                currentLine = reader.readLine();
                if (currentLine != null)
                    output.add(currentLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }
}
