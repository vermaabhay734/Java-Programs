package Arrays;

import java.util.Scanner;


public class ArrayFromUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number of elements");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter elements for array ");
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
    
}
