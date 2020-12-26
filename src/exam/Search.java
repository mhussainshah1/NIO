package exam;
/**
 Given the directory structure:
 continent/
 |_ a.txt
 |_country
      |_ b.txt
      |_state
            |_ c.txt
            |_county

 What is the result?
 A)
 /continent
 /Continent/country

 B)
 /continent/
 /continent/country
 /continent/country/state
 /continent/country/state/county

 C) /continent/country/state/county

 D) /continent/country/ state

 Answer A

 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Search {
    public static void main(String[] args) {
        BiPredicate<Path, BasicFileAttributes> pred = (path, fileAttrs) -> {
            return fileAttrs.isDirectory();
        };
        int depth = 1;
        try (var stream = Files.find(Paths.get("/continent"),depth,pred)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
        }
    }
}

