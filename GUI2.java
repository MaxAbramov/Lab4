package GUI;
import javax.swing.*;
import java.awt.*;
public class GUI2 extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton("Add them up");

    GUI2()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);

        button.addActionListener(ae -> {
            try
            {
                double x1 =

                        Double.parseDouble(jta1.getText().trim());

                double x2 =

                        Double.parseDouble(jta2.getText().trim());

                JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);

            }
            catch(Exception e)
            {

                JOptionPane.showMessageDialog(null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);

            }
        });
        //выдает результат в типе данных double (ошибка)
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new GUI2();
    }

}