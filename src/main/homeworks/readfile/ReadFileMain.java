package homeworks.readfile;

import model.bug.Bug;
import model.bug.BugReporter;

import java.io.*;

public class ReadFileMain {
    public static void main(String[] args) {

//        File file;
//        BufferedReader bufferedReader;
//
//        {
//            try {
//                bufferedReader = new BufferedReader(new FileReader("D:\\kurs\\homework\\src\\main\\readfile\\t.txt"));
//
//                String line = bufferedReader.readLine();
//
//                if (line != null) {
//                    System.out.println(line);
//                    line = bufferedReader.readLine();
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println("This will always be done");
//            }
//        }

        //nullPointerException
        Bug bug = new Bug ("test", new BugReporter("Emilka", "Test", "eeeaaa@test.pl"), 2, true);
//        bug = null;
//        System.out.println(bug);

        //indexOutOfBoundsException
//        List<String> names = new ArrayList<>();
//        names.add("Ems");
//        System.out.println(names.get(1));

//        System.out.println(2/0);

    }


}
