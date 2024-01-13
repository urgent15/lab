import java.util.Scanner;
public class greatestamong2
  {
  public static void main(String[] args) {
    int a,b;
    System.out.println("Enter two numbers");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    if (a>b)
    System.out.println("A is greater than B");
    else
    System.out.println("B is greater than A");
  }
}
