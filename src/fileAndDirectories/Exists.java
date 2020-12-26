package fileAndDirectories;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exists {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //exists()
        var b1 = Files.exists(Paths.get("C/ostrich/feathers.png"));
        System.out.println("Path " + (b1 ? "Exists" : "Missing"));

        var b2 = Files.exists(Paths.get("C/ostrich"));
        System.out.println("Path " + (b2 ? "Exists" : "Missing"));
    }
}