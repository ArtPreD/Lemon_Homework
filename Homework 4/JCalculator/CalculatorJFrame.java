import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorJFrame extends JFrame implements ActionListener{

    JTextPane textArea;
    boolean isNumber;

    public static void main(String[] args) {

        new CalculatorJFrame();

    }

    public CalculatorJFrame(){
        super("Calculator");
        showCalculator();
        setLayout(null);
        setSize(330, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void showCalculator() {
        int x = 10;
        int y = 10;
    textArea = new JTextPane();
    textArea.setEnabled(false);
    textArea.setBounds(x, y, 290, 40);
    add(textArea);

    y += 50;

        JButton n = new JButton("1");
        n.setBounds(x, y, 50, 50);
        add(n);
        n.addActionListener(this);
        x+=60;
        JButton n1 = new JButton("2");
        n1.setBounds(x, y, 50, 50);
        add(n1);
        n1.addActionListener(this);
        x+=60;
        JButton n2 = new JButton("3");
        n2.setBounds(x, y, 50, 50);
        add(n2);
        n2.addActionListener(this);
        x+=60;
        JButton n9 = new JButton("/");
        n9.setBounds(x, y, 50, 50);
        n9.addActionListener(this);
        add(n9);
        x+=60;
        JButton n15 = new JButton("CE");
        n15.setBounds(x, y, 50, 50);
        n15.addActionListener(this);
        add(n15);


        x=10;
        y+=60;
        JButton n3 = new JButton("4");
        n3.setBounds(x, y, 50, 50);
        add(n3);
        n3.addActionListener(this);
        x+=60;
        JButton n4 = new JButton("5");
        n4.setBounds(x, y, 50, 50);
        add(n4);
        n4.addActionListener(this);
        x+=60;
        JButton n5 = new JButton("6");
        n5.setBounds(x, y, 50, 50);
        add(n5);
        n5.addActionListener(this);
        x+=60;
        JButton n10 = new JButton("*");
        n10.setBounds(x, y, 50, 50);
        n10.addActionListener(this);
        add(n10);

        x=10;
        y+=60;
        JButton n6 = new JButton("7");
        n6.setBounds(x, y, 50, 50);
        add(n6);
        n6.addActionListener(this);
        x+=60;
        JButton n7 = new JButton("8");
        n7.setBounds(x, y, 50, 50);
        add(n7);
        n7.addActionListener(this);
        x+=60;
        JButton n8 = new JButton("9");
        n8.setBounds(x, y, 50, 50);
        add(n8);
        n8.addActionListener(this);
        x+=60;
        JButton n11 = new JButton("-");
        n11.setBounds(x, y, 50, 50);
        n11.addActionListener(this);
        add(n11);

        x=10;
        y+=60;
        JButton n12 = new JButton("0");
        n12.setBounds(x, y, 50, 50);
        n12.addActionListener(this);
        add(n12);
        x+=60;
        JButton n13 = new JButton("=");
        n13.setBounds(x, y, 110, 50);
        n13.addActionListener(this);
        add(n13);
        x+=120;
        JButton n14 = new JButton("+");
        n14.setBounds(x, y, 50, 50);
        n14.addActionListener(this);
        add(n14);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                isNumber = true;
                textArea.setText(textArea.getText() + "1");
                System.out.println("Нажата кнопка 1");
                break;
            case "2":
                isNumber = true;
                textArea.setText(textArea.getText() + "2");
                System.out.println("Нажата кнопка 2");
                break;
            case "3":
                isNumber = true;
                textArea.setText(textArea.getText() + "3");
                System.out.println("Нажата кнопка 3");
                break;
            case "4":
                isNumber = true;
                textArea.setText(textArea.getText() + "4");
                System.out.println("Нажата кнопка 4");
                break;
            case "5":
                isNumber = true;
                textArea.setText(textArea.getText() + "5");
                System.out.println("Нажата кнопка 5");
                break;
            case "6":
                isNumber = true;
                textArea.setText(textArea.getText() + "6");
                System.out.println("Нажата кнопка 6");
                break;
            case "7":
                isNumber = true;
                textArea.setText(textArea.getText() + "7");
                System.out.println("Нажата кнопка 7");
                break;
            case "8":
                isNumber = true;
                textArea.setText(textArea.getText() + "8");
                System.out.println("Нажата кнопка 8");
                break;
            case "9":
                isNumber = true;
                textArea.setText(textArea.getText() + "9");
                System.out.println("Нажата кнопка 9");
                break;
                case "0":
                    isNumber = true;
                textArea.setText(textArea.getText() + "0");
                System.out.println("Нажата кнопка 0");
                break;
            case "/":
                if(isNumber) {
                    textArea.setText(textArea.getText() + " / ");
                    isNumber = false;
                }
                break;
            case "*":
                if(isNumber) {
                    textArea.setText(textArea.getText() + " * ");
                    isNumber = false;
                }
                break;
            case "-":
                if(isNumber) {
                    textArea.setText(textArea.getText() + " - ");
                    isNumber = false;
                }
                break;
            case "+":
                if(isNumber) {
                    textArea.setText(textArea.getText() + " + ");
                    isNumber = false;
                }
                break;
            case "CE":
                textArea.setText("");
                break;
            case "=":
                System.out.println("Calculate");
                textArea.setText(String.valueOf(Calculator.calculate(textArea.getText())));
                break;
        }
    }
}
