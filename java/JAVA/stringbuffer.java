public class stringbuffer{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        System.out.println(sb);
        sb.insert(0, "hello ");
        System.out.println(sb);
        sb.replace(0, 5, "hi");
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        char charAtIndex0 = sb.charAt(0);
        System.out.println(charAtIndex0);
        sb.setCharAt(0, 'j');
        System.out.println(sb);
        sb.ensureCapacity(100);
    }
}
