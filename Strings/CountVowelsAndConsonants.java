package Strings;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u' ){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Total number of Vowels: "+vowels);
        System.out.println("Total number of Consonants: "+consonants);
        sc.close();
    }
}