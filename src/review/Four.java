package review;

import java.nio.file.Paths;

public class Four {
    public static void main(String[] args) {
        var p = Paths.get("c/zoo/animals/bear/koala/food.txt");
        System.out.print(p.subpath(2,4).getName(1).toAbsolutePath());
    }
}
