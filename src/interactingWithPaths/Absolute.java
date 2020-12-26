package interactingWithPaths;

import java.nio.file.Paths;

public class Absolute {
    public static void main(String[] args) {
        var path1 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute? " + path1.isAbsolute());
        System.out.println("Absolute Path1: " + path1.toAbsolutePath());
    }
}
