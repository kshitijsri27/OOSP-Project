package oospproject;

import java.sql.*;

/**
 *
 * @author Devang Pandey 007
 */

public class connect 
{
    Connection con;
    Statement state;
    ResultSet rs;
    
    public connect()
    {
        try
        {
            Class.forName("com.mysql.jbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3036/project", "root", "snapdragon");
            state = con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public ResultSet execute(String str)
    {
        try
        {
            return(state.executeQuery(str));
        }
        
        catch(Exception e){}
            
        return null;
    }
    
    public void update(String str)
    {
        try
        {
            state.executeUpdate(str);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
    
    public Connection get()
    {
        return con;
    }
}
