import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p = in.nextDouble();
        double r = in.nextDouble();
        double t = in.nextDouble();
        double ci = p * (Math.pow((1 + r / 100), t));

        System.out.printf("%.1f", ci);
        in.close();
    }
}
