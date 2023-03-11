import java.util.Scanner;
import java.util.*;

public class Armstrong {
    // import java.util.Scanner;
    // Other imports go here
    // Do NOT change the class name

    public static void main(String[] args) {
        // Other imports go here
        // Do NOT change the class nam
        // Write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m, sum = 0, count = 0, rev=0;
        m = n;
        while (m != 0) {
            m = m % 10;
            count++;
        }
        m = n;
        while (n != 0) {
            rev = n % 10;
            n = n / 10;
            sum += Math.pow(rev, count);
        }
        if (m == sum) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }
}
