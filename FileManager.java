import java.io.File;

public class FileManager {
    void createFile(String fileName) {
        try {
            File newFile = new File(fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
