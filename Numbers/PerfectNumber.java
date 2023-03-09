// perfect no. is the number whose multiple other then the number itself add up is equal to the given number. eg 6=1+2+3, 28 = 1+2+4+7+14, 496, 8218 ...
package Numbers;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
            System.out.println("Perfect Number!");
        }else{
            System.out.println("Not Perfect!");
        }
        sc.close();
    }
    
}
