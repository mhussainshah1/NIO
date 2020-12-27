package review;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TwentyTwo {
    public static void main(String[] args) throws Exception {
        new TwentyTwo().duplicateFile(Path.of("c/birds.txt"), Path.of("c/book.txt"));
    }

    void duplicateFile(Path m, Path x) throws Exception {
        try (var r = Files.newBufferedReader(m);
             var w = Files.newBufferedWriter(x, StandardOpenOption.APPEND);) {
            String currentLine = null;
            while ((currentLine = r.readLine()) != null) {
                System.out.println(currentLine);
                w.write(currentLine);
            }
        }
    }
}
