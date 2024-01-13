import java.util.Scanner;
public class sodwloop {
    public static void main(String[] args){
        int a,s=0,i,x;
        System.out.println("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(i=1;a>0;i++){
            x = a%10;
            s = s+x;
            a = a/10;
        }
        System.out.println("Sum of digits is: "+s);
    }
}
