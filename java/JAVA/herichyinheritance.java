import java.util.*;
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("B");
    }
}
class C extends A{
    C(){
        super();
        System.out.println("C");
    }

public static void main(String args[]){
B b=new B();
C c=new C();
}
}