package Arrays_Matrices;

import java.util.Scanner;

public class MatrixRowSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        System.out.println("Enter the element of matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter rows to swap: ");
        int swaprow1 = sc.nextInt();
        int swaprow2 = sc.nextInt();

        int temp = 0; 
        for(int i=0; i<row; i++){
            temp = a[swaprow1-1][i];
            a[swaprow1-1][i] = a[swaprow2-1][i];
            a[swaprow2-1][i] = temp;
        }

        System.out.println("Matrix after swap: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter the number of rows: 3
Enter the number of columns: 3
Enter the element of matrix:
1 2 3
4 5 6
7 8 9
Matrix is:
1 2 3
4 5 6
7 8 9
Enter rows to swap: 1 3
Matrix after swap:
7 8 9
4 5 6
1 2 3
*/