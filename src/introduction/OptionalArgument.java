package introduction;

import java.io.IOException;
import java.nio.file.*;

public class OptionalArgument {
    public static void main(String[] args) {
        //optional arguments
        Path path = Paths.get("schedule.xml");
        boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
        System.out.println(exists);
    }

    void copy(Path source, Path target) throws IOException {
        Files.move(source, target,
                LinkOption.NOFOLLOW_LINKS,
                StandardCopyOption.ATOMIC_MOVE);
    }
}
