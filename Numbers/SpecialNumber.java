// If the sum of both the digit + product of both the digit = number itself.
// eg. 19,29,39,49,59,69,79,89,99.
package Numbers;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int digit1,digit2, num = sc.nextInt();
        int result = 0;
        digit1 = num % 10;
        digit2 = num / 10;
        result = (digit1+digit2)+(digit1*digit2);
        System.out.println(num==result?"Special Numer!":"Not so Special!");
        sc.close();
    }
}
