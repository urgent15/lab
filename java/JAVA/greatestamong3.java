import java.util.*;
public class greatestamong3 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>b && a>c)
        System.out.println("A is greater than B and C");
        else if (b>a && b>c)
        System.out.println("B is greater than A and C");
        else
        System.out.println("C is greater than A and B");
    }
}
