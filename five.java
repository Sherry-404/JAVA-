/*8.2(求矩阵主对角线元素的和）编写一个方法，求 nxn 的 double 类型矩阵中主对角线上所有数宇
的和，使用下面的方法头：
public static double sumMajorDiagonal (double[][] m)*/

import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row:");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] matrix = new double[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i][i];
        }
        return sum;
    }
}
