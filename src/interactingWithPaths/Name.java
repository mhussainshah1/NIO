package interactingWithPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Name {
    public static void main(String[] args) {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " + path.getName(i));
        }

        //root element "c:/" is not part of path
        var p = Path.of("/");
        System.out.println(p.getNameCount()); // 0
//        System.out.print(p.getName(0)); // IllegalArgumentException
    }
}
