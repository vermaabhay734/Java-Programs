//Sum of Multiple of 3

package Numbers;

import java.util.Scanner;

public class SumOfMultiple {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0, sum=0;
        while(num!=0){
            digit = num % 10;
            if(digit%3==0){
                sum = sum + digit;
            }
            num = num / 10;
        }
        System.out.println("Total sum of all digit is: "+sum);
        sc.close();   
    }
}
