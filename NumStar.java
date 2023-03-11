import java.util.Scanner;

public class NumStar {
    // import java.util.Scanner;
    // Other imports go here
    // Do NOT change the class name

    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // System.out.println();
    }
}
