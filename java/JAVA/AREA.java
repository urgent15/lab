public class AREA {
    int r;
    
    void area(int side){
        System.out.println("Area of the square is " + (side * side));
    }
    
    class Rectangle {
        int l, b;
        
        void area(int length, int breadth){
            l = length;
            b = breadth;
            System.out.println("Area of the rectangle is " + (l * b));
        }
    }
    
    public static void main(String arg[]){
        AREA a = new AREA();
        a.area(5);           
        AREA.Rectangle rect = a.new Rectangle();
        rect.area(5, 6);   
    }
    
}
