package task1;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        System.out.println("m1:\n"+m1.toPrint());
        m1.transpose();
        System.out.println("m1 transpose:\n"+m1.toPrint());
        Matrix m2 = new Matrix();
        System.out.println("m2:\n"+m2.toPrint());
        System.out.println("m1 + m2:\n"+m1.sum(m2).toPrint());
        System.out.println("m1 * m2:\n"+m1.multiply(m2).toPrint());
    }
}
