package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Five {
    public static void main(String[] args) throws IOException {
        var path = Paths.get("c/kang");
        if(Files.isDirectory(path) && Files.isSymbolicLink(path))
            Files.createDirectory(path.resolve("joey"));
    }
}
