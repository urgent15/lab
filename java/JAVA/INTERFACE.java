interface Printable {
    void print();
}

interface Showable {
    void show();
}

class MyInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("World");
    }

    public static void main(String arg[]) {
        MyInterface a = new MyInterface();
        a.print();
        a.show();
    }
}

