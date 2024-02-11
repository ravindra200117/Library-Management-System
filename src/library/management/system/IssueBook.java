
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;

public class IssueBook extends JFrame implements ActionListener
{
    JPanel contentPane,panel,panel_1;
    JDateChooser dateChooser;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    
    public IssueBook()
    {
        setBounds(300,200,900,500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);  
        
      l1 = new JLabel("Book_id");
      l1.setFont(new Font("Tahoma",Font.BOLD,14));
      l1.setForeground(new Color(47,79,79));
      l1.setBounds(47,63,100,23);
      contentPane.add(l1);
      
      l2 = new JLabel("Name");
      l2.setFont(new Font("Tahoma",Font.BOLD,14));
      l2.setForeground(new Color(47,79,79));
      l2.setBounds(47,97,100,23);
      contentPane.add(l2);
      
      l3 = new JLabel("ISBN");
      l3.setFont(new Font("Tahoma",Font.BOLD,14));
      l3.setForeground(new Color(47,79,79));
      l3.setBounds(47,131,100,23);
      contentPane.add(l3);
      
      l4 = new JLabel("Publisher");
      l4.setFont(new Font("Tahoma",Font.BOLD,14));
      l4.setForeground(new Color(47,79,79));
      l4.setBounds(47,165,100,23);
      contentPane.add(l4);
      
      l5 = new JLabel("Edition");
      l5.setFont(new Font("Tahoma",Font.BOLD,14));
      l5.setForeground(new Color(47,79,79));
      l5.setBounds(47,199,100,23);
      contentPane.add(l5);
      
      l6 = new JLabel("Price");
      l6.setFont(new Font("Tahoma",Font.BOLD,14));
      l6.setForeground(new Color(47,79,79));
      l6.setBounds(47,233,100,23);
      contentPane.add(l6);
      
      l7 = new JLabel("Pages");
      l7.setFont(new Font("Tahoma",Font.BOLD,14));
      l7.setForeground(new Color(47,79,79));
      l7.setBounds(47,267,100,23);
      contentPane.add(l7);
      
      t1 = new JTextField();
      t1.setForeground(new Color(47,79,79));
      t1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t1.setBounds(126,66,86,20);
      //t1.setColumns(10);
      contentPane.add(t1);
      
      b1 = new JButton("Search");
      b1.addActionListener(this);
      b1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      b1.setForeground(Color.WHITE);
      b1.setBackground(Color.BLACK);
      b1.setBounds(234,59,100,30);
      contentPane.add(b1);
      
      t2 = new JTextField();
      t2.setForeground(new Color(47,79,79));
      t2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t2.setBounds(126,100,208,20);
      t2.setColumns(10);
      t2.setEditable(false);
      contentPane.add(t2);
      
      t3 = new JTextField();
      t3.setForeground(new Color(47,79,79));
      t3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t3.setBounds(126,131,208,20);
      t3.setColumns(10);
      t3.setEditable(false);
      contentPane.add(t3);
      
      t4 = new JTextField();
      t4.setForeground(new Color(47,79,79));
      t4.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t4.setBounds(126,168,208,20);
      t4.setColumns(10);
      t4.setEditable(false);
      contentPane.add(t4);
      
      t5 = new JTextField();
      t5.setForeground(new Color(47,79,79));
      t5.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t5.setBounds(126,202,208,20);
      t5.setColumns(10);
      t5.setEditable(false);
      contentPane.add(t5);
      
      t6 = new JTextField();
      t6.setForeground(new Color(47,79,79));
      t6.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t6.setBounds(126,236,208,20);
      t6.setColumns(10);
      t6.setEditable(false);
      contentPane.add(t6);
      
      t7 = new JTextField();
      t7.setForeground(new Color(47,79,79));
      t7.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t7.setBounds(126,270,208,20);
      t7.setColumns(10);
      t7.setEditable(false);
      contentPane.add(t7);
      
        panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(47,79,79),2,true),"Issue-Book",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(34,139,34)));
        panel.setBounds(10,38,345,288);
        panel.setBackground(Color.WHITE);
        panel.setFont(new Font("Tahoma",Font.BOLD,14));
        contentPane.add(panel);
      
      l8 = new JLabel("Student_id");
      l8.setFont(new Font("Tahoma",Font.BOLD,14));
      l8.setForeground(new Color(47,79,79));
      l8.setBounds(384,63,100,23);
      contentPane.add(l8);
      
      l9 = new JLabel("Name");
      l9.setFont(new Font("Tahoma",Font.BOLD,14));
      l9.setForeground(new Color(47,79,79));
      l9.setBounds(384,103,100,23);
      contentPane.add(l9);
      
      l10 = new JLabel("Father's Name");
      l10.setFont(new Font("Tahoma",Font.BOLD,14));
      l10.setForeground(new Color(47,79,79));
      l10.setBounds(384,147,100,23);
      contentPane.add(l10);
      
      l11 = new JLabel("Course");
      l11.setFont(new Font("Tahoma",Font.BOLD,14));
      l11.setForeground(new Color(47,79,79));
      l11.setBounds(384,187,100,23);
      contentPane.add(l11);
      
      l12 = new JLabel("Branch");
      l12.setFont(new Font("Tahoma",Font.BOLD,14));
      l12.setForeground(new Color(47,79,79));
      l12.setBounds(384,233,100,23);
      contentPane.add(l12);
      
      l13 = new JLabel("Year");
      l13.setFont(new Font("Tahoma",Font.BOLD,14));
      l13.setForeground(new Color(47,79,79));
      l13.setBounds(384,284,100,23);
      contentPane.add(l13);
      
      l14 = new JLabel("Semester");
      l14.setFont(new Font("Tahoma",Font.BOLD,14));
      l14.setForeground(new Color(47,79,79));
      l14.setBounds(384,336,100,23);
      contentPane.add(l14);
      
      t8 = new JTextField();
      t8.setForeground(new Color(47,79,79));
      t8.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t8.setBounds(508,66,86,20);
      t8.setColumns(10);
     // t7.setEditable(false);
      contentPane.add(t8);
      
      b2 = new JButton("Search");
      b2.addActionListener(this);
      b2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      b2.setForeground(Color.WHITE);
      b2.setBackground(Color.BLACK);
      b2.setBounds(604,59,100,30);
      contentPane.add(b2);
      
      t9 = new JTextField();
      t9.setForeground(new Color(47,79,79));
      t9.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t9.setBounds(508,106,208,20);
      t9.setColumns(10);
      t9.setEditable(false);
      contentPane.add(t9);
      
      t10 = new JTextField();
      t10.setForeground(new Color(47,79,79));
      t10.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t10.setBounds(508,150,208,20);
      t10.setColumns(10);
      t10.setEditable(false);
      contentPane.add(t10);
      
      t11 = new JTextField();
      t11.setForeground(new Color(47,79,79));
      t11.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t11.setBounds(508,190,208,20);
      t11.setColumns(10);
      t11.setEditable(false);
      contentPane.add(t11);
      
      t12 = new JTextField();
      t12.setForeground(new Color(47,79,79));
      t12.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t12.setBounds(508,236,208,20);
      t12.setColumns(10);
      t12.setEditable(false);
      contentPane.add(t12);
      
      t13 = new JTextField();
      t13.setForeground(new Color(47,79,79));
      t13.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t13.setBounds(508,286,208,20);
      t13.setColumns(10);
      t13.setEditable(false);
      contentPane.add(t13);
      
      t14 = new JTextField();
      t14.setForeground(new Color(47,79,79));
      t14.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      t14.setBounds(508,338,208,20);
      t14.setColumns(10);
      t14.setEditable(false);
      contentPane.add(t14);
      
       panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70,130,180),2,true),"Student - Details",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(100,149,237)));
        panel_1.setBounds(360,38,378,372);
        panel_1.setBackground(Color.WHITE);
        panel_1.setFont(new Font("Tahoma",Font.BOLD,14));
        contentPane.add(panel_1);
        
        l15 = new JLabel("Date of Issue");
      l15.setFont(new Font("Tahoma",Font.BOLD,14));
      l15.setForeground(new Color(47,79,79));
      l15.setBounds(20,340,118,26);
      contentPane.add(l15);
      
      dateChooser  = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0,0,0),1,true));
        dateChooser.setBounds(137,337,200,29);
        dateChooser.setForeground(new Color(105,105,105));
        contentPane.add(dateChooser);
        
      b3 = new JButton("Issue");
      b3.addActionListener(this);
      b3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      b3.setForeground(Color.WHITE);
      b3.setBackground(Color.BLACK);
      b3.setBounds(47,377,118,33);
      contentPane.add(b3);
      
      b4 = new JButton("Back");
      b4.addActionListener(this);
      b4.setFont(new Font("Trebuchet MS",Font.BOLD,14));
      b4.setForeground(Color.WHITE);
      b4.setBackground(Color.BLACK);
      b4.setBounds(199,377,100,33);
      contentPane.add(b4);
      
      
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
           Conn con = new Conn();
           if(ae.getSource()== b1)
           {
               String sql = "select * from book where book_id = ?";
               PreparedStatement st = con.c.prepareStatement(sql);
               
               st.setString(1,t1.getText());
               ResultSet rs = st.executeQuery();
               
               while(rs.next())
               {
                   t2.setText(rs.getString("name"));
                   t3.setText(rs.getString("isbn"));
                   t4.setText(rs.getString("publisher"));
                   t5.setText(rs.getString("edition")); 
                   t6.setText(rs.getString("price"));              
                   t7.setText(rs.getString("pages"));
                      
                      
                   
               }
               st.close();
               rs.close();
           }
           
           if(ae.getSource()== b2)
           {
               String sql = "select * from student where student_id = ?";
               PreparedStatement st = con.c.prepareStatement(sql);
               
               st.setString(1,t8.getText());
               ResultSet rs = st.executeQuery();
               
               while(rs.next())
               {
                   t9.setText(rs.getString("name"));
                   t10.setText(rs.getString("father"));
                   t11.setText(rs.getString("course"));
                   t12.setText(rs.getString("branch")); 
                   t13.setText(rs.getString("year"));              
                   t14.setText(rs.getString("semester"));
                      
                      
                   
               }
               st.close();
               rs.close();
           }
           
           if(ae.getSource()== b3)
           {
               try
               {
                   String sql = "insert into issueBook(book_id,student_id,bname,sname,course,branch,dateOfIssue)values(?,?,?,?,?,?,?)";
                   PreparedStatement st = con.c.prepareStatement(sql);
                   
                   st.setString(1,t1.getText());
                   st.setString(2,t8.getText());
                   st.setString(3,t2.getText());
                   st.setString(4,t9.getText());
                   st.setString(5,t11.getText());
                   st.setString(6,t12.getText());
                   st.setString(7,((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                   
                   int i = st.executeUpdate();
                   if(i>0)
                   {
                       JOptionPane.showMessageDialog(null,"Successfully Book Issued..!");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"error");
                   }
               }
               catch(Exception e)
               {
                   System.out.println(e);
               }
           }
           if(ae.getSource()== b4)
           {
               setVisible(false);
               new Home().setVisible(true);
           }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new IssueBook().setVisible(true);
    }
}
