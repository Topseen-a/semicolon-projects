package files;

import files.writer.FileDataWriter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FileDataWriterTest {

    @Test
    public void testFileDataWriter(){
        try {
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output/note.txt";
            Path path = Paths.get(fileLocation);
            String text = """
                    10, 100, 1000, 10000
                    """;
            FileDataWriter.writeDataToFile(text, path);
            String dataReadFromFile = Files.readString(path);
            assertEquals(text, dataReadFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readDataFromFile(){
        try {
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output/note.txt";
            Path path = Paths.get(fileLocation);
            FileDataWriter.readDataFromFile(path);
            String dataReadFromFile = Files.readString(path);
            assertEquals("10, 100, 1000, 10000", dataReadFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteFile() {
        String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output/note.txt";
        Path path = Paths.get(fileLocation);
        FileDataWriter.deleteFile(path);
        assertFalse(Files.exists(path));
    }

    @Test
    public void deleteDirectory() {
        String pathLocation = "/home/semi/Documents/semicolonProjects/src/files/output";
        Path path = Paths.get(pathLocation);
        FileDataWriter.deleteDirectory(path);
        assertFalse(Files.exists(path));
    }

    @Test
    public void updateFile() {
        try {
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output/note.txt";
            Path path = Paths.get(fileLocation);
            String text = "10, 100, 1000, 10000 ";
            String dataReadFromFile;

            String updatedText = "hello Topseen";
            FileDataWriter.updateDataInFile(updatedText, path);
            dataReadFromFile = Files.readString(path);
            assertEquals(text+updatedText, dataReadFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void countNumberOfCharactersInFile(){
        try {
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output/note.txt";
            Path path = Paths.get(fileLocation);

            String content = Files.readString(path);
            int expectedLength = content.length();

            assertEquals(expectedLength, FileDataWriter.countNumberOfCharactersInFile(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
