// To print The sum of two Numbers

import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value of num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Value of num2 : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println(num1 +" + "+num2+" = "+sum);
    }
}
