
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LibraryManagementSystem extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1;
    
    public LibraryManagementSystem()
    {
        setSize(1366,390);
        setLayout(null);
        setLocation(300,300);
         
        l1 = new JLabel("");
        b1 =new JButton("Next");
        
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366,390, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        
        b1.setBounds(1050,250,200,60);
        l1.setBounds(0,0,1366,390);
        
        l1.add(b1);
        add(l1);
        
        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        new Login_user().setVisible(true);
        setVisible(false);
    }
    
    public static void main(String[] args) 
    {
       new LibraryManagementSystem().setVisible(true);
    }
    
}
