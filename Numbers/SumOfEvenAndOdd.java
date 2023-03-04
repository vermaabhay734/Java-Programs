package Numbers;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int digit, num = sc.nextInt();
        int EvenSum=0, OddSum = 0;
        while (num!=0) {
            digit = num%10;
            if (digit%2==0){
                EvenSum = EvenSum + digit;
            }
            else{
                OddSum = OddSum + digit;
            }
            num = num / 10;
        }
        System.out.println("Total sum of Even digit is: "+EvenSum);
        System.out.println("Total sum of Even digit is: "+OddSum);
        sc.close();
    }
}
