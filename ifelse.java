import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (a > 100) {
            System.out.println("Big");
        } else if (a < 10) {
            System.out.println("Small");
        } else {
            System.out.println("Number");
        }
    }
}
