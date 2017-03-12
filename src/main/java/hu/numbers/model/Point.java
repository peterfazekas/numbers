package hu.numbers.model;

/**
 * @author Peter_Fazekas on 2017.03.12..
 */
public enum Point {

    ONE(1), TWO(2), THREE(3);

    private final int pointValue;

    Point(final int pointValue) {
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    public static Point fromValue(final int value) {
        Point pointValue = null;
        for (Point point : Point.values()) {
            if (point.pointValue == value)
                pointValue = point;
        }
        return pointValue;
    }
}
