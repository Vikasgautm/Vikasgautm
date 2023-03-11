import java.util.Scanner;

public class Character {
    // import java.util.Scanner;
    // Other imports go here
    // Do NOT change the class name

    public static void main(String[] args) {
        // Write your code here
        Scanner in = new Scanner(System.in);
        char s = in.next().charAt(0);
        if (s >= 'a' && s <= 'z') {
            System.out.println("lower");
        } else {
            System.out.println("UPPER");
        }
    }
}
