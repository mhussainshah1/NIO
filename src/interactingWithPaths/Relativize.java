package interactingWithPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize {
    public static void main(String[] args) {
        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));

        path1 = Paths.get("/primate/chimpanzee");
        path2 = Paths.get("bananas.txt");
//        path1.relativize(path2); // IllegalArgumentException
    }
}
