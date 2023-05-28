package Patterns;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("Inverted Pyramid is :");
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 /*
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Inverted Pyramid is :");
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
*/
        sc.close();
    }
}
/*
Enter the number of rows: 5
Inverted Pyramid is :
*****
****
***
**
*
 */