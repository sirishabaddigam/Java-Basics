// To print Name,Age and Branch of a person from user input

import java.util.Scanner;
public class PersonDetails {
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your Name : ");
    String name = scanner.nextLine();

    System.out.print("Enter Your Age : ");
    int age = scanner.nextInt();
    
    scanner.nextLine();
    System.out.print("Enter Your Branch : ");
    String branch = scanner.nextLine();

    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
    System.out.println("Branch : "+branch);
   }
}
