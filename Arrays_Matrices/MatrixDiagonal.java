package Arrays_Matrices;

import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        System.out.println("Enter matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal elements are:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    System.out.print(a[i][j]);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter the number of rows: 3
Enter the number of columns:  3
Enter matrix:
1 2 3    
4 5 6
7 8 9
Diagonal elements are:
1
  5
    9
*/