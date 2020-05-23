package pliki;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter("file.txt");
            printWriter.println("Linia pierwsza..");
            printWriter.println("Linia druga..");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("file.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());


        List<String> stolice = Arrays.asList("Warszawa", "Berlin", "Praga", "Wiedeń", "Oslo");

        try {
            PrintWriter printWriter = new PrintWriter("capitols.txt");
            stolice.forEach(printWriter::println); // stolica -> printWriter.println(stolica);
//            printWriter.print(stolice); // zapisze toStringa obiektu
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
