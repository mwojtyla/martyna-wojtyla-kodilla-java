package com.kodilla;

public class MatrixTransposeRunner {
    public static void main(String[] args) {
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int matrix[][] = new int[][]{{5, 3, -2},
                {-7, 4, 8},
                {2, 7, 1},
                {9, 5, 3}};

        int matrixTransposed[][] = matrixTranspose.transposition(matrix);
        for (int i = 0; i < matrixTransposed.length; i++) {
            for (int j = 0; j < matrixTransposed[i].length; j++) {
                System.out.print(matrixTransposed[i][j] + ", ");
            }
        }
    }
}
