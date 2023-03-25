package Arrays_Matrices;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        System.out.println("Enter first matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int b[][] = new int[m][n];
        System.out.println("Enter Second matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[m][n];
        System.out.println("Addtion of both matrixes ");
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                c[i][j] = a[i][j] +b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/* 
Enter the number of rows: 2
Enter the number of columns: 2
Enter first matrix
1 2
3 4
Enter Second matrix
9 8
7 6
Addtion of both matrixes
10 10
10 10
*/