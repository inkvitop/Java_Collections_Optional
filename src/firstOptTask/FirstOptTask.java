package firstOptTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FirstOptTask {
    ArrayList<String> fileText = new ArrayList<>();
    File file = new File("src/firstOptTask/firstOptionalTask.txt");

    public void readTextFile() {
        try {
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferReader = new BufferedReader(fileReader);

            bufferReader.lines().forEach(o -> fileText.add(o));
            bufferReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("File exists, but there was IOException");
        }
    }

    public void revertArrayList() {
        Collections.reverse(fileText);
    }

    public void writeTextFile() {
        try {
            FileWriter writer = new FileWriter(file, false);

            for (int i = 0; i < fileText.size(); i++) {
                writer.write(fileText.get(i) + "\n");
            }

            writer.flush();

            System.out.println("The first task is completed. The lines in the files have changed the order.");
        } catch (IOException e) {
            System.err.println("File exists, but there was IOException");
        }
    }
}
