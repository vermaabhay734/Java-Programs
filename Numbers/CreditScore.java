// credit score = 400 - 600 --> issue silver card,
// credit score = 600 - 800 --> issue Gold card,
// credit score = 800 - 900 --> issue platinum card,
// other than that -> invalid Credit score

package Numbers;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        System.out.println("Enter a credit score: ");
        Scanner sc =new Scanner(System.in);
        int score = sc.nextInt();

        if (score < 400 || score > 900){
            System.out.println("Invalid Credit Score!");
        }
        else{
            if (score>=400 && score<600){
                System.out.println("Silver Card!");
            }else if (score>=600 && score<800){
                System.out.println("Gold Card!");
            }else{
                System.out.println("Platinum Card!");
            }
        }
        sc.close();
    }   
}