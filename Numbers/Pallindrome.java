package Numbers;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int digit, num = sc.nextInt();
        int reverse = 0, temp = num;
        while (num!=0) {
            digit = num%10;
            reverse = reverse*10 + digit;
            num = num / 10;
        }
        if (temp == reverse){
            System.out.println("yes it is Pallindrome!");
        }else{
            System.out.println("Not Pallindrome!");
        }
        sc.close();
    }
}
