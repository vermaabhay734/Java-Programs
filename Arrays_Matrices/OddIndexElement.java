package Arrays_Matrices;

import java.util.Scanner;

public class OddIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.print("Enter the elements in an array: ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Odd index elements are: ");
        for(int i=0; i<a.length; i=i+2){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
/*
Enter the number of elements: 8    
Enter the elements in an array: 1 2 3 4 5 6 7 8
Odd index elements are: 1 3 5 7
 */