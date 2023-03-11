import java.util.Scanner;

public class Arthmatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String s = in.next();
        if (s.equals("+")) {
            System.out.println(a + b);
        } else if (s == "-") {
            System.out.println(a - b);
        } else if (s == "*") {
            System.out.println(a * b);
        } else if (s == "/") {
            System.out.println(a / b);
        }
        in.close();

    }
}
