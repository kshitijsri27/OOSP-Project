package oospproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

/**
 *
 * @author priyanka
 */

public class modifyRecord extends java.awt.Frame 
{
    public modifyRecord() 
    {
        initComponents();
        setTitle("Modify Record");
        setVisible(true);
    }

    private void initComponents() 
    {
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setMinimumSize(new java.awt.Dimension(480, 320));
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 51, 51));
        label1.setText("MODIFY RECORD");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, 40));

        label2.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label2.setText("College ID");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        label3.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label3.setText("New Placement Record");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        label4.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label4.setText("New Cut-off");
        add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 120, 30));
        add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 30));
        add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 120, 30));

        button1.setBackground(new java.awt.Color(0, 51, 51));
        button1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 204));
        button1.setLabel("SUBMIT");
        button1.addActionListener(new java.awt.event.ActionListener() 
	{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 30));
        
        button2.setBackground(new java.awt.Color(0, 51, 51));
        button2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 204));
        button2.setLabel("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() 
	{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 30));

        pack();
    }
    
    private void exitForm(java.awt.event.WindowEvent evt) 
    {
        System.exit(0);
    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        String sr1 = textField1.getText();
        String sr2 = textField2.getText();
        String sr3 = textField3.getText();
        try
        {
                    connect c = new connect();
                    String q = "update college set placement = " + sr2 + " where college_id = " + sr1 + ";";
                    c.update(q);
                    String r = "update college set cutoff = " + sr3 + " where college_id = " + sr1 + ";";
                    c.update(r);
                    java.awt.Dialog obj = new java.awt.Dialog(this,"Record Modified");
                    java.awt.Label lab1 = new java.awt.Label("Record Modified.", Label.CENTER);
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
        modifyRecord obj = new modifyRecord();
    }

    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
}