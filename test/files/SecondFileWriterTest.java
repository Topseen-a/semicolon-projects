package files;

import files.writer.FileDataWriter;
import files.writer.SecondFileDataWriter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class SecondFileWriterTest {

    @Test
    public void testWrite() {
        try {
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output";
            Path path = Paths.get(fileLocation);
            String text = """
                    Hello Java
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
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output";
            Path path = Paths.get(fileLocation);
            FileDataWriter.readDataFromFile(path);
            String dataReadFromFile = Files.readString(path);
            assertEquals("Hello Java", dataReadFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteFile() {
        try {
            String fileLocation = "/home/semi/Documents/semicolonProjects/src/files/output";
            Path path = Paths.get(fileLocation);
            FileDataWriter.deleteFile(path);
            String dataReadFromFile = String.valueOf(Files.deleteIfExists(path));
            assertFalse(dataReadFromFile.isEmpty());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
