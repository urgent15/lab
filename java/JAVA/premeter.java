import java.util.Scanner;
public class premeter{
    public static void main(String[] args) {
        double s,r,pi=3.14;
        System.out.println("Enter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        s = pi*r*r;
        System.out.println("Area of the circle is "+s);
    }
}
