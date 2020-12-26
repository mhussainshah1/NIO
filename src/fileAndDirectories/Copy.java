package fileAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //copy()
        //copy files
        Files.copy(Paths.get("C/panda/bamboo.txt"),
                Paths.get("C/panda-save/bamboo.txt"));
        //copy directories
        Files.copy(Paths.get("C/turtle"), Paths.get("C/turtleCopy"));

        //REPLACE_EXISTING
        Files.copy(Paths.get("C/book.txt"), Paths.get("C/movie.txt"),
                StandardCopyOption.REPLACE_EXISTING);

        //I/O Stream
        try (var is = new FileInputStream("C/source-data.txt")) {
            // Write stream data to a file
            Files.copy(is, Paths.get("C/mammals/wolf.txt"));
        }

        try (var is = new URI("http://www.google.com/").toURL().openStream()) {
            Files.copy(is, Paths.get("C/mammals/google.html"));
        }
        Files.copy(Paths.get(".idea/misc.xml"), System.out);

        var file = Paths.get("C/food.txt");
        var directory = Paths.get("C/enclosure");
        Files.copy(file, directory);

        file = Paths.get("C/food.txt");
        directory = Paths.get("C/enclosure/food.txt");
        Files.copy(file, directory);

        //or
        directory = Paths.get("C/enclosure").resolve(file.getFileName());// \enclosure\food.txt
        Files.copy(file, directory);
    }
}