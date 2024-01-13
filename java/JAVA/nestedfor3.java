public class nestedfor3 {
    public static void main(String arg[]) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j=j-1) {
System.out.print(j);
            }
            System.out.println();
        }
    }
}
