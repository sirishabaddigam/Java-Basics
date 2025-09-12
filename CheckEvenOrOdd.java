import java.util.Scanner;

public class CheckEvenOrOdd{
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int number=scanner.nextInt();
    if(number%2==0){
        System.out.println(number+" is Even Number");
    }  else{
        System.out.println(number+" is Odd Number");
       }
    }
}