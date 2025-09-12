// To print the largest number among three numbers

import java.util.Scanner;
public class LargestOfThree {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = scanner.nextInt();
        System.out.print("Enter value of b : ");
        int b = scanner.nextInt();
        System.out.print("Enter value of c : ");
        int c = scanner.nextInt();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Largest number is: " + largest);
    }
}
