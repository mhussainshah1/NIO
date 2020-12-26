package review;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Eight {
    public static void main(String[] args) {
        var pathB = FileSystems.getDefault().getPath("puma.txt");
        var pathD = new java.io.File("tiger.txt").toPath();
        var pathG = Path.of(Path.of(".").toUri());
    }
}
