package task2;

import java.util.Random;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Shape[] shapes = new Shape[10];
        for (int i=0;i<shapes.length;i++) {
            if(rnd.nextInt(10)>4) {
                shapes[i]= new Circle();
            } else {
                shapes[i]= new Triangle();
            }
            shapes[i].print();
        }
        System.out.println();
        shapes[1].resize(2);
        shapes[1].print();
    }
}
