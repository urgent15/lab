import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a year");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a%4==0)
        System.out.println("The year is a leap year");
        else
        System.out.println("The year is not a leap year");
    }
}
