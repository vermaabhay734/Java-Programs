package Arrays_Matrices;

import java.util.Scanner;

public class NthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        System.out.print("Enter the element in an array: ");
        int a[] = new int[num];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("which array's element you want: ");
        int Nth = sc.nextInt();
        if(Nth<num+1){
            for(int i=0; i<a.length;i++){
                if(i+1 == Nth){
                    System.out.println("Element of "+Nth+" position is : "+a[i]);
                    break;
                }
            }
        }else{
            System.out.println("Element of "+Nth+" position not found. Please enter valid number!");
        }
        sc.close();
    }
}
/*
Enter the number of elements: 6
Enter the element in an array: 9 8 7 1 2 3
which array's element you want: 3
Element of 3 position is : 7
 */