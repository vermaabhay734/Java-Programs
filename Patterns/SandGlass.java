package Patterns;

import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int row = sc.nextInt();

        for (int i=0; i<=row-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=i; k<=row-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row-1; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=row-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter the number of row: 5
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *
 */