package oospproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

/**
 *
 * @author priyanka
 */

public class adminPanel extends java.awt.Frame 
{
    public adminPanel() 
    {
        initComponents();
        setVisible(true);
        setTitle("Admin Panel");
    }

    private void initComponents() 
    {

        b3 = new java.awt.Button();
        b1 = new java.awt.Button();
        b2 = new java.awt.Button();
        b4= new java.awt.Button();
        l1 = new java.awt.Label();
        b5 = new java.awt.Button();

        setMaximumSize(new java.awt.Dimension(480, 360));
        setMinimumSize(new java.awt.Dimension(480, 360));
        setPreferredSize(new java.awt.Dimension(480, 360));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBackground(new java.awt.Color(204, 255, 204));
        b1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        b1.setLabel("ADD A COLLEGE");
        b1.setMaximumSize(new java.awt.Dimension(30, 30));
        b1.setMinimumSize(new java.awt.Dimension(30, 30));
        b1.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                b1ActionPerformed(evt);
            }
        });
        add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 180, 30));

        b2.setBackground(new java.awt.Color(204, 255, 204));
        b2.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        b2.setLabel("MODIFY RECORDS");
        b2.setMaximumSize(new java.awt.Dimension(30, 30));
        b2.setMinimumSize(new java.awt.Dimension(30, 30));
        b2.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                b2ActionPerformed(evt);
            }
        });
        add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, 30));
        
        b3.setBackground(new java.awt.Color(204, 255, 204));
        b3.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        b3.setLabel("DELETE RECORDS");
        b3.setMaximumSize(new java.awt.Dimension(30, 30));
        b3.setMinimumSize(new java.awt.Dimension(30, 30));
        b3.setName(""); // NOI18N
        b3.setPreferredSize(new java.awt.Dimension(30, 30));
        b3.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                b3ActionPerformed(evt);
            }
        });
        add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, 30));

        l1.setAlignment(java.awt.Label.CENTER);
        l1.setFont(new java.awt.Font("Impact", 1, 30)); // NOI18N
        l1.setPreferredSize(new java.awt.Dimension(83, 83));
        l1.setText("ADMIN PANEL");
        add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 280, 60));

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setFont(new java.awt.Font("Myanmar Text", 2, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setLabel("Logout");
        b4.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                b4ActionPerformed(evt);
            }
        });
        add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, 30));

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setFont(new java.awt.Font("Myanmar Text", 2, 12)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setLabel("Change Password");
        b5.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                b5ActionPerformed(evt);
            }
        });
        add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 160, 30));

        pack();
    }
    
    private void exitForm(java.awt.event.WindowEvent evt) 
    {
        System.exit(0);
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        addRecord obj= new addRecord();
        obj.setVisible(true);
    }
    
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        modifyRecord obj= new modifyRecord();
        obj.setVisible(true);
    }
    
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        deleteRecord obj= new deleteRecord();
        obj.setVisible(true);
    }
    
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        java.awt.Dialog obj = new java.awt.Dialog(this,"Logout");
                java.awt.Label lab1 = new java.awt.Label("You have successfully logged off from the admin panel.", Label.CENTER);
                lab1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                lab1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
                lab1.setForeground(new java.awt.Color(104, 104, 204));
                
                java.awt.Button btn1 = new java.awt.Button("OK");
                btn1.setBackground(Color.LIGHT_GRAY);
                btn1.addActionListener(new java.awt.event.ActionListener() 
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt) 
                    {
                        mainFrame obj = new mainFrame();
                        obj.setVisible(true);
                        dispose();
                    }
                });
                obj.add(lab1);
                obj.add(btn1);
                obj.setSize(455, 155);
                obj.setLayout(new GridLayout(3, 1));
                obj.setVisible(true);
    }
    
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        changePass ob= new changePass();
        ob.setVisible(true);
        setVisible(false);
    }

    public static void main(String args[]) 
    {
        adminPanel obj = new adminPanel();
    }

    private java.awt.Button b2;
    private java.awt.Button b1;
    private java.awt.Button b3;
    private java.awt.Button b5;
    private java.awt.Button b4;
    private java.awt.Label l1;
}