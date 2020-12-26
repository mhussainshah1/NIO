package interactingWithPaths;

import java.nio.file.Path;

public class Immutable {
    public static void main(String[] args) {
        //Paths are immutable
        Path p = Path.of("whale");
        p.resolve("krill");//this action is ignore
        System.out.println(p); // whale

        Path parent = Path.of("/zoo/../home").getParent();
        Path normalize = parent.normalize();
        Path x = normalize.toAbsolutePath();
        System.out.println(parent + ", " + normalize + ", " + x);


    }
}
