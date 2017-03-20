package task1;

import java.util.Arrays;

/**
 * Class description
 *
 * @author lobseer on 20.03.2017.
 */

public class Matrix {
    private double[][] matrix;
    private int size;

    public Matrix() {
        size = 10;
        matrix = new double[size][size];
        for (double[] row : matrix) {
            Arrays.fill(row, 5);
        }
    }

    public Matrix(int size) {
        matrix = new double[size][size];
        for (double[] row : matrix) {
            Arrays.fill(row, 5);
        }
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            for (double val : row) {
                sb.append(val);
                sb.append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public double getElement(int i, int j) {
        return matrix[i][j];
    }

    public void setElement(int i, int j, double value) {
        matrix[i][j] = value;
    }

    public Matrix multiply(Matrix multiplier) {
        if (size != multiplier.size) return null;
        double[][] temp = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    temp[i][j] += matrix[i][k] * multiplier.matrix[k][j];
                }
            }
        }
        matrix = temp;
        return this;
    }

    public Matrix add(Matrix multiplier) {
        if (size != multiplier.size) return null;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] += multiplier.matrix[i][j];
            }
        }
        return this;
    }

    public void transponate() {
        double temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
