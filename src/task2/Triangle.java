package task2;

import javafx.geometry.Point2D;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public class Triangle extends Shape {
    private Point2D vertex1;
    private Point2D vertex2;
    private Point2D vertex3;

    public Triangle() {
        pivot = Point2D.ZERO;
        vertex1 = new Point2D(-1,0);
        vertex2 = new Point2D(1,0);
        vertex3 = new Point2D(0,1);
    }

    @Override
    public void print() {
        System.out.printf("Triangle(%s, %s); V1(%s, %s), V2(%s, %s), V3(%s, %s)\n",
                pivot.getX(), pivot.getY(), vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY(), vertex3.getX(), vertex3.getY());
    }

    @Override
    public void resize(double ratio) {
        if(ratio<0) ratio=-ratio;
        vertex1 = vertex1.multiply(ratio);
        vertex2 = vertex2.multiply(ratio);
        vertex3 = vertex3.multiply(ratio);
    }
}
