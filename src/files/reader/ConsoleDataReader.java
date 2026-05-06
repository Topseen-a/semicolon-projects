package files.reader;

import java.io.DataInputStream;
import java.io.IOException;

public class ConsoleDataReader {

    public static String readData() {
        try (DataInputStream dataInputStream = new DataInputStream(System.in)) {
            return dataInputStream.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter data to be processed: ");
        System.out.println(readData());
    }
}
