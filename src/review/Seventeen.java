package review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Seventeen {
    public static void main(String[] args) throws IOException {
        var seventeen = new Seventeen();
        seventeen.printData(Path.of("c/fox/food-schedule.csv"));
    }

    void printData(Path path) throws IOException {
//        Files.readAllLines(path) // r1
        Files.lines(path) // r1
                .flatMap(p -> Stream.of(p.split(","))) // r2
                .map(q -> q.toUpperCase()) // r3
                .forEach(System.out::println);
    }
}