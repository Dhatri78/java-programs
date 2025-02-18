import java.util.*;

public class operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Perform all the operations and print in a single line
        int p = x + y;
        int q = x - y;
        int r = x * y;
        int s = x / y;
        int t = x % y;
        System.out.print(p + " " + q + " " + r + " " + s + " " + t);
    }
}