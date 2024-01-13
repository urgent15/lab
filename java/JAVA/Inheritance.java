public class Inheritance {
    int salary = 40000;
}
class Programmer extends Inheritance {
    int bonus = 10000;
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
        System.out.println("Programmer net salary is:" + (p.salary + p.bonus));
    }
}