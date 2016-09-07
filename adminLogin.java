package oospproject;

import java.io.*;
import java.awt.*;
/**
 *
 * @author Devang Pandey 007
 */

public class adminLogin extends java.awt.Frame
{
    public adminLogin() 
    {
        initComponents();
        img = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Devang Pandey 007\\Documents\\NetBeansProjects\\OOSPproject\\src\\oospproject\\background.png");
        setTitle("Admin Login");
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        // Draws the img to the BackgroundPanel.
        g.drawImage(img, 0, 0, null);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new java.awt.Label();
        l2 = new java.awt.Label();
        tf1 = new java.awt.TextField();
        l3 = new java.awt.Label();
        tf2 = new java.awt.TextField();
        b = new java.awt.Button();

        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
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
        l1.setText("WELCOME ADMINISTRATOR");
        add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 500, 60));

        l2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 0, 0));
        l2.setText("LOGIN ID");
        add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 80, 30));

        tf1.setFont(new java.awt.Font("Harrington", 1, 14)); // NOI18N
        add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 110, 30));

        l3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 0, 0));
        l3.setText("PASSWORD");
        add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        tf2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf2.setEchoChar('*');
        tf2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 110, 30));

        b.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(51, 51, 51));
        b.setLabel("LOGIN");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public boolean passCheck(String username, String password) throws IOException
    {
                File f1, f2;
		FileReader fr1 = null;
                FileReader fr2 = null;
                BufferedReader br1, br2;
                boolean lgn = false;
                                
                f1 = new File("C:\\Users\\Devang Pandey 007\\Documents\\NetBeansProjects\\OOSPproject\\src\\oospproject\\loginIDs.txt");
                f2 = new File("C:\\Users\\Devang Pandey 007\\Documents\\NetBeansProjects\\OOSPproject\\src\\oospproject\\passkeys.txt");
                try
                {
                    fr1 = new FileReader(f1);
                    fr2 = new FileReader(f2);
                 
                    br1 = new BufferedReader(fr1);
                    br2 = new BufferedReader(fr2);
                    System.out.println(username);
                    System.out.println(password);
                    String sr1 = null;
                    String sr2 = null;
                    int count = 1, i = 0;
                    while((sr1 = br1.readLine()) != null)
                    {
                        System.out.println(sr1);
                        if(sr1.equals(username))
			break;
				
			else
			count++;
                    }
                    while(i!=count && (sr2 = br2.readLine())!=null)
                    {
			System.out.println(sr2);
                        if(sr2.equals(password))
                        {
                            lgn = true;
                            break;
                        }
                    }
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
           return lgn;
       }
    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
    
        String username = tf1.getText();
        String password = tf2.getText();
        boolean lgn = false;
        try
        {
            lgn = passCheck(username, password);
        }
        
        catch(IOException e)
        {
            e.printStackTrace();
        }
    
            if(lgn) 
            {
                System.out.println("Launch successfull");
                adminPanel obj = new adminPanel();
                obj.setVisible(true);
                dispose();
            }
            else 
            {
                tf1.setText("");
                tf2.setText("");
                java.awt.Dialog obj = new java.awt.Dialog(this,"Login Error");
                java.awt.Label lab1 = new java.awt.Label("Wrong Username/password combination.", Label.CENTER);
                lab1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                lab1.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
                lab1.setForeground(new java.awt.Color(104, 104, 204));
        
                java.awt.Label lab2 = new java.awt.Label("Program will exit", Label.CENTER);
                lab2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                lab2.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
                lab2.setForeground(new java.awt.Color(104, 104, 204));

                java.awt.Button btn1 = new java.awt.Button("OK");
                btn1.setBackground(Color.LIGHT_GRAY);
                btn1.addActionListener(new java.awt.event.ActionListener() 
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt) 
                    {
                        System.exit(0);
                    }
                });
                obj.add(lab1);
                obj.add(lab2);
                obj.add(btn1);
                obj.setSize(355, 155);
                obj.setLayout(new GridLayout(3, 1));
                obj.setVisible(true);
            }
    }//GEN-LAST:event_bActionPerformed

    public static void main(String args[]) 
    {
        adminLogin obj = new adminLogin();
    }
    
    Image img;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button b;
    private java.awt.Label l1;
    private java.awt.Label l2;
    private java.awt.Label l3;
    private java.awt.TextField tf1;
    private java.awt.TextField tf2;
    // End of variables declaration//GEN-END:variables
}