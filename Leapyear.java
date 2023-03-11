import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter any year ... ");
        int n = in.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0 && n % 100 == 0) {
            System.out.println(" leap year");
        } else {
            System.out.println("not leap year");
        }
        in.close();
    }
}
