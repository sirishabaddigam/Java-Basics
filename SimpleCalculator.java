import java.util.Scanner;

class SimpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a value : ");
        int a = sc.nextInt();
        System.out.print("Enter the b value : ");
        int b = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("a + b : "+ (a + b));
                break;
            case '-':
                System.out.println("a - b : "+ (a - b));
                break;
            case '*':
                System.out.println("a * b : "+ (a * b));
                break;
            case '/':
                System.out.println("a / b : "+ (a / b));
                break;
            case '%':
                System.out.println("a % b : "+ (a % b));
                break;
            default:
                System.out.println("Enter a valid operator.");
        }
    }
}