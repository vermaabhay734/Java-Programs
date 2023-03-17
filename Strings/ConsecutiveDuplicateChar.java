//Consecutive Duplicate character checker
package Strings;

import java.util.Scanner;

public class ConsecutiveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String input = sc.nextLine();
        for(int i = 0; i<input.length()-1; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                System.out.println("true");
                break;
            }
        }
        System.out.println("Didn't find consecutive character!");
        sc.close();
    }
}
