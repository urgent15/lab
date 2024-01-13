import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a%2==0)
        System.out.println("The number is even");
        else
        System.out.println("The number is odd");
    }
}
