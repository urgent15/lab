import java.util.*;
class CLASSANDOBJECT
{
    int r,l,b;
    public static void main(String[] args)
    {
        CLASSANDOBJECT a=new CLASSANDOBJECT();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        a.r=sc.nextInt();
        System.out.println("Enter the length and breadth of the rectangle");
        a.l=sc.nextInt();
        a.b=sc.nextInt();
        System.out.println("Area of the circle is "+(3.14*a.r*a.r));
        System.out.println("Area of the rectangle is "+(a.l*a.b));
    }
}