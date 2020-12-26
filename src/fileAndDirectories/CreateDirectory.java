package fileAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectory {
    public static void main(String[] args) throws IOException {
        //createDirectory()
        Files.createDirectory(Path.of("C/bison/field"));
        Files.createDirectories(Path.of("/bison/field/pasture/green"));
    }
}
