import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculator {
    JFrame f;
    JTextField t, l;
    JButton b, add, sub, mul, div;

    public Calculator() {
        f = new JFrame("Calc");
        t = new JTextField();
        l = new JTextField();
        b = new JButton("submit");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        f.setSize(350, 400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setBounds(30, 30, 50, 35);
        l.setBounds(100, 30, 50, 35);
        b.setBounds(100, 150, 90, 35);
        add.setBounds(30, 75, 40, 30);
        sub.setBounds(80, 75, 40, 30);
        mul.setBounds(130, 75, 40, 30);
        div.setBounds(180, 75, 40, 30);
        f.add(t);
        f.add(b);
        f.add(l);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
