import java.util.Scanner;

public class POC {
    public static void main(String[] args) {
        double r, perimeter, pi = 3.14;
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of the circle is " + perimeter);
    }
}
