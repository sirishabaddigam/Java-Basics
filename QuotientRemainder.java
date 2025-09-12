// To print Quotient and Remainder

import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Divident : ");
        int divident = scanner.nextInt();
        System.out.print("Enter Devider : ");
        int devider = scanner.nextInt();
        
        int quotient = divident / devider;
        int remainder = divident % devider;

        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder : "+remainder);
    }
}
