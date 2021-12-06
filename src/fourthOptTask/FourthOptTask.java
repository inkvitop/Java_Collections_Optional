package fourthOptTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FourthOptTask {
    ArrayList<String> fileText = new ArrayList<>();
    File file = new File("src/fourthOptTask/fourthOptionalTask.txt");

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

    public void printSortedPoetry() {
        List<String> sorted = fileText.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());
        for (int i = 0; i < sorted.size(); i++) {
            System.out.println(sorted.get(i));
        }
        System.out.println("The fourth task is completed. Poem sorted by line length.");
    }
}
