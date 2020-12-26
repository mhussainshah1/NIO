package interactingWithPaths;

import java.io.IOException;
import java.nio.file.Paths;

public class RealPath {
    public static void main(String[] args) throws IOException {
        System.out.println(Paths.get("/zebra/food.txt").toRealPath());
        System.out.println(Paths.get(".././food.txt").toRealPath());

        //the current working directory as a Path object
        System.out.println(Paths.get(".").toRealPath());
    }
}
