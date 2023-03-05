package Numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int digit, num = sc.nextInt();
        int reverse = 0;
        while (num!=0) {
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse is: "+reverse);
        sc.close();
    }
}
