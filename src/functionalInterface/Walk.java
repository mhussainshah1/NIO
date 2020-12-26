package functionalInterface;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;

public class Walk {
    public static void main(String[] args) throws IOException {
        var walk = new Walk();
        System.out.println(walk.getSize(Path.of("c/zoo")));

        var size = walk.getPathSize(Path.of("c/zoo"));
        System.out.format("Total Size without symbolic link: %.2f megabytes  %.2f kilobytes %n", size / 1000000.0, size / 1000.0);

        size = walk.getPathSize2(Path.of("c/zoo"));
        System.out.format("Total Size with symbolic link: %.2f megabytes  %.2f kilobytes %n", size / 1000000.0, size / 1000.0);

        var source = Path.of("c/birds");
        try (var s = Files.walk(source, 5)) {
        }
//        size = listing.getPathSize2(source);//FileSystemLoopException: c\birds\robin\allBirds
    }

    private long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0L;
    }

    public long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(this::getSize)
                    .sum();
        }
    }

    public long getPathSize2(Path source) throws IOException {
        try (var s = Files.walk(source, FileVisitOption.FOLLOW_LINKS)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(this::getSize)
                    .sum();
        }
    }
}
