package hu.numbers.data.parse;

import hu.numbers.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class DataParser {

    private static final String SEPARATOR = " ";

    public List<Task> parser(final List<String> lines) {
        List<Task> dataList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i+=2) {
            dataList.add(createTask(lines.get(i), lines.get(i+1)));
        }
        return dataList;
    }

    private Task createTask(final String question, final String details) {
        String[] items = details.split(SEPARATOR);
        int answer = Integer.parseInt(items[0]);
        int point = Integer.parseInt(items[1]);
        String theme = items[2];
        return new Task(question, answer, point, theme);
    }
}
