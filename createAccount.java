package oospproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

/**
 *
 * @author Devang Pandey 007
 */

public class createAccount extends java.awt.Frame 
{

    public createAccount() 
    {
        setTitle("Create Account");
        setVisible(true);
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new java.awt.Label();
        l2 = new java.awt.Label();
        tf1 = new java.awt.TextField();
        l3 = new java.awt.Label();
        tf2 = new java.awt.TextField();
        l4 = new java.awt.Label();
        tf3 = new java.awt.TextField();
        b = new java.awt.Button();
        button2 = new java.awt.Button();

        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(630, 438));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setAlignment(java.awt.Label.CENTER);
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        l1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 204, 204));
        l1.setText("CREATE NEW  ACCOUNT");
        add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 520, 60));

        l2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 204, 255));
        l2.setText("Name");
        add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 80, 30));

        tf1.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, 30));

        l3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(204, 204, 255));
        l3.setText("Username");
        add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 80, 30));

        tf2.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 140, 30));

        l4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(204, 204, 204));
        l4.setText("PASSWORD");
        add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        tf3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf3.setEchoChar('*');
        tf3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 140, 30));

        b.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(51, 51, 51));
        b.setLabel("Create Account");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 230, -1));

        button2.setBackground(new java.awt.Color(204, 255, 255));
        button2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button2.setLabel("Back");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
            
        String q="insert into login values('"+tf1.getText()+"','"+tf3.getText()+"','"+tf2.getText()+"')";
        try
        {
                connect c = new connect();
                c.update(q);
                java.awt.Dialog obj = new java.awt.Dialog(this,"Account Created");
                java.awt.Label lab1 = new java.awt.Label("Account Created. Please proceed for Sign in", Label.CENTER);
                lab1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                lab1.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
                lab1.setForeground(new java.awt.Color(104, 104, 204));
                
                java.awt.Button btn1 = new java.awt.Button("OK");
                btn1.setBackground(Color.LIGHT_GRAY);
                btn1.addActionListener(new java.awt.event.ActionListener() 
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt) 
                    {
                        signIn obj = new signIn();
                        dispose();
                    }
                });
                obj.add(lab1);
                obj.add(btn1);
                obj.setSize(355, 155);
                obj.setLayout(new GridLayout(3, 1));
                obj.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_bActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        mainFrame obj = new mainFrame();
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    public static void main(String args[])
    {
        createAccount obj2 = new createAccount();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button b;
    private java.awt.Button button2;
    private java.awt.Label l1;
    private java.awt.Label l2;
    private java.awt.Label l3;
    private java.awt.Label l4;
    private java.awt.TextField tf1;
    private java.awt.TextField tf2;
    private java.awt.TextField tf3;
    // End of variables declaration//GEN-END:variables
}