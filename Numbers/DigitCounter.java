package Numbers;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;
        while (num!=0) {
            counter++;
            num = num / 10;
        }
        System.out.println("Total digit is: "+counter);
        sc.close();
    }
}
