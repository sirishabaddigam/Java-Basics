// To Swap Two Numbers With and Without using Third variable

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value of num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Value of num2 : ");
        int num2 = scanner.nextInt();
        
        System.out.println("After swaping two numbers with third variable");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
        
        System.out.println("After swaping two numbers without third variable");
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
    }
}
