import java.util.*;
public class STRING {
    public static void main(String args[])
    {
        String s1="Hello";
        String s2="World";
        System.out.println(s1+" "+s2);
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.isEmpty());
        System.out.println(s1.replace('e','a'));
        System.out.println(s1.substring(1,3));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
}
}
