package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Eighteen {

    public static void main(String[] args) throws IOException {
        var x = Path.of("c/animals/fluffy/..");
        Files.walk(x.toRealPath().getParent()/*, FileVisitOption.FOLLOW_LINKS*/) // u1
                .map(p -> p.toAbsolutePath().toString()) // u2
                .filter(s -> s.endsWith(".java")) // u3
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}