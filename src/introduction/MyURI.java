package introduction;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

//Obtaining a Path with a URI Class
public class MyURI {
    public static void main(String[] args) throws URISyntaxException {
        //URI
        URI a = new URI("file://icecream.txt");
        Path b = Path.of(a);
        Path c = Paths.get(a);
        URI d = b.toUri();

        Path path5 = Paths.get(new URI("http://www.wiley.com"));
        Path path6 = Paths.get(new URI("ftp://username:secret@ftp.example.com"));
    }
}
