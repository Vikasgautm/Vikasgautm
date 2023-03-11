import java.util.Scanner;

public class CalculatorCodeQuatient {
    // public static void main(String[] args) {
    // Scanner in = new Scanner(System.in);
    // double a = in.nextDouble();
    // double b = in.nextDouble();
    // char ch = in.next().charAt(0);
    // switch (ch) {
    // case '+':
    // System.out.println(a + b);
    // break;
    // case '-':
    // System.out.println(a - b);
    // break;
    // case '*':
    // System.out.println(a * b);
    // break;
    // default:
    // System.out.println(a / b);
    // break;
    // }
    // }

    // Other imports go here
    // Do NOT change the class nam
    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        char s = in.next().charAt(0);
        switch (s) {
            case '+':
                System.out.printf("%.2f", (a + b));
                break;
            case '-':
                System.out.printf("%.2f", (a - b));
                break;
            case '*':
                System.out.printf("%.2f", (a * b));
                break;
            default:
                System.out.printf("%.2f", (a / b));
        }
    }
}
