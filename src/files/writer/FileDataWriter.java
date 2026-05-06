package files.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataWriter {

    public static void writeDataToFile(String text, Path filePath) {
        try {
            Files.write(filePath, text.getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void readDataFromFile(Path path) {
        try {
            Files.readString(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void deleteFile(Path path) {
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void deleteDirectory(Path path) {
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void updateDataInFile(String text, Path path) {
        String data = "";
        try {
            data = Files.readString(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        String newData = data + " " + text;
        FileDataWriter.writeDataToFile(newData, path);
        System.out.println(newData);
    }

    public static int countNumberOfCharactersInFile(Path path){
        try {
            String data = Files.readString(path);
            if (data.isEmpty()) return 0;
            return data.length();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void writeDataToFile(String data, String fileLocation) {
        try (FileOutputStream outputStream = new FileOutputStream(fileLocation)) {
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
