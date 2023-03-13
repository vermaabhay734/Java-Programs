package Strings;

import java.util.Scanner;

public class MaxOccurreneFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String s = sc.nextLine();
        int arr[] = new int[256];

        for(int i=0; i<s.length(); i++){
            arr[(int)s.charAt(i)]++;
        }

        int m=0;

        for(int j=1; j<arr.length; j++){
            if(arr[j] > arr[m]){
                m=j;
            }
        }
        System.out.println("Max Occurring value is: "+(char)m);
        sc.close();
    }
    
}
