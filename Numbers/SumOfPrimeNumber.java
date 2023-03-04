package Numbers;

import java.util.Scanner;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0,digit=0;
        while (num!=0) {
            digit = num%10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7 ){
                sum = sum + digit;
            }
            num = num / 10;
        }
        System.out.println("Total sum of all digit is: "+sum);
        sc.close();
    }
}
