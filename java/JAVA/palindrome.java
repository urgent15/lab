import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int b = a;
        int s = 0;
        while(a>0){
            int x = a%10;
            s = s*10+x;
            a = a/10;
        }
        if(s==b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
