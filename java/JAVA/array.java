import java.util.*;

class Insert {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();

        System.out.println("Enter the elements of array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the position of element to be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter the element to be inserted");
        int ele = sc.nextInt();

        for (i = n - 1; i >= pos; i--) {
            a[i + 1] = a[i];
        }

        a[pos] = ele;
        n++;

        System.out.println("The array after insertion is");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
