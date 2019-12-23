package io.juanqui89.github.matrixspiral;

// --- Directions
// Write a function that accepts an integer N
// and returns a NxN spiral matrix.
// --- Examples
//   matrix(2)
//     [[1, 2],
//     [4, 3]]
//   matrix(3)
//     [[1, 2, 3],
//     [8, 9, 4],
//     [7, 6, 5]]
//  matrix(4)
//     [[1,   2,  3, 4],
//     [12, 13, 14, 5],
//     [11, 16, 15, 6],
//     [10,  9,  8, 7]]


public class MatrixSpiral {

  public static int[][] matrixSpiral(int n) {
    int [][] m = new int[n][n];
    int num = 1;

    for (int row = 0; row < n; row++) {


      for (int col = 0; col < n ; col++) {
        m[row][col] = num++;
      }

    }
    return m;
  }

  public static void printMatrixSpiral(int[][] m) {
    for (int row = 0; row < m.length ; row++) {
      for (int col = 0; col < m[row].length ; col++) {
        System.out.print(m[row][col] );

      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int m [][] = matrixSpiral(3);
    int mm [][] = {
            {1,2},
            {3,4}
    };
    printMatrixSpiral(m);
  }

}
