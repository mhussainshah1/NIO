package fileAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

//replace
public class Move {
    public static void main(String[] args) throws IOException {
        Files.move(Path.of("c/zoo"), Path.of("c/zoo-new"));
        Files.move(Path.of("c/user/addresses.txt"),
                Path.of("c/zoo-new/addresses2.txt"));

        //Atomic Move
        Files.move(Path.of("C/mouse.txt"), Path.of("c/gebril.txt"),
                StandardCopyOption.ATOMIC_MOVE);
    }
}
