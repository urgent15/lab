import java.util.Scanner;
public class posneg {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a>0)
        System.out.println("The number is positive");
        else 
        System.out.println("The number is negative");
    }
}

