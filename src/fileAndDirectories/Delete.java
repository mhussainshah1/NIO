package fileAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Delete {
    public static void main(String[] args) throws IOException {
        Files.delete(Paths.get("C/vulture/feathers.txt"));
        System.out.println(Files.deleteIfExists(Paths.get("C/pigeon")));
    }
}
