package Arrays_Matrices;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter the element in an array: ");
        for(int i=0; i<num; i++){
            a[i] = sc.nextInt();
        }

        int min = a[0], max = a[0];
        for (int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
        sc.close();
    }   
}
/*Enter the number of elements: 
6
Enter the element in an array:
1 56 45 32 75 128 41
Maximum number is: 128
Minimum number is: 1 */