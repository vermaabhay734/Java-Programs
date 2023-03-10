package Strings;

import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string.");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "";
        for(int i=input.length()-1; i>=0; i--){
            output += input.charAt(i);
        }
        if(output.equals(input)){
            System.out.println("Pallindrome string");
        }else{
            System.out.println("Not Pallindrome!");
        }
        sc.close();
    }
}
