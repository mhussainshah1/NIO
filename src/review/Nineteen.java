package review;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Nineteen {
    public static void main(String[] args) throws IOException {
        var p1 = Path.of("c/lizard", ".")
                .resolve(Path.of("walking.txt"));
        var p2 = new File("c/lizard/././actions/../walking.txt")
                .toPath();
        System.out.println(p1.toAbsolutePath() + "\n" + p2.toAbsolutePath());
        System.out.print(Files.isSameFile(p1, p2));
        System.out.print(" ");
        System.out.print(p1.equals(p2));
        System.out.print(" ");
        System.out.print(p1.normalize().equals(p2.normalize()));
    }
}
