package introduction;

import java.net.URISyntaxException;
import java.nio.file.Path;

public class MyPath {
    public static void main(String[] args) throws URISyntaxException {
        //of()
        Path path1 = Path.of("pandas/cuddly.png");
        Path path2 = Path.of("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Path.of("/home/zoodirectory");

        //or
        path1 = Path.of("pandas", "cuddly.png");
        path2 = Path.of("c:", "zooinfo", "November", "employees.txt");
        path3 = Path.of("/", "home", "zoodirectory");
    }
}