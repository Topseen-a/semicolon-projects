package myPackage;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFinder {
    public static void main(String[] args) {

        String fileLocation = "/a/b/c../e/f";  //a => root directory c => file
        Path path = Paths.get(fileLocation);
        path = path.normalize();
        System.out.println(path);
    }
}