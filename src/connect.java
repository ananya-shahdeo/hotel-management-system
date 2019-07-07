
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bolt
 */
public class connect {


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bolt
 */

     public static void main(String[] args) {
        ConnectorDB();
    }
    public static Connection ConnectorDB(){
         Connection conn=null;
          
        try{
            Class.forName("oracle.jdbc.OracleDriver");
          conn=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","shahdeo","oracle");
            System.out.println("Successfully connected");
           return conn;
        }catch(Exception e)
        {
             System.out.println("nc"+e.getMessage());
        }
           return null;
    }
}

    


    

