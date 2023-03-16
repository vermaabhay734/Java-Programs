//If string is in order then it says true else false.
// eg. abcde = true,  asdew = false.
package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray).equals(input));
        sc.close();
    }
    
}
