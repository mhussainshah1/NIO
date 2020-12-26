package attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class View {
    public static void main(String[] args) throws IOException {
        //RETRIEVE
        var path = Paths.get("c/turtle/sea.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());//Last modified: 2020-12-25T10:13:20.4070171Z

        //MODIFYING
        // Read file attributes
        path = Paths.get("c/turtle/sea.txt");
        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();
        // Modify file last modified time
        FileTime lastModifiedTime = FileTime.fromMillis(
                attributes.lastModifiedTime().toMillis() + 10_000);//10 SECONDS
        view.setTimes(lastModifiedTime, null, null);//New modified: 2020-12-25T10:13:30.407Z
    }
}
