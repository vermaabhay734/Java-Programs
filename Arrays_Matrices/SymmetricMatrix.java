//A symmetric matrix is a square matrix in which the transpose of square matrix is the same as the original square matrix.

package Arrays_Matrices;

import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        if (row != col){
            System.out.print("Row and column should be equal for symmetric matrix.");
        }else{
            int a[][] = new int[row][col];
            
            System.out.println("Enter the matrix: ");
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

            System.out.println("Transpose Matrix is: ");
            for(int i=0; i<col; i++){
                for(int j=0; j<row; j++){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
            Boolean flag = true;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(a[i][j] != a[j][i]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println("Yes, it is Symmetric Matrix.");
            }else{
                System.out.println("It is Asymmetric Matrix.");
            }
        }
        sc.close();
    }
}
/*
Enter the number of rows: 3
Enter the number of columns: 3
Enter the matrix:
1 2 1
2 1 2
1 2 1
Matrix is:
1 2 1
2 1 2
1 2 1
Transpose Matrix is:
1 2 1
2 1 2
1 2 1
Symmetric Matrix.
*/