import java.util.*;

public class calculator {
    public static void main(String args[]) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        if (operator == 1) {
            System.out.println(a + b);
        } else if (operator == 2) {
            System.out.println(a - b);
        } else if (operator == 3) {
            System.out.println(a * b);
        } else {
            System.out.println("Invalid Input");
        }
    }
}