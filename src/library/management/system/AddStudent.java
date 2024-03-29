
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.util.*;


public class AddStudent extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5;
    JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3;
    JButton b1,b2;
    JPanel contentPane;
    
    
    public void random()
    {
        Random ran = new Random();
        t1.setText(""+ran.nextInt(1000+1));
    }
    
   AddStudent()
   {
       super("AddStudent");
       setBounds(700,200,550,450);
       contentPane = new JPanel();
       contentPane.setLayout(null);
       setContentPane(contentPane);
       
       l1 = new JLabel("Student_id");
       l1.setForeground(new Color(25,25,112));
       l1.setFont(new Font("Tahoma",Font.BOLD,14));
       l1.setBounds(63,63,102,22);
       contentPane.add(l1);
       
       l2 = new JLabel("Name");
       l2.setForeground(new Color(25,25,112));
       l2.setFont(new Font("Tahoma",Font.BOLD,14));
       l2.setBounds(63,97,102,22);
       contentPane.add(l2);
       
       l3 = new JLabel("Father's Name");
       l3.setForeground(new Color(25,25,112));
       l3.setFont(new Font("Tahoma",Font.BOLD,14));
       l3.setBounds(63,130,102,22);
       contentPane.add(l3);
       
       l4 = new JLabel("Branch");
       l4.setForeground(new Color(25,25,112));
       l4.setFont(new Font("Tahoma",Font.BOLD,14));
       l4.setBounds(63,209,102,22);
       contentPane.add(l4);
       
       l5 = new JLabel("Year");
       l5.setForeground(new Color(25,25,112));
       l5.setFont(new Font("Tahoma",Font.BOLD,14));
       l5.setBounds(63,242,102,22);
       contentPane.add(l5);
       
       l6 = new JLabel("Semester");
       l6.setForeground(new Color(25,25,112));
       l6.setFont(new Font("Tahoma",Font.BOLD,14));
       l6.setBounds(63,275,102,22);
       contentPane.add(l6);
       
       l7 = new JLabel("Course");
       l7.setForeground(new Color(25,25,112));
       l7.setFont(new Font("Tahoma",Font.BOLD,14));
       l7.setBounds(63,173,102,22);
       contentPane.add(l7);
       
       t1 = new JTextField();
       t1.setEditable(false);
       t1.setForeground(new Color(47,79,79));
       t1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       t1.setColumns(10);
       t1.setBounds(174,66,156,20);
       contentPane.add(t1);
       
       t2 = new JTextField();
       //t2.setEditable(false);
       t2.setForeground(new Color(47,79,79));
       t2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       t2.setColumns(10);
       t2.setBounds(174,100,156,20);
       contentPane.add(t2);
       
       t3 = new JTextField();
       //t3.setEditable(false);
       t3.setForeground(new Color(47,79,79));
       t3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       t3.setColumns(10);
       t3.setBounds(174,133,156,20);
       contentPane.add(t3);
       
       comboBox = new JComboBox();
       comboBox.setModel(new DefaultComboBoxModel(new String[]{"Mechanical","CSE","IT","Civil","Automobile","EEE","Other"}));
       comboBox.setForeground(new Color(47,79,79));
       comboBox.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       comboBox.setBounds(176,211,154,20);
       contentPane.add(comboBox);
       
       comboBox_1 = new JComboBox();
       comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"First","Second","Third","Four"}));
       comboBox_1.setForeground(new Color(47,79,79));
       comboBox_1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       comboBox_1.setBounds(176,244,154,20);
       contentPane.add(comboBox_1);
       
       comboBox_2 = new JComboBox();
       comboBox_2.setModel(new DefaultComboBoxModel(new String[]{"1st","2nd","3rd","4th","5th","6th","7th","8th"}));
       comboBox_2.setForeground(new Color(47,79,79));
       comboBox_2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       comboBox_2.setBounds(176,277,154,20);
       contentPane.add(comboBox_2);
       
       comboBox_3 = new JComboBox();
       comboBox_3.setModel(new DefaultComboBoxModel(new String[]{"B.E","B.Tech","M.Tech","MBA","BBA","BCA","B.Sc","B.Com","M.Com"}));
       comboBox_3.setForeground(new Color(47,79,79));
       comboBox_3.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       comboBox_3.setBounds(176,176,154,20);
       contentPane.add(comboBox_3);
       
       b1 = new JButton("ADD");
       b1.addActionListener(this);
       b1.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.setBounds(64,321,111,33);
       contentPane.add(b1);
       
       b2 = new JButton("Back");
       b2.addActionListener(this);
       b2.setFont(new Font("Trebuchet MS",Font.BOLD,14));
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       b2.setBounds(198,321,111,33);
       contentPane.add(b2);
       
       
       JPanel panel = new JPanel();
       panel.setBorder(new TitledBorder(new LineBorder(new Color(102,205,170),2,true),"Add-Student",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(30,144,255)));
       panel.setBackground(new Color(211,211,211));
       panel.setBounds(10,38,358,348);
       contentPane.setBackground(Color.WHITE);
       panel.setBackground(Color.WHITE);
       
       contentPane.add(panel);
       random();
   }
   public void actionPerformed(ActionEvent ae)
   {
       Conn con = new Conn();
       try
       {
          if(ae.getSource()== b1)
          {
              try
              {
                  String sql = "insert into student(student_id,name,father,course,branch,year,semester)values(?,?,?,?,?,?,?)";
                  PreparedStatement st = con.c.prepareStatement(sql);
                  st.setString(1,t1.getText());
                  st.setString(2,t2.getText());
                  st.setString(3,t3.getText());
                  st.setString(4,(String) comboBox_3.getSelectedItem());
                  st.setString(5,(String) comboBox.getSelectedItem());
                  st.setString(6,(String) comboBox_1.getSelectedItem());
                  st.setString(7,(String) comboBox_2.getSelectedItem());
                  
                  
                 int i = st.executeUpdate();
                 if(i>0)
                 {
                     JOptionPane.showMessageDialog(null,"Successfully Added");
                     setVisible(false);
                     new Home().setVisible(true);
                 }
                 else 
                 {
                     JOptionPane.showMessageDialog(null,"Error");
                 }
                  
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
          }
          if(ae.getSource()== b2)
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
       new AddStudent().setVisible(true);
   }
}
