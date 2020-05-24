package pliki2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) {

        Path path = Paths.get("file.txt");
        System.out.println(path.toAbsolutePath());
        Path path2 = Paths.get("file.txt");

        try {
//            System.out.println(Files.isSameFile(path, path2));

//          Files.readAllLines(path).forEach(linia -> System.out.println(linia));
            Files.lines(path).forEach(linia -> System.out.println(linia));

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Files.write(path, "jakis tekst".getBytes());
            BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
