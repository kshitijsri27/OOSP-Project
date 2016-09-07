package oospproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

/**
 *
 * @author priyanka
 */

public class deleteRecord extends java.awt.Frame 
{
    public deleteRecord() 
    {
        initComponents();
        setVisible(true);
        setTitle("Delete Record");
    }

    private void initComponents() 
    {
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setMinimumSize(new java.awt.Dimension(480, 320));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 102, 102));
        label1.setText("DELETE RECORD");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 210, 60));

        label2.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label2.setText("College ID");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 80, 30));
        
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 140, 30));

        button1.setBackground(new java.awt.Color(255, 102, 102));
        button1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        button1.setLabel("DELETE");
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 100, 30));
        button1.addActionListener(new java.awt.event.ActionListener() 
	{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button1ActionPerformed(evt);
            }
        });
        
        button2.setBackground(new java.awt.Color(255, 102, 102));
        button2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        button2.setLabel("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() 
	{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 100, 30));

        pack();
    }
    
    private void exitForm(java.awt.event.WindowEvent evt) 
    {
        System.exit(0);
    }
   
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
                String str = textField1.getText();
                try
                {
                    connect c = new connect();
                    String q = "delete from college where college_id = " + str + " ;";
                    c.update(q);
                    java.awt.Dialog obj = new java.awt.Dialog(this,"Record Deleted");
                    java.awt.Label lab1 = new java.awt.Label("Record Deleted.", Label.CENTER);
                    lab1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                    lab1.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
                    lab1.setForeground(new java.awt.Color(104, 104, 204));

                    java.awt.Button btn1 = new java.awt.Button("OK");
                    btn1.setBackground(Color.LIGHT_GRAY);
                    btn1.addActionListener(new java.awt.event.ActionListener() 
                    {
                        public void actionPerformed(java.awt.event.ActionEvent evt) 
                        {
                            //System.exit(0);
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
                
    }
    
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        dispose();
    }
    
    public static void main(String args[]) 
    {
        deleteRecord ob = new deleteRecord();
    }

    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textField1;
}