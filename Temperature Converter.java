
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


/**
 *
 * @author MicroBrains
 */
class Converter extends JPanel implements ActionListener{
    
    JLabel l1;
    JTextField t1;
    JTextField t2;
    JButton b1;

    JLabel Output;

    JComboBox c;

    Converter()
    {
 
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        l1=new JLabel("Enter Temperature");
        l1.setBounds(30, 30, 150, 50);
        

        t1=new JTextField();
        t1.setBounds(30, 80, 150, 30);
        t1.setBackground(Color.CYAN);

        c=new JComboBox();
        c.setBounds(30, 120, 150, 40);
        c.setBackground(Color.yellow);

        c.addItem("Celsius To Fahrenheit");
        c.addItem("Fahrenheit To Celsius");

        b1=new JButton("Calculate");
        b1.setBounds(30, 180, 150, 50);
        b1.setBackground(Color.green);
        
         Output=new JLabel("Output");
         Output.setBounds(30, 235, 150, 50);
        
        t2 = new JTextField();
        t2.setBounds(30,280,150,30);
         
       
        
        add(l1);
        add(t1);
        add(c);
        add(b1);
        add(Output);
        add(t2);
        b1.addActionListener(this);
    }

     public void actionPerformed(ActionEvent ae)  
    {
         String comboval=(String)c.getSelectedItem();  
        if (ae.getSource()==b1) 
        {
            if(comboval.equalsIgnoreCase("Celsius To Fahrenheit")){

                 
                int t1Val=Integer.parseInt(t1.getText());
                float fer=((t1Val*9)/5)+32;  
                t2.setText(String.valueOf(fer));
            }
            else
            {
                int t1Val=Integer.parseInt(t1.getText());
                float cel=((t1Val - 32)*5)/9;
                t2.setText(String.valueOf(cel));
            }

        }
     }
}


class frame extends JFrame
{
    ImageIcon ic;
    frame()
    {
        ic = new ImageIcon(getClass().getResource("gg.jpg"));
        setIconImage(ic.getImage());
        Converter i = new Converter();
        setContentPane(i);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,550);
        setVisible(true);
    }
}
class TempConverter
{
    public static void main(String args[])
    {
        frame m = new frame();
    }
}
