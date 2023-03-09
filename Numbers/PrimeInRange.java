//Print all the prime in the given range!
package Numbers;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start!");
        int start = sc.nextInt();
        System.out.println("Enter a end!");
        int end = sc.nextInt();

        for(int i=start; i<=end;i++){
            int count=0;
            if(i>1){
                for(int j=2; j<i/2; j++){
                    if(i%j==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
}
