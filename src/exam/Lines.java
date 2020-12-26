package exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//Given:
public class Lines {
    public static void main(String[] args) {
        try {
            // line 1
            var lines = Files.lines(Paths.get("c/food.txt"));//INPUT_FILE_NAME
            lines.map(l -> l.toUpperCase())
                    .forEach(line -> {
                        try {
                            Files.write(Paths.get("outputFile_to_path"), line.getBytes(), StandardOpenOption.CREATE);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
        You want to obtain the Stream object on reading the file.

        Which code inserted on line 1 will accomplish this?

        A) Stream<String> lines = Files.lines(INPUT_FILE_NAME) ;

        B) var lines = Files.lines(Paths.get(INPUT_FILE_NAME));

        C) Stream lines = Files.readAllLines(Paths.get(INPUT_FILE_NAME));

        D) var lines = Files.readAllLines(Paths.get(INPUT_FILE_NAME));

        Answer B
*/