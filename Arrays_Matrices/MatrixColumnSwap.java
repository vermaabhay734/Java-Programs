package Arrays_Matrices;

import java.util.Scanner;

public class MatrixColumnSwap {
    public static void main(String[] args) {
        System.out.println("Matrix Column Swap");
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        int a[][] = new int [m][n];
        
        System.out.println("Enter the elements of matrix");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter Columns to swap: ");
        int swapcol1 = sc.nextInt();
        int swapcol2 = sc.nextInt();

        int temp = 0; 
        for(int i=0; i<m; i++){
            temp = a[i][swapcol1-1];
            a[i][swapcol1-1] = a[i][swapcol2 -1];
            a[i][swapcol2-1] = temp;
        }

        System.out.println("Swapped matrix is : ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
Matrix Column Swap
Enter the number of rows: 3
Enter the number of rows: 3
Enter the elements of matrix
1
2 
3
4
5
6
7
8
9
Matrix is :
1 2 3
4 5 6
7 8 9
Enter Columns to swap: 2
3
Swapped matrix is :
1 3 2
4 6 5
7 9 8
 */