//Replace the given string to their next char
//eg abhay -> bcibz
//Return value is fully depend on ascii value.

package Strings;

import java.util.Scanner;

public class StringEnoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String input = sc.nextLine();
        String output = "";

        for (int i=0; i<input.length(); i++){
            output += (char) (input.charAt(i)+1);
        }
        System.out.println(output);
        sc.close();
    }
    
}
