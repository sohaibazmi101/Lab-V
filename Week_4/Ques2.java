package Week_4;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows of matrix: ");
        row = scanner.nextInt();
        System.out.print("Enter number of column of column: ");
        col = scanner.nextInt();
        int[][] matrix1 = new int[row][col];
        System.out.print("Enter the elements of first Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        int[][] matrix2 = new int[row][col];
        System.out.print("Enter the elements of second Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Elements of first matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" "+matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elements of Second matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" "+matrix2[i][j]);
            }
            System.out.println();
        }
        int[][] sum = new int[row][col];
        System.out.println("Sum of Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
