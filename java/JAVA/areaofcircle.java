import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        int r; double s,pi=3.14;
        System.out.println("Enter the radius of the circle");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        s = pi*r*r;
        System.out.println("Area of the circle is "+s);
    }
}
