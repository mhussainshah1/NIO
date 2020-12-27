package interactingWithPaths;

import java.io.IOException;
import java.nio.file.Paths;

public class RealPath {
    public static void main(String[] args) throws IOException {
        System.out.println(Paths.get("/data/zebra/food.txt").toRealPath());// C:\data\horse\food.txt
        System.out.println(Paths.get(".././food.txt").toRealPath());//   C:\Users\m_hus\IdeaProjects\food.txt

        //the current working directory as a Path object
        System.out.println(Paths.get(".").toRealPath());//               C:\Users\m_hus\IdeaProjects\NIO
    }
}