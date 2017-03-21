package task2;

import javafx.geometry.Point2D;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public class Circle extends Shape {
    private float radius;

    public Circle() {
        pivot = new Point2D(0, 0);
        radius = 1;
    }

    @Override
    public void print() {
        System.out.printf("Circle(%s, %s); Radius:%s\n", pivot.getX(), pivot.getY(), radius);
    }

    @Override
    public void resize(double ratio) {
        if(ratio<0) ratio=-ratio;
        radius*=ratio;
    }
}
