package Strings;

import java.util.Scanner;

public class EvenWordPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string!");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        for(int i=0; i<words.length; i++){
            if(words[i].length()%2==0){
                System.out.println(words[i]);
            }
        }

        sc.close();
    }
}
