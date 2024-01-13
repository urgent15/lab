import java.io.*;
class sumof2
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        System.out.println("Enter two numbers");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("Sum of two numbers is "+c);
    }
}
