package functionalInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Listing {
    public static void main(String[] args) throws IOException {
        try (Stream<Path> s = Files.list(Path.of("c/animals"))) {
            s.forEach(System.out::println);
        }
        var listing = new Listing();
        listing.copyPath(Path.of("c/zoo"), Path.of("c/zoo-copy"));
    }

    public void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if (Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source)) {
                    s.forEach(p -> copyPath(p, target.resolve(p.getFileName())));
                }
        } catch (IOException e) {
            // Handle exception
//            e.printStackTrace();
        }
    }


}
