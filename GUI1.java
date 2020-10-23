package GUI;

import javax.swing.*;
import java.awt.*;
public class GuI2 extends JFrame
{
    JTextField jta = new JTextField(10);

    Font fnt = new Font("Bahnschrift SemiBold SemiConden",Font.BOLD,20);
    GUI1()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new GUI1();
    }
}