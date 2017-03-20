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
    public abstract void resize(float ratio);
    public void move(Point2D direction) {
        pivot.add(direction);
    }
}
