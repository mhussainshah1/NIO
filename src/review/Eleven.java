package review;

import java.io.IOException;
import java.nio.file.*;

public class Eleven {
    public static void main(String[] args) throws IOException {
        Files.move(Path.of("c/monkey.txt"), Paths.get("c/animals/"),
                StandardCopyOption.ATOMIC_MOVE,
                LinkOption.NOFOLLOW_LINKS);
    }
}
