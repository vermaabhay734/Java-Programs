//Sum of the cube of the digit is equal to the num is known as Armstrong number
//eg. 1, 153 = 1+125+27, 370, 371, 407....
package Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum=0, digit;
        int temp = num;
        while(num!=0){
            digit = num % 10;
            sum = sum + digit*digit*digit;
            num = num / 10;
        }
        if(temp==sum){
            System.out.println("Armstrong!");
        }else{
            System.out.println("Not Armstrong!");
        }
        sc.close();
    }
    
}
