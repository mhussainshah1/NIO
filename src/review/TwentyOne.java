package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TwentyOne {
    public static void main(String[] args) throws IOException {
        var twentyOne = new TwentyOne();
        twentyOne.copyIntoFlipDirectory(Path.of("c/flip/sounds.txt"));
    }

    void copyIntoFlipDirectory(Path source) throws IOException { //C:\Users\m_hus\IdeaProjects\nio\c\flip\sounds.txt
        var dolphinDir = Path.of("c/flip");
        dolphinDir = Files.createDirectories(dolphinDir);
        var n = Paths.get("sounds.txt");
//        Files.copy(source, dolphinDir);
        Files.copy(source, dolphinDir.resolve(n), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(source, dolphinDir, StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(source, dolphinDir.resolve(n));
    }

}
