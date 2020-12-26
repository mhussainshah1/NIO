package functionalInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lines {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("c/fish/sharks.log");
        try (var s = Files.lines(path)) {
            s.forEach(System.out::println);
        }

        path = Paths.get("c/fish/sharks.log");
        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN:"))
                    .map(f -> f.substring(5))
                    .forEach(System.out::println);
        }

        //Files.readAllLines() vs. Files.lines()
        Files.readAllLines(Paths.get("c/birds.txt")) //load all file in memory
                .forEach(System.out::println);

        Files.lines(Paths.get("c/birds.txt"))//load one line in memory
                .forEach(System.out::println);

        //filter()
       Files.readAllLines(Paths.get("c/birds.txt"))
//                .filter(s -> s.length() > 2) //DOES NOT COMPILE
                .forEach(System.out::println);

        Files.lines(Paths.get("c/birds.txt"))
                .filter(s -> s.length() > 2)
                .forEach(System.out::println);
    }
}
