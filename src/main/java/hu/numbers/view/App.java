package hu.numbers.view;

import hu.numbers.data.api.GetData;
import hu.numbers.service.TaskList;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class App {

    private final GetData data;
    private final TaskList tasks;

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    public App() {
        data = new GetData("felszam.txt", "tesztfel.txt");
        tasks = new TaskList(data.getFromFile());
    }

    private void println() {
        System.out.println("2. feladat: " + tasks.getTaskCount());
        System.out.println("3. feladat: " + tasks.getThemeDetails("matematika"));
        System.out.println("4. feladat: A válaszok számértékének szélsőértékei: " + tasks.getValueBorders());
        System.out.println("5. feladat: A témakörök nevei: " + tasks.getThemes());

        data.println(tasks.generateExamSheet(10));
    }
}
