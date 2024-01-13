import java.util.*;

class Emp {
    String ecode, ename;
    int bpay;

    void getdata() {
        System.out.println("Enter the employee code, name and basic pay");
        Scanner sc = new Scanner(System.in);
        ecode = sc.next();
        ename = sc.next();
        bpay = sc.nextInt();
    }
}

class Allowance extends Emp {
    int hra, da, ta, gp;

    void calculation() {
        hra = bpay * 10 / 100;
        da = bpay * 12 / 100;
        ta = bpay * 5 / 100;
        gp = bpay + hra + da + ta;
        System.out.println("Gross pay is " + gp);
    }
}

class Employee extends Allowance {
    int pf, hp;

    void clapf() {
        pf = bpay * 15 / 100;
        hp = gp - pf;
        System.out.println("Net pay is " + hp);
    }

    public static void main(String args[]) {
        Employee e = new Employee();
        e.getdata();
        e.calculation();
        e.clapf();
    }
}
