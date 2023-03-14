//Remove vowels from input string
package Strings;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();

        //one line method
        //System.out.println(input.replaceAll("[aeiou]", ""));

        StringBuffer output = new StringBuffer();

        for (int i=0; i<input.length();i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' ||input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u'){
                continue;  
            }else{
                output.append(input.charAt(i));
            }
        }
        System.out.println(output);
        sc.close();
    }
}
