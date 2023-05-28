package Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.println("Half pyramid is: ");
        for(int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter the number of rows: 5
Half pyramid is:
*
**
***
****
*****
 */