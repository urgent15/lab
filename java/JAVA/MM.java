import java.util.*;

public class MM {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i, j, k, ch;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter matrix A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Enter matrix B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = s.nextInt();
            }
        }
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Transpose");
        System.out.print("Enter your choice: ");
        ch = s.nextInt();
        
        switch (ch) {
            case 1:
                System.out.println("Addition:");
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
                break;
            case 2:
                System.out.println("Subtraction:");
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        c[i][j] = a[i][j] - b[i][j];
                    }
                }
                break;
            case 3:
                System.out.println("Multiplication:");
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        c[i][j] = 0;
                        for (k = 0; k < 3; k++) {
                            c[i][j] += a[i][k] * b[k][j];
                        }
                    }
                }
                break;
            case 4:
                System.out.println("Transpose of A:");
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        c[i][j] = a[j][i];
                    }
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        
        // Print the resulting matrix
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
