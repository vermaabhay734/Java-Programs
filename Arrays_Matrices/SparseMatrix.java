// when majority of elements in a matrix is zero, it is called sparse matrix. 
package Arrays_Matrices;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        System.out.println("Enter the elements");
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(a[i][j] == 0){
                    count++;
                }
            }
        }

        if((row*col)/2<count){
            System.out.print("Yes it is sparse matric");
        }else{
            System.out.print("Not a sparse matrix");
        }

        sc.close();
    }
}
/*
Enter the number of rows: 3 
Enter the number of Columns: 3
Enter the elements
1 0 0
20 0 3
0 0 1
Yes it is sparse matric
 */