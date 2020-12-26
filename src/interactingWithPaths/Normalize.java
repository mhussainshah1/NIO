package interactingWithPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {
    public static void main(String[] args) {
        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize()); // shells.txt

        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize()); // /panther/food

        var p3 = Path.of("../../fish.txt");
        System.out.println(p3.normalize()); // ../../fish.txt

        //comparision
        p1 = Paths.get("/pony/../weather.txt");
        p2 = Paths.get("/weather.txt");
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.normalize().equals(p2.normalize())); // true
    }
}
