import java.util.*;
import java.io;

public class swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}