package Arrays_Matrices;

import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int num = sc.nextInt();
        System.out.println("Enter the elements: ");
        int a[] = new int[num];
        for (int i = 0; i<num; i++ ){
            a[i] = sc.nextInt();
        }
        int rev[]= new int[num];
        for (int i=0, j=a.length; i<a.length; i++, j--){
            rev[j-1] = a[i]; 
        }
        System.out.println("Reversed array is: ");
        for (int i = 0; i<num; i++ ){
            System.out.print(rev[i]+ " ");
        }
        sc.close();
    }
}

/*
Enter the number of element: 
6
Enter the elements:
1 2 3 4 5 6
Reversed array is:
6 5 4 3 2 1
*/