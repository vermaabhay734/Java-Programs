package Numbers;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=0){
            //System.out.println("Invalid number: "+num);
            throw new IllegalArgumentException("Invalid number: "+num);
        }
        else{
            if(num%2 == 0){
                System.out.println(num+" is even");
            }
            else{
                System.out.println(num+" is odd");
            }
        }
        sc.close();
    }
}