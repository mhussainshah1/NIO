package interactingWithPaths;

import java.nio.file.Path;

public class Resolve {
    public static void main(String[] args) {
        //resolve()
        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2));// \cats\..\panther\food

        Path path3 = Path.of("/turkey/food");
        System.out.println(path3.resolve("/tiger/cage")); // \tiger\cage
    }
}
