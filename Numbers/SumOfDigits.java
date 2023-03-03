package Numbers;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int digit, num = sc.nextInt();
        int sum = 0;
        while (num!=0) {
            digit = num%10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Total sum of all digit is: "+sum);
        sc.close();
    }
}
