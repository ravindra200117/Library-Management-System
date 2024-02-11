
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class BookDetails extends JFrame implements ActionListener
{
    JPanel contentPane,panel;
    JTable table;
    JTextField search;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    
    public void Book()
    {
        try
        {
            Conn con = new Conn();
            String sql = "select*from book";
            PreparedStatement st =con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        }
        catch(Exception e)
        {
            
        }
    }
    
    BookDetails()
    {
        setBounds(350,200,890,475);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(220,220,220));
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79,133,771,288);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent arg0)
            {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row,1).toString());
                
            }
            
        });
        
        table.setBackground(new Color(240,248,255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS",Font.BOLD,16));
        scrollPane.setViewportView(table);
        
        b1 = new JButton("Search");
        b1.addActionListener(this);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/eight.png"));
        Image i2 = i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        b1.setIcon(i3);
        b1.setForeground(new Color(199,21,133));
        b1.setFont(new Font("Trebuchet MS",Font.BOLD,18));
        b1.setBounds(564,89,138,33);
        contentPane.add(b1);
        
        b2 = new JButton("Delete");
        b2.addActionListener(this);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/nineth.png"));
        Image i5 = i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        b2.setIcon(i6);
        b2.setForeground(new Color(199,21,133));
        b2.setFont(new Font("Trebuchet MS",Font.BOLD,18));
        b2.setBounds(712,89,138,33);
        contentPane.add(b2);
        
        l1 = new JLabel("Book Details");
        l1.setForeground(new Color(102,205,170));
        l1.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,26));
        l1.setBounds(250,20,400,47);
        contentPane.add(l1);
        
        search = new JTextField();
        search.setBackground(new Color(255,240,245));
        search.setForeground(new Color(47,79,79));
        search.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,17));
        search.setBounds(189,89,357,33);
        contentPane.add(search);
        search.setColumns(10);
        
        l2 = new JLabel("Back");
        l2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e)
            {
                setVisible(false);
                Home home = new Home();
                home.setVisible(true);
            }
            
        });
        
        l2.setForeground(Color.GRAY);
        l2.setFont(new Font("Trebuchet MS",Font.BOLD,18));
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/tenth.png"));
        Image i8 = i7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l2.setIcon(i9);
        l2.setBounds(97,89,72,33);
        contentPane.add(l2);
        
        panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(95,158,160),3,true),"Student-Details",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(72,209,204)));
        panel.setBounds(68,59,790,370);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            Conn con = new Conn();
            if(ae.getSource()== b1)
            {
                String sql = "select*from book where concat(name,book_id)like ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1,"%"+search.getText()+"%");
                ResultSet rs = st.executeQuery();
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                st.close();
            }
            
            if(ae.getSource()== b2)
            {
                String sql = "delete * from book where name = '"+search.getText()+"'";    
                PreparedStatement st = con.c.prepareStatement(sql);
                
                JDialog.setDefaultLookAndFeelDecorated(true);
                int response = JOptionPane.showConfirmDialog(null,"Do you want to continue?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                
                if(response == JOptionPane.NO_OPTION)
                {
                    
                }
                else if(response== JOptionPane.YES_OPTION)
                {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
                    
                }
                else if(response == JOptionPane.CLOSED_OPTION)
                {
                    
                }
                st.close();
            }
            con.c.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public static void main(String args[])
    {
        new BookDetails().setVisible(true);
    }
}