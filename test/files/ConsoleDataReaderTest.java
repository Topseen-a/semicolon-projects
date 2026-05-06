package files;

import files.reader.ConsoleDataReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConsoleDataReaderTest {

    @Test
    public void testReadData() {
        String data = ConsoleDataReader.readData();
        assertNotNull(data);
    }
}
