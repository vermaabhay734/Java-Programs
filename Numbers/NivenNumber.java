// If the number is divisible by sum of digit with in the number then it is a Nivem Number. eg, = 10,12,18,20,21...
// All single digit number is Nivem Number. eg. 1,2,3,...,8,9.
package Numbers;

import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, digit;
        int temp = num;

        while(num!=0){
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        if(temp % sum == 0){
            System.out.println("Niven Number!");
        }else{
            System.out.println("Not Niven Number!");
        }
        sc.close();
    }
}
