
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class aboutUs extends JFrame
{
    JPanel contentPane;
    JLabel l1,l2,l3,l4,l5,l6;
    
    public aboutUs()
    {
        super("About US");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Desktop\\java2\\Raviraj.jpeg"));
        setBackground(new Color(173,216,230));
        setBounds(500,250,700,500);
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        l1 = new JLabel("New label");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(500,40,100,100);
        contentPane.add(l1);
        
        l3 = new JLabel("Library");
        l3.setForeground(new Color(0,250,154));
        l3.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,34));
        l3.setBounds(160,40,150,55);
        contentPane.add(l3);
        
        l4 = new JLabel("Management System");
        l4.setForeground(new Color(0,250,154));
        l4.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,34));
        l4.setBounds(70,90,405,40);
        contentPane.add(l4);
        
        contentPane.setBackground(Color.WHITE);
    }
    public static void main(String args[])
    {
        new aboutUs().setVisible(true);
        
    }
    
}
