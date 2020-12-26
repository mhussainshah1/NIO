package introduction;

import java.nio.file.Path;
import java.nio.file.Paths;

//Obtaining a Path with the Path interface
public class MyPaths {
    public static void main(String[] args) {
        //get()
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Paths.get("/", "home", "zoodirectory");
    }
}
