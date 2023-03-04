//Count the number of times a given digit occurs?

package Numbers;

import java.util.Scanner;

public class CountTheNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a Digit: ");
        Scanner sc2 = new Scanner(System.in);
        int input=sc2.nextInt();
        int count = 0;
        while (num!=0) {
            if(num%10==input){
                count++;
            }
            num = num / 10;
        }
        System.out.println("Total number of "+input+" occurs in given number is "+count);
        sc.close();
        sc2.close();
    }
}
