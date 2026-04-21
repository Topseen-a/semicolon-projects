package files.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static void main(String[] args) {
        try {
            String directory = "/home/semi/Documents/semicolonProjects/src/files/output";
            Path path = Path.of(directory, "note.txt");
            System.out.println("filePath:: " + path);
            Files.createFile(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
