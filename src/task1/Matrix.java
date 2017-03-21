package task1;

import java.util.Random;

/**
 * The class is a square matrix and contain methods for performing base matrix operations
 */
public class Matrix {
    private double[][] matrix;
    private int size;

    public Matrix() {
        size = 3;
        matrix = new double[size][size];
        fillRandom();
    }

    public Matrix(int size) {
        matrix = new double[size][size];
        fillRandom();
    }

    private void fillRandom() {
        Random rnd = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j]=rnd.nextInt(21)-10;
            }
        }
    }

    /**
     * Prepare matrix for printing
     * @return formatted string to toPrint
     */
    public String toPrint() {
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

    /**
     * Multiply this matrix on the multiplier matrix. Use the matrix multiplication algorithm.
     * This method don`t change this matrix and return new result matrix.
     * @param multiplier The matrix is a multiplier.
     * @return New matrix is the result of multiplying two matrix
     */
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
        Matrix result = new Matrix();
        result.matrix = temp;
        return result;
    }

    /**
     * Add this matrix to the term matrix.
     * @param term The matrix is a term
     * @return Matrix is the sum of two matrix
     */
    public Matrix sum(Matrix term) {
        if (size != term.size) return null;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] += term.matrix[i][j];
            }
        }
        return this;
    }

    /**
     * Transpose matrix
     */
    public void transpose() {
        double temp;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
