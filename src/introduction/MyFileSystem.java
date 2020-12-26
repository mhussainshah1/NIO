package introduction;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

//Obtaining a Path from the FileSystem Class
public class MyFileSystem {

    public static void main(String[] args) throws URISyntaxException {
        //FileSystems
        Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");//relative path
        Path path2 = FileSystems.getDefault().getPath("c:\\zooinfo\\November\\employees.txt");//absolute path for Windows
        Path path3 = FileSystems.getDefault().getPath("/home/zoodirectory");//absolute path fro Linux

        //connecting to remote file system
        FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
        Path path = fileSystem.getPath("duck.txt");
    }
}
