import java.io.File;
import java.util.Scanner;
public class FileManager {
    File transactionsFile;

    void createFile(String fileName) {

        try {
            transactionsFile = new File(fileName);
        } catch (Exception e) {

            System.out.println("There was a problem creating your file");
        }
    }

    void loadFile(String fileName) {
        try {
            transactionsFile = new File(fileName);
            Scanner myReader = new Scanner(transactionsFile);
        } catch (Exception e) {
            System.out.println("There was a problem reading your file");
        }
    }
}
