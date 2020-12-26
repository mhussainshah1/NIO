package exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

//Given the code fragment:

public class Main {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("u01/work/stage/message.txt");
            Path target = Paths.get("u01/work/merge.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            BasicFileAttributes attr = Files.readAttributes(target, BasicFileAttributes.class);
            System.out.print(attr.isRegularFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
    Which is true?
    A) The source file is copied to the target file only when the target file does not exist.
    B) The source file is copied to the target file as a symbolic link.
    C) The source file is copied to the target file as a regular file.
    D) The source file is copied to the target file as a symbolic link when the target file already exists.

    Answer C
 */