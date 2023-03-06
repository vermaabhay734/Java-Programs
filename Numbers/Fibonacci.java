//fibonacci Series - 0,1,1,2,3,5,8,13,21,34.... [sum of last two number].
//Enter the number - how many digit you want from fibonacci series.
package Numbers;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number!");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2);
        for(int i=2; i<num;i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
    
}
