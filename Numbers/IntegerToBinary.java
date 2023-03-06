package Numbers;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int second = num;
        int[] bin= new int[10];
        int i=0;
        while(num!=0){
            bin[i] = num % 2;
            num = num / 2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
        System.out.println();

        //Another method
        System.out.println(Integer.toBinaryString(second));
        sc.close();
    }
}
