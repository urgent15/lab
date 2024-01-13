import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        char a;
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        System.out.println("The character is a vowel");
        else
        System.out.println("The character is a consonant");
    }
}
