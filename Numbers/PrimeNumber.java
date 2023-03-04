package Numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp=0;
        if(num<2){
            System.out.println("Not a prime Number!");
        }else{

            for(int i=2; i<=num/2; i++){
                if (num%i==0){
                    temp++;
                }
            }
            if (temp==0) {
                System.out.println("Number is Prime");
            }else{
                System.out.println("Number is not Prime");
            }
        }
        sc.close();
    }
}
