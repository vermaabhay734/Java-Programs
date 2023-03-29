//A transpose is switching the rows to columns
package Arrays_Matrices;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
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
        sc.close();
    }
}
/*Enter the number of rows: 3
Enter the number of columns: 3
Enter the matrix:
1 2 3 4 5 6 7 8 9
Matrix is:
1 2 3
4 5 6
7 8 9
Transpose Matrix is:
1 4 7
2 5 8
3 6 9*/