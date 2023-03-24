package Arrays_Matrices;

import java.util.Scanner;

public class LastMElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        System.out.print("Enter the element in an array: ");
        int a[] = new int[num];
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number of last elements to display: ");
        int m = sc.nextInt();
        if(m>num){
            System.out.print("Last "+m+" elements are : ");
            for(int i=num-m; i<a.length; i++){
                System.out.print(a[i]+" ");
            }
        }else{
            System.out.println("Please enter the valid input.");
        }
        sc.close();
    }   
}
/*
Enter the number of elements: 6 
Enter the element in an array: 1 2 3 4 5 6
Enter the number of last elements to display: 3
Last 3 elements are : 4 5 6
 */