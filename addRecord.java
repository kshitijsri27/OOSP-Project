package oospproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

public class addRecord extends java.awt.Frame 
{
    public addRecord() 
    {
        setVisible(true);
        initComponents();
        setTitle("Add Record");
    }

    private void initComponents() 
    {
        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        label7 = new java.awt.Label();
        choice1 = new java.awt.Choice();

        setMinimumSize(new java.awt.Dimension(480, 350));
        setMaximumSize(new java.awt.Dimension(480, 350));
        setResizable(false);
        
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                exitForm(evt);
            }
        });
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, 20));

        label1.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("College ID");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        label2.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label2.setText("Name of College");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        label3.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label3.setText("Region");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        label4.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label4.setText("Placement Record");
        add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        label5.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label5.setText("Faculty Ranking");
        add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        label6.setFont(new java.awt.Font("Kalinga", 1, 13)); // NOI18N
        label6.setText("Cut-off");
        add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        
        add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 20));
        add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 150, 20));
        add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 150, 20));
        add(textField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 150, -1));

        button1.setBackground(new java.awt.Color(153, 51, 0));
        button1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        button1.setForeground(new java.awt.Color(204, 204, 204));
        button1.setLabel("ADD ");
        button1.addActionListener(new java.awt.event.ActionListener() 
	{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 90, 30));
        
        button2.setBackground(new java.awt.Color(153, 51, 0));
        button2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        button2.setForeground(new java.awt.Color(204, 204, 204));
        button2.setLabel("CANCEL");
        button2.addActionListener(new java.awt.event.ActionListener() 
	{
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                button2ActionPerformed(evt);
            }
        });
        add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, 30));

        label7.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(153, 51, 0));
        label7.setText("ADD RECORDS");
        add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 180, 40));
        
        choice1.add("Andhra Pradesh");
        choice1.add("Arunanchal Pradesh");
        choice1.add("Assam");
        choice1.add("Bihar");
        choice1.add("Chattisgarh");
        choice1.add("Delhi");
        choice1.add("Goa");
        choice1.add("Gujrat");
        choice1.add("Haryana");
        choice1.add("Himanchal Pradesh");
        choice1.add("Jammu and Kashmir");
        choice1.add("Jharkhand");
        choice1.add("Karnataka");
        choice1.add("Kerala");
        choice1.add("Madhya Pradesh");
        choice1.add("Maharashtra");
        choice1.add("Manipur");
        choice1.add("Meghalaya");
        choice1.add("Mizoram");
        choice1.add("Nagaland");
        choice1.add("Odisha");
        choice1.add("Punjab");
        choice1.add("Rajasthan");
        choice1.add("Sikkim");
        choice1.add("Tamil Nadu");
        choice1.add("Tripura");
        choice1.add("Uttarakhand");
        choice1.add("Uttar Pradesh");
        choice1.add("West Bengal");
        
        add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, -1));

        pack();
    }
	
    private void exitForm(java.awt.event.WindowEvent evt) 
	{
            System.exit(0);
	}

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        String s1 = textField1.getText();
        String s2 = textField2.getText();
        String s3 = textField3.getText();
        String s4 = textField4.getText();
        String s5 = textField5.getText();
        String s = choice1.getSelectedItem();
        try
        {
                connect c = new connect();
                String q = "Insert into college values(" + s1 + ", '" + s2 + "' , '" + s + "' , " + s3 + ", " + s4 + ", " + s5 + ", NULL);";
                c.update(q);
                java.awt.Dialog obj = new java.awt.Dialog(this,"Record Added");
                java.awt.Label lab1 = new java.awt.Label("Record Added.", Label.CENTER);
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
        addRecord obj = new addRecord();
    }

    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Choice choice1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
}