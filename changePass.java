//file not being renamed and deleted

package oospproject;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.io.*;

/**
 *
 * @author priyanka
 */

public class changePass extends java.awt.Frame 
{
    public changePass() 
    {
        initComponents();
        setVisible(true);
        setTitle("Change Password");
    }

    private void initComponents() 
    {
        b = new java.awt.Button();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();

        setMaximumSize(new java.awt.Dimension(480, 300));
        setMinimumSize(new java.awt.Dimension(480, 300));
        setPreferredSize(new java.awt.Dimension(480, 300));
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() 
        {
            public void windowClosing(java.awt.event.WindowEvent evt) 
            {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
       
        b.setBackground(new java.awt.Color(0, 51, 51));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setLabel("SUBMIT");
        b.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                bActionPerformed(evt);
            }
        });
        add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, 30));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Narkisim", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 51, 51));
        label1.setName(""); // NOI18N
        label1.setText("Change Password");
        add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, 40));

        label2.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        label2.setText("Login ID");
        add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        label3.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 13)); // NOI18N
        label3.setText("Password");
        add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));
              
        textField2.setEchoChar('*');
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 120, 20));
        add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 120, -1));

        pack();
    }

    private void exitForm(java.awt.event.WindowEvent evt) 
    {
        System.exit(0);
    }

    public static void changePassword(String str1, String str2) throws IOException
    {
                File f1, f2, f3;
		FileReader fr1 = null;
                FileReader fr2 = null;
                FileWriter fw1 = null;
                BufferedReader br1, br2;
                boolean lgn = false, lgn2 = false;
                                
                f1 = new File("C:\\Users\\Devang Pandey 007\\Documents\\NetBeansProjects\\OOSPproject\\src\\oospproject\\loginIDs.txt");
                f2 = new File("C:\\Users\\Devang Pandey 007\\Documents\\NetBeansProjects\\OOSPproject\\src\\oospproject\\passkeys.txt");
                f3 = new File("C:\\Users\\Devang Pandey 007\\Documents\\NetBeansProjects\\OOSPproject\\src\\oospproject\\newpasskeys.txt");
                try
                {
                    fr1 = new FileReader(f1);
                    fr2 = new FileReader(f2);
                    fw1 = new FileWriter(f3);
                    lgn = f3.createNewFile();
                    br1 = new BufferedReader(fr1);
                    br2 = new BufferedReader(fr2);
                    System.out.println(str1);
                    System.out.println(str2);
                    String sr1, sr2;
                    int count = 0, i = 0;
                    
                    while((sr1 = br1.readLine()) != null)
                    {
                        System.out.println(sr1);
                        if(sr1.equals(str1))
			break;
				
			else
			count++;
                    }
                    System.out.println(count);
                    while(i!=count && (sr2 = br2.readLine())!=null)
                    {
			fw1.write(sr2);
                        fw1.write("\n");
                        System.out.println("inside 1st loop");
                        System.out.println(sr2);
                        i++;
                    }
                    
                    fw1.write(str2);
                    fw1.write("\n");
                    sr2 = br2.readLine();
                    
                    while((sr2 = br2.readLine())!=null)
                    {
                        System.out.println(sr2);
                        fw1.write(sr2);
                        fw1.write("\n");
                    }
                    
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    f2.delete();
                    lgn2 = f3.renameTo(f2);
                    System.out.println(lgn2);
                    fr1.close();
                    fr2.close();
                    fw1.close();
                }
    }
    
     private void bActionPerformed(java.awt.event.ActionEvent evt) 
     {
         String str1 = textField1.getText();
         String str2 = textField2.getText();
         try
         {
            changePassword(str1, str2);
                java.awt.Dialog obj = new java.awt.Dialog(this,"Password Changed");
                java.awt.Label lab1 = new java.awt.Label("Your password is successfully changed.", Label.CENTER);
                lab1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                lab1.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
                lab1.setForeground(new java.awt.Color(104, 104, 204));
        
                java.awt.Label lab2 = new java.awt.Label("For proceeding please login with your new password", Label.CENTER);
                lab2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
                lab2.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
                lab2.setForeground(new java.awt.Color(104, 104, 204));

                java.awt.Button btn1 = new java.awt.Button("OK");
                btn1.setBackground(Color.LIGHT_GRAY);
                btn1.addActionListener(new java.awt.event.ActionListener() 
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt) 
                    {
                        setVisible(false);
                        adminLogin refresh = new adminLogin();
                    }
                });
                obj.add(lab1);
                obj.add(lab2);
                obj.add(btn1);
                obj.setSize(455, 155);
                obj.setLayout(new GridLayout(3, 1));
                obj.setVisible(true);
         }
        
        catch(IOException e)
        {
            e.printStackTrace();
        }
     }
     
    public static void main(String args[]) 
    {
        changePass obj = new changePass();
    }

    private java.awt.Button b;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
}