class OVERRIDE {
    void circle(int r) {
        System.out.println("Area of the circle (OVERRIDE class) is " + (3.14 * r * r));
    }

    class CircleFn extends OVERRIDE {
        @Override
        void circle(int r) {
            System.out.println("Area of the circle (CircleFn class) is " + (3.14 * r * r));
        }
    }

    public static void main(String arg[]) {
        OVERRIDE a = new OVERRIDE();
        OVERRIDE.CircleFn b = a.new CircleFn();
        
        a.circle(4);
        b.circle(3);
    }
}

