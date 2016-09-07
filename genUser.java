package oospproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Devang Pandey 007
 */

public class genUser extends java.awt.Frame 
{
    Connection conn=null;
    Statement stmt=null;
    
    public genUser() 
    {
        initComponents();
        setVisible(true);
        setTitle("Guest User");
    }
    
    private void initComponents() 
    {
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button5 = new java.awt.Button();
        textArea1 = new java.awt.TextArea();

        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Snap ITC", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 255, 255));
        label1.setText("Guest User");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 370, 70));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(204, 204, 204));
        label2.setText("Input Parameter");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 230, 40));

        textField1.setBackground(new java.awt.Color(204, 204, 204));
        textField1.setColumns(20);
        textField1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 230, 30));

        button1.setBackground(new java.awt.Color(255, 153, 153));
        button1.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        button1.setLabel("Search by Cutoff");
        button1.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 30));

        button2.setBackground(new java.awt.Color(255, 153, 153));
        button2.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        button2.setLabel("Search by Region");
        button2.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                button2MouseExited(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 30));
        
        button3.setBackground(new java.awt.Color(204, 255, 204));
        button3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button3.setLabel("Back");
        button3.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button3ActionPerformed(evt);
            }
        });
        add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 440, 150, -1));
        
        button5.setBackground(new java.awt.Color(255, 153, 153));
        button5.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        button5.setLabel("Search by Branch");
        button5.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseEntered(java.awt.event.MouseEvent evt) 
            {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) 
            {
                button5MouseExited(evt);
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button5ActionPerformed(evt);
            }
        });
        add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 170, 30));
        button5.getAccessibleContext().setAccessibleName("Search by Branch");

        textArea1.setBackground(new java.awt.Color(102, 102, 102));
        textArea1.setColumns(200);
        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textArea1.setForeground(new java.awt.Color(255, 204, 51));
        textArea1.setName(""); // NOI18N
        textArea1.setRows(20);
        add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 660, 160));

        pack();
    }                     

    private void exitForm(java.awt.event.WindowEvent evt) 
    {                          
        System.exit(0);
    }                         

    private void button1MouseEntered(java.awt.event.MouseEvent evt)
    {                                     

        button1.setBackground(new java.awt.Color(95, 97, 219));
    }                                    

    private void button1MouseExited(java.awt.event.MouseEvent evt) 
    {                                    
       
        button1.setBackground(new java.awt.Color(255, 153, 153));
    }                                   

    private void button1ActionPerformed(java.awt.event.ActionEvent evt)
    {                                        
        String str1 = textField1.getText();
        String url = "jdbc:mysql://localhost:3306/project";
        String uname="root";
        String pass="jaigurudev@123";
        textArea1.append("");
        textArea1.append("College ID \t Name \t\t Region \t\t Placement Rating \t\t Faculty Rating \t Cutoff\n\n");
        try
        {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url,uname,pass);
                System.out.println("Creating statement");
                stmt = conn.createStatement();
                String q = "Select * from college where cutoff < " + str1 + " ;";
                ResultSet rs = stmt.executeQuery(q);
                while(rs.next())
                {
                    int id = rs.getInt("college_id");
                    String sr1 = Integer.toString(id);
                    String sr2 = rs.getString("name");
                    String sr3 = rs.getString("State");
                    int place = rs.getInt("placement");
                    String sr4 = Integer.toString(place);
                    int faculty = rs.getInt("faculty");
                    String sr5 = Integer.toString(faculty);
                    int cutoff = rs.getInt("cutoff");
                    String sr6 = Integer.toString(cutoff);
                   // String final = sr1 + " " + sr2 + " " + sr3 + " " + sr4 + " " + sr5 + " " + sr6;
                    textArea1.append(sr1 + "\t " + sr2 + "\t " + sr3 + "\t " + sr4 + "\t " + sr5 + "\t " + sr6);
                    textArea1.append("\n");
                }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }                                       

    private void button2MouseEntered(java.awt.event.MouseEvent evt) 
    {                                     

        button2.setBackground(new java.awt.Color(95, 97, 219));
    }                                    

    private void button2MouseExited(java.awt.event.MouseEvent evt) 
    {                                    
        
        button2.setBackground(new java.awt.Color(255, 153, 153));
    }                                   
                                     

    private void button2ActionPerformed(java.awt.event.ActionEvent evt)
    {                                        
        String str1 = textField1.getText();
        String url = "jdbc:mysql://localhost:3306/project";
        String uname="root";
        String pass="jaigurudev@123";
        try
        {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url,uname,pass);
                System.out.println("Creating statement");
                stmt = conn.createStatement();
                String q = "Select * from college where State = '" + str1 + "' ;";
                ResultSet rs = stmt.executeQuery(q);
                textArea1.append("");
                textArea1.append("College ID \t Name \t\t Region \t\t Placement Rating \t\t Faculty Rating \t Cutoff\n\n");
                while(rs.next())
                {
                    int id = rs.getInt("college_id");
                    String sr1 = Integer.toString(id);
                    String sr2 = rs.getString("name");
                    String sr3 = rs.getString("State");
                    int place = rs.getInt("placement");
                    String sr4 = Integer.toString(place);
                    int faculty = rs.getInt("faculty");
                    String sr5 = Integer.toString(faculty);
                    int cutoff = rs.getInt("cutoff");
                    String sr6 = Integer.toString(cutoff);
                   // String final = sr1 + " " + sr2 + " " + sr3 + " " + sr4 + " " + sr5 + " " + sr6;
                    textArea1.append(sr1 + "\t " + sr2 + "\t " + sr3 + "\t " + sr4 + "\t " + sr5 + "\t " + sr6);
                    textArea1.append("\n\n");
                }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }                                       

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {                                        

        mainFrame obj = new mainFrame();
        dispose();
    }
    
    private void button5MouseEntered(java.awt.event.MouseEvent evt) {                                     
       
        button5.setBackground(new java.awt.Color(95, 97, 219));
    }                                    

    private void button5MouseExited(java.awt.event.MouseEvent evt) {                                    
       
        button5.setBackground(new java.awt.Color(255, 153, 153));
    }                                   

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {                                        

        String str1 = textField1.getText();
        String url = "jdbc:mysql://localhost:3306/project";
        String uname="root";
        String pass="jaigurudev@123";
        try
        {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url,uname,pass);
                System.out.println("Creating statement");
                stmt = conn.createStatement();
                String q = "Select * from college, branch where college.college_id = branch.college_id AND branch.branch = '" + str1 + "' ;";
                ResultSet rs = stmt.executeQuery(q);
                textArea1.append("");
                textArea1.append("College ID \t Name \t\t Region \t\t Placement Rating \t\t Faculty Rating \t Cutoff\n\n");
                while(rs.next())
                {
                    int id = rs.getInt("college_id");
                    String sr1 = Integer.toString(id);
                    String sr2 = rs.getString("name");
                    String sr3 = rs.getString("State");
                    int place = rs.getInt("placement");
                    String sr4 = Integer.toString(place);
                    int faculty = rs.getInt("faculty");
                    String sr5 = Integer.toString(faculty);
                    int cutoff = rs.getInt("cutoff");
                    String sr6 = Integer.toString(cutoff);
                    textArea1.append(sr1 + "\t " + sr2 + "\t " + sr3 + "\t " + sr4 + "\t " + sr5 + "\t " + sr6);
                    textArea1.append("\n\n");
                }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }                                       
    
    public static void main(String args[]) 
    {
        genUser obj = new genUser();
    }
                    
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;                
}