package Strings;

import java.util.Scanner;

public class MiddleCharFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String input = sc.nextLine();
        int length = input.length();
        if((input.length())%2 == 0){
            System.out.println(((char)(input.charAt(length/2-1)))+""+((char)(input.charAt(length/2))));
        }else{
            System.out.println((char)(input.charAt(length/2)));
        }
        sc.close();
    }
}
