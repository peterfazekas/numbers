package hu.numbers.service;

import hu.numbers.model.Task;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class TaskList {

    private final List<Task> tasks;
    private Map<String, Map<Integer, Integer>> themes;

    public TaskList(final List<Task> tasks) {
        this.tasks = tasks;
        createThemesMap();
    }

    private void createThemesMap() {
        themes = new TreeMap<>();
        tasks.forEach(i -> {
            String themeKey = i.getTheme();
            int pointKey = i.getPoint().getPointValue();
            int pointValue = 1;
            Map<Integer, Integer> pairs = new TreeMap<>();
            if (themes.containsKey(themeKey)) {
                pairs = themes.get(themeKey);
                pointValue = (pairs.containsKey(pointKey) ? pairs.get(pointKey) + 1 : pointValue);
            }
            pairs.put(pointKey, pointValue);
            themes.put(themeKey, pairs);
        });
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public String getThemeDetails(String theme) {
        StringBuilder sb = new StringBuilder();
        if(themes.containsKey(theme)) {
            sb.append(String.format("Az adatfájlban %d %s feladat van", getThemeTaskCount(theme), theme));
            themes.get(theme)
                    .entrySet()
                    .forEach(i -> sb.append(String.format(", %d pontot ér %d feladat", i.getKey(), i.getValue())));
            sb.append(".");
        } else {
            sb.append(String.format("Az adatfájlban nem található %s típusú feladat.", theme));
        }
        return sb.toString();
    }

    private int getThemeTaskCount(String theme) {
        return themes.entrySet()
                .stream()
                .filter(i -> i.getKey().equals(theme))
                .map(i -> i.getValue()
                        .entrySet()
                        .stream()
                        .mapToInt(j -> j.getValue())
                        .sum())
                .findFirst()
                .get();
    }
}
