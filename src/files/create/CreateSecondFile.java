package files.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateSecondFile {
    public static void main(String[] args) throws IOException {
        try {
            String directory = "/home/semi/Documents/semicolonProjects/src/files";

            Path path = Path.of(directory, "letter.txt");
            System.out.println("filePath:: " + path);
            Files.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
