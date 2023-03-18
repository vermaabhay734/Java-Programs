package Arrays_Matrices;

import java.util.Scanner;


public class ArrayFromUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number of elements");
        int num = sc.nextInt();
        System.out.println("Enter elements for array ");
        int a[] = new int[num];
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Entered Elements is : ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    
}
