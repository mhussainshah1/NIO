package fileAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        //reader
        var path = Path.of("C/animals/gopher.txt");
        try (var reader = Files.newBufferedReader(path)) {
            String currentLine = null;
            while((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        }

        //writer
        var list = new ArrayList<String>();
        list.add("Smokey");
        list.add("Yogi");
        path = Path.of("C/animals/bear.txt");
        try (var writer = Files.newBufferedWriter(path)) {
            for(var line : list) {
                writer.write(line);
                writer.newLine();
            }
        }

        //readLines()
        path = Path.of("C/animals/gopher.txt");
        final List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }
}
