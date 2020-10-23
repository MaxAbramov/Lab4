package GUI;

import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame
{
    JTextArea textArea = new JTextArea(20,20);
    JScrollPane Scroll = new JScrollPane(textArea);
    JButton button = new JButton("Add some Text");
    public GUI()
    { super("Example");
        setSize(310,310);
        setLayout(new FlowLayout());
        add(textArea);
        add(Scroll);
        setVisible(true);
        add(button);
        Scroll.setViewportView(textArea);
        button.addActionListener (ae -> {

            String txt = JOptionPane.showInputDialog(null,"Insert some text");
            textArea.append(txt);
        });
    }

    public static void main(String[]args)
    {
        new GUI().setVisible(true);

    }
}