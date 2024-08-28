package Week_5;

import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the number of Rows : ");
        row = scanner.nextInt();
        System.out.println("Enter the number of colunm : ");
        col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int[][] tranposeMatrix = new int[col][row];
        System.out.print("Enter the Elements of Array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" "+matrix[i][j]);
            }System.out.println();
        }
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                tranposeMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of array : ");
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(" "+tranposeMatrix[i][j]);
            }System.out.println();
        }
        scanner.close();
    }
}
