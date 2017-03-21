package task2;

import javafx.geometry.Point2D;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public abstract class Shape {
    protected Point2D pivot;

    public abstract void print();
    public abstract void resize(double ratio);
    public void move(double xDir, double yDir) {
        pivot.add(new Point2D(xDir, yDir));
    }
}
