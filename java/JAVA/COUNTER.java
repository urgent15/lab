public class COUNTER {
    int count=5;
    COUNTER(){
        count++;
        System.out.println(count);
    }
    public static void main(String arg[]){
        COUNTER a=new COUNTER();
    }
}
