package fileAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Same {
    public static void main(String[] args) throws IOException {
        //isSameFile()
        System.out.println(Files.isSameFile(
                Path.of("C/animals/cobra"),
                Path.of("C/animals/snake.lnk")));

        System.out.println(Files.isSameFile(
                Path.of("C/animals/monkey/ears.png"),
                Path.of("C/animals/wolf/ears.png"))); //false
    }
}
