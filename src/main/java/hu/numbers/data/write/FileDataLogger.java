package hu.numbers.data.write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class FileDataLogger implements DataLogger {

    private static final String PATH = "src\\main\\resources\\";

    private final String fileName;

    public FileDataLogger(String fileName) {
        this.fileName = PATH + fileName;
    }

    @Override
    public void println(String text) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            writer.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
