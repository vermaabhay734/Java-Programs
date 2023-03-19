package Arrays_Matrices;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element : ");
        int num = sc.nextInt();
        System.out.println("Enter the element : ");
        int array[] = new int[num];
        for(int i=0; i<num; i++){
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println("Sum of even : "+sum);
        sc.close();
    }
}