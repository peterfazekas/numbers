package hu.numbers.data.api;

import hu.numbers.data.parse.DataParser;
import hu.numbers.data.read.DataReader;
import hu.numbers.data.read.FileDataReader;
import hu.numbers.data.write.DataLogger;
import hu.numbers.data.write.FileDataLogger;
import hu.numbers.model.Task;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class GetData {

    private final String fileName;
    private final DataReader file;
    private final DataParser data;
    private final DataLogger log;

    public GetData(final String inputFileName, final String outputFileName) {
        this.fileName = inputFileName;
        file = new FileDataReader(inputFileName);
        data = new DataParser();
        log = new FileDataLogger(outputFileName);
    }

    public List<Task> getFromFile() {
        List<String> read = file.read();
        return data.parser(read);
    }

    public void println(String text) {
        log.println(text);
    }
}
