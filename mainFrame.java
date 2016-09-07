package oospproject;

/**
 *
 * @author Devang Pandey 007
 */

public class mainFrame extends java.awt.Frame 
{
    public mainFrame() 
    {
        initComponents();
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();

        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(204, 204, 204));
        label1.setText("New User?");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        label2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(204, 204, 204));
        label2.setText("Existing User");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        button1.setBackground(new java.awt.Color(204, 153, 255));
        button1.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        button1.setLabel("Create an account");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 220, 40));

        button2.setBackground(new java.awt.Color(204, 153, 255));
        button2.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        button2.setLabel("Sign in");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 220, 40));

        button3.setBackground(new java.awt.Color(204, 255, 255));
        button3.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        button3.setLabel("Continue as a guest user");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 290, 40));

        button4.setBackground(new java.awt.Color(255, 204, 204));
        button4.setFont(new java.awt.Font("DokChampa", 1, 18)); // NOI18N
        button4.setLabel("Admin Login");
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered

        button1.setBackground(new java.awt.Color(204, 130, 123));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
       
        button1.setBackground(new java.awt.Color(204, 153, 255));
    }//GEN-LAST:event_button1MouseExited

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        signIn obj = new signIn();
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered

        button2.setBackground(new java.awt.Color(204, 130, 123));
    }//GEN-LAST:event_button2MouseEntered

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited

        button2.setBackground(new java.awt.Color(204, 153, 255));
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
    
        button3.setBackground(new java.awt.Color(103, 231, 65));
    }//GEN-LAST:event_button3MouseEntered

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
    
        button3.setBackground(new java.awt.Color(204, 255, 255));
    }//GEN-LAST:event_button3MouseExited

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
 
        adminLogin obj = new adminLogin();
        dispose();
    }//GEN-LAST:event_button4ActionPerformed

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered

        button4.setBackground(new java.awt.Color(94, 11, 29));
    }//GEN-LAST:event_button4MouseEntered

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
    
        button4.setBackground(new java.awt.Color(255, 204, 204));
    }//GEN-LAST:event_button4MouseExited

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
     
        createAccount obj = new createAccount();
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        genUser obj = new genUser();
        dispose();
    }//GEN-LAST:event_button3ActionPerformed
        
    public static void main(String args[]) 
    {
        mainFrame obj = new mainFrame();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}