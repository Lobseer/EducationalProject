package task2;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public class Circle extends Shape {
    private float radius;

    @Override
    public void print() {
        System.out.printf("%s; Radius:%d\n", pivot, radius);
    }

    @Override
    public void resize(float ratio) {
        if(ratio<0) ratio=-ratio;
        radius*=ratio;
    }
}
