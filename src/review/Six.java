package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Six {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/animals");
        try (var z = Files.walk(path)) {
            boolean b = z
//                    .filter((p,a) -> a.isDirectory() && !path.equals(p)) // x - DOES NOT COMPILE
                    .findFirst().isPresent(); // y
            System.out.print(b ? "No Sub": "Has Sub");
        }
    }
}
