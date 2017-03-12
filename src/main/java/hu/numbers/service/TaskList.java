package hu.numbers.service;

import hu.numbers.model.Task;

import java.util.*;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class TaskList {

    private final List<Task> tasks;
    private final Random random;
    private Map<String, Map<Integer, Integer>> themes;


    public TaskList(final List<Task> tasks) {
        this.tasks = tasks;
        random = new Random();
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

    /**
     * 2. feladat: Hány feladat van az adatfájlban? A választ írassa ki a képernyőre!
     *
     * @return int - a feladatok száma, pl. 49
     */
    public int getTaskCount() {
        return tasks.size();
    }

    /**
     * 3. feladat: Határozza meg, hogy hány matematika feladat van az adatfájlban,
     * és ezek közül hány feladat ér 1, 2, illetve 3 pontot!
     * A választ egész mondatban írassa ki a képernyőre!
     *
     * @param theme - a témakör neve pl. "matematika"
     * @return String - a helyes válasz
     */
    public String getThemeDetails(String theme) {
        StringBuilder sb = new StringBuilder();
        if (themes.containsKey(theme)) {
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

    /**
     * Adott témakörből öszesen hány feladatot tartalmaz az adatfájl
     *
     * @param theme - a témakör neve, pl. "matematika"
     * @return int - a kérdések száma, pl. 16
     */
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


    /**
     * 4. feladat: Mettől meddig terjed a fájlban található válaszok számértéke?
     * A választ egész mondatban írja ki a képernyőre!
     *
     * @return String - a helyes válasz
     */
    public String getValueBorders() {
        return String.format("%d - %d", getMinValue(), getMaxValue());
    }

    private int getMinValue() {
        return tasks.stream().min(Comparator.comparingInt(i -> i.getAnswer())).get().getAnswer();
    }

    private int getMaxValue() {
        return tasks.stream().max(Comparator.comparingInt(i -> i.getAnswer())).get().getAnswer();
    }

    /**
     * 5. feladat: Milyen témakörök szerepelnek ténylegesen az adatfájlban?
     * Írassa ki a témakörök nevét a képernyőre úgy, hogy minden előforduló
     * témakör pontosan egyszer jelenjen meg!
     * @return String - a helyes válasz
     */
    public String getThemes() {
        StringBuilder sb = new StringBuilder();
        themes.entrySet().forEach(i-> sb.append(i.getKey() + " "));
        return sb.toString();
    }

    /**
     * Generáljon egy 10 kérdésből álló feladatsort véletlenszerűen úgy,
     * hogy egyetlen feladat se szerepeljen benne kétszer!
     * @param countOfTasks - a feladatsor kérdéseinek száma
     * @return String - a helyes válasz (feladatsor)
     */
    public String generateExamSheet(int countOfTasks) {
        List<Integer> questions = new ArrayList<>();
        int totalPoint = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOfTasks; i++) {
            Task task = tasks.get(generateTaskNumber(questions));
            sb.append(task);
            totalPoint += task.getPoint().getPointValue();
        }
        sb.append(String.format("A feladatsorra osszesen %d pont adhato.", totalPoint));
        return sb.toString();
    }

    private int generateTaskNumber(List<Integer> questions) {
        int taskNumber;
        do {
            taskNumber = random.nextInt(getTaskCount());
        } while (questions.contains(taskNumber));
        questions.add((taskNumber));
        return taskNumber;
    }
}
