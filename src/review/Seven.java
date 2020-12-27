package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Seven {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("turkey");
        if(Files.isSameFile(path,Paths.get("c/zoo/turkey"))) // z1 - NoSuchFileException
            Files.createDirectories(path.resolve("info")); // z2
    }
}
