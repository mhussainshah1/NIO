package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Two {
    public static void main(String[] args) throws IOException {
        var two = new Two();
        two.removeBadFile(Path.of("c/turtleCopy"));
        two.removeBadFile(Path.of("c/zoo-copy/favorite"));
//        two.removeBadFile(Path.of("c/zoo-copy/cats/tiger"));//DirectoryNotEmptyException
    }

    public void removeBadFile(Path path) throws IOException {
        if (Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path)
                    ? "Success" : "Try Again");
    }
}
