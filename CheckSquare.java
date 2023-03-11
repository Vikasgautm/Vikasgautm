import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0) {
            int a = (int) Math.sqrt(n);
            if ((a * a) == n) {
                System.out.println("number is perfect square ");
            } else {
                System.out.println("not square");
            }
            in.close();
        }
    }
}
