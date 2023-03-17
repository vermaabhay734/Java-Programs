package Recursion;

import java.util.Scanner;

public class SumOfNumber {
    public static int sum(int num){
        if(num == 0){
            return 1;
        }else{
            return num + sum(num - 1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Sum of number: "+sum(num));
        sc.close();
    }
}
