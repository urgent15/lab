import java.util.*;
public class calswitch {
    public static void main(String[] args) {
        int a,b,ch;
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter your choice");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        ch = sc.nextInt();
        switch(ch) {
            case 1:
            System.out.println("Addition of two numbers is "+(a+b));
            break;
            case 2:
            System.out.println("Subtraction of two numbers is "+(a-b));
            break;
            case 3:
            System.out.println("Multiplication of two numbers is "+(a*b));
            break;
            case 4:
            System.out.println("Division of two numbers is "+(a/b));
            break;
            case 5:
            System.out.println("Modulus of two numbers is "+(a%b));
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
