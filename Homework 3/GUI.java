import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOGame extends JFrame implements ActionListener{

    public static void main(String[] args) {

        new XOGame();

    }

    public XOGame(){
        super("XOGame");
        showButtons();
        setLayout(null);
        setSize(330, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void showButtons(){
    int x = 10, y = 10;

    JButton n = new JButton("1");
    n.setBounds(x, y, 100, 100);
    add(n);
    n.addActionListener(this);
    x+=110;
    JButton n1 = new JButton("2");
    n1.setBounds(x, y, 100, 100);
    add(n1);
    n1.addActionListener(this);
    x+=110;
    JButton n2 = new JButton("3");
    n2.setBounds(x, y, 100, 100);
    add(n2);
    n2.addActionListener(this);


    x=10;
    y+=110;
    JButton n3 = new JButton("4");
    n3.setBounds(x, y, 100, 100);
    add(n3);
    n3.addActionListener(this);
    x+=110;
    JButton n4 = new JButton("5");
    n4.setBounds(x, y, 100, 100);
    add(n4);
    n4.addActionListener(this);
    x+=110;
    JButton n5 = new JButton("6");
    n5.setBounds(x, y, 100, 100);
    add(n5);
    n5.addActionListener(this);


    x=10;
    y+=110;
    JButton n6 = new JButton("7");
    n6.setBounds(x, y, 100, 100);
    add(n6);
    n6.addActionListener(this);
    x+=110;
    JButton n7 = new JButton("8");
    n7.setBounds(x, y, 100, 100);
    add(n7);
    n7.addActionListener(this);
    x+=110;
    JButton n8 = new JButton("9");
    n8.setBounds(x, y, 100, 100);
    add(n8);
    n8.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "1":
                System.out.println("Нажата кнопка 1");
                break;
            case "2":
                System.out.println("Нажата кнопка 2");
                break;
                case "3":
                    System.out.println("Нажата кнопка 3");
                break;
                case "4":
                    System.out.println("Нажата кнопка 4");
                break;
                case "5":
                    System.out.println("Нажата кнопка 5");
                break;
                case "6":
                    System.out.println("Нажата кнопка 6");
                break;
                case "7":
                    System.out.println("Нажата кнопка 7");
                break;
                case "8":
                    System.out.println("Нажата кнопка 8");
                break;
                case "9":
                    System.out.println("Нажата кнопка 9");
                break;

        }
    }
}
