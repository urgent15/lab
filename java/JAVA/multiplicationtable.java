import java.util.Scanner;
public class multiplicationtable {
    public static void main (String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i=1;i<=10;i++) {
            System.out.println(a+"*"+i+"="+a*i);
        }
    }
}
