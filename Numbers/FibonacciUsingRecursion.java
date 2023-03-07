package Numbers;

import java.util.Scanner;

public class FibonacciUsingRecursion {

    private static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0; i<num; i++){
            System.out.print(fibonacci(i)+" ");
        }
        sc.close();
    }
}
