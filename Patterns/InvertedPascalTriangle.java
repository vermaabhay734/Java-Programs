package Patterns;

import java.util.Scanner;

public class InvertedPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                if(j<=row-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=row-1; i>=1; i--){
            for(int j=1; j<=row; j++){
                if(j<=row-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter the number of rows: 5
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
 */