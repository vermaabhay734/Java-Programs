package Arrays_Matrices;

import java.util.Scanner;

public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        System.out.println("Enter the number of element: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the element: ");
        int a[] = new int[num];
        for(int i = 0; i<num; i++){
            a[i] = sc.nextInt();
        }
        int nSum=0, pSum=0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0 && a[i] != 0){
                nSum += a[i];
            }else if(a[i] > 0 && a[i] != 0){
                pSum += a[i];
            }
        }
        System.out.println("Sum of positive numbers : "+pSum);
        System.out.println("Sum of negative numbers : "+nSum);
        sc.close();
    }
}
