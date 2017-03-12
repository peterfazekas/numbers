package hu.numbers.model;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public class Task {

    private final String question;
    private final int answer;
    private final Point point;
    private final String theme;

    public Task(final String question, final int answer, final int point, final String theme) {
        this.question = question;
        this.answer = answer;
        this.point = Point.fromValue(point);
        this.theme = theme;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public Point getPoint() {
        return point;
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public String toString() {
        return  String.format("%d %d %s", point.getPointValue(), answer, question);
    }
}
