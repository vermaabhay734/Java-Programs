package Arrays_Matrices;

import java.util.Scanner;

public class MiniPeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the element of an array: ");
        for(int i=0; i<num; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Mini peaks are: ");
        for(int i=1; i<a.length-1; i++ ){
            if(a[i]> a[i-1] && a[i] > a[i+1]){
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }   
}
/*
Enter number of element: 
6
Enter the element of an array:
1 3 2 5 9 4
Mini peaks are:
3 9
 */