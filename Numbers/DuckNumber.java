//Duck Number = Those number which have zero in it. eg. 2015406,
//0123,1236,789 - Not a Duck Number
package Numbers;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean temp=false;
        while (num!=0) {
            if(num%10 == 0){
                temp=true;
                break;
            }
            num = num / 10;
        }
        if (temp){
            System.out.println("Given number is Duck Number!");
        }else{
            System.out.println("Given number is not a Duck Number!");
        }
        sc.close();
    }
}
