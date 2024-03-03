package Chapter15_Lambda;

import java.io.File;
import java.util.stream.Stream;

public class Lambda_Example8 {
    public static void main(String[] args) {
        File[] filearr = {new File("ex1.txt"),new File("ex2.txt"),new File("ex3.txt")};
        Stream<File> fileStream = Stream.of(filearr);

        Stream<String> stringStream = fileStream.map(File::getName);
        stringStream.forEach(System.out::println);

         fileStream = Stream.of(filearr);

         fileStream.map(File::getName).filter(s -> s.indexOf('.') != -1).
                 map(s -> s.substring(s.indexOf('.') + 1)).distinct().forEach(System.out::println);

        System.out.println();

    }
}
