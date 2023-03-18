// 2 power 3 -> 8
// base - 2, exponent - 3 
package Recursion;

import java.util.Scanner;

public class Power {
    public static int power(int base, int exponent){
        if(exponent == 1){
            return base;
        }else{
            return base*power(base, exponent-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int exponent = sc.nextInt();
        System.out.println(power(base, exponent));
        sc.close();
    }
}
