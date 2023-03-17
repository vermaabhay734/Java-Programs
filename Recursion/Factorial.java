package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        if(num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of given number is "+factorial(num));

        sc.close();
    }
}