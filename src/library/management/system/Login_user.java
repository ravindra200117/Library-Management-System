
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener
{
    private JPanel panel;
    private JTextField textfield;
    private JPasswordField passwordfield;
    private JButton b1,b2,b3;
    JLabel l1,l2,l3,l4,l5;
    public Login_user()
    {
       setBackground(new Color(169,169,169));
       setBounds(600,300,600,400);
       
       panel = new JPanel();
       panel.setBackground(new Color(176,224,230));
       setContentPane(panel);
       panel.setLayout(null);
       
       l1 = new JLabel("USERNAME :");
       l1.setBounds(124,89,95,24);
       panel.add(l1);
       
       l2 = new JLabel("PASSWORD :");
       l2.setBounds(124,124,95,24);
       panel.add(l2);
       
       textfield = new JTextField();
       textfield.setBounds(210,93,157,20);
       panel.add(textfield);
       
       passwordfield = new JPasswordField();
       passwordfield.setBounds(210,128,157,20);
       panel.add(passwordfield);
       
       l3 = new JLabel("");
       l3.setBounds(377,79,46,34);
       panel.add(l3);
       
       l4 = new JLabel("");
       l4.setBounds(377,124,46,34);
       panel.add(l4);
       
       b1 = new JButton("Login");
       b1.addActionListener(this);
       
       b1.setBackground(new Color(250,250,210));
       b1.setForeground(new Color(46,139,87));
       b1.setBounds(149,181,113,39);
       panel.add(b1);
       
       b2 = new JButton("SignUp");
       b2.addActionListener(this);
       
       b2.setBackground(new Color(225,235,205));
       b2.setForeground(new Color(139,69,19));
       b2.setBounds(289,181,113,39);
       panel.add(b2);
       
       b3 = new JButton("Forgot Password");
       b3.addActionListener(this);
       
       b3.setBackground(new Color(253,245,230));
       b3.setForeground(new Color(205,92,92));
       b3.setBounds(200,231,140,39);
       panel.add(b3);
       
       l5 = new JLabel("Trouble in Login?");
       l5.setFont(new Font("Tahoma",Font.PLAIN,15));
       l5.setForeground(new Color(255,0,0));
       l5.setBounds(70,240,130,20);
       panel.add(l5);
       
       
       
       
       
       JPanel panel2 = new JPanel();
       panel2.setBackground(new Color(176,224,230));
       panel2.setBounds(24,40,434,263);
       panel.add(panel2);
       
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            Boolean status = false;
            
            try
            {
              Conn con = new Conn();
              String sq1 = "select * from account where username=? and password=?";
              PreparedStatement st = con.c.prepareStatement(sq1);
              
              st.setString(1, textfield.getText());
              st.setString(2,passwordfield.getText());
              
              ResultSet rs = st.executeQuery();
              if(rs.next())
              {
                  this.setVisible(false);
                  new Loading().setVisible(true);
              }
              else
              {
                  JOptionPane.showMessageDialog(null,"Invalid Login....!");
              }
              
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
              
        }
        if(ae.getSource()==b2)
        {
            setVisible(false);
            Signup su =new Signup();
           su.setVisible(true);
        }
        if(ae.getSource()==b3)
        {
            setVisible(false);
           Forgot forgot = new Forgot();
            forgot.setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new Login_user().setVisible(true);
    }
}
