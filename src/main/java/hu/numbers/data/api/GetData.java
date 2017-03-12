package hu.numbers.data.api;

import hu.numbers.data.parse.DataParser;
import hu.numbers.data.read.DataReader;
import hu.numbers.data.read.FileDataReader;
import hu.numbers.model.Task;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class GetData {

    private final String fileName;
    private final DataReader file;
    private final DataParser data;

    public GetData(final String fileName) {
        this.fileName = fileName;
        file = new FileDataReader(fileName);
        data = new DataParser();
    }

    public List<Task> getFromFile() {
        List<String> read = file.read();
        return data.parser(read);
    }
}
