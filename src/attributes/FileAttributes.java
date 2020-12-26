package attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributes {
    public static void main(String[] args) throws IOException {
        //Reading
        System.out.println(Files.isDirectory(Paths.get("C/canine/fur.jpg")));
        System.out.println(Files.isSymbolicLink(Paths.get("C/zoo/favorite")));
        System.out.println(Files.isRegularFile(Paths.get("C/canine/types.txt")));

        //Checking
        System.out.println(Files.isHidden(Paths.get("C/walrus.txt")));
        System.out.println(Files.isReadable(Paths.get("C/seal/baby.png")));
        System.out.println(Files.isWritable(Paths.get("C/dolphin.txt")));
        System.out.println(Files.isExecutable(Paths.get("C/animals/monkey/tail.gif")));

        System.out.println(Files.size(Paths.get("c/zoo/animals.txt")));//7
        System.out.println(Files.size(Paths.get("c/zoo")));//7

        final Path path = Paths.get("c/rabbit/food.jpg");
        System.out.println(Files.getLastModifiedTime(path).toMillis());
    }
}
