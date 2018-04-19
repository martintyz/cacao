/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author Sistemas
 */
public class AccesoDatos {
    public static Connection ObtenerConexion(){
        Connection cnn = null;
        try{
            FileInputStream Entra = new FileInputStream("config.cao");
            Properties pr= new Properties();
            pr.load(Entra);
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+pr.getProperty("IPSERVER")+":"+pr.getProperty("PUERTO")+"/"+pr.getProperty("DB");
            String user = pr.getProperty("USUARIO");
            String pwd = pr.getProperty("PASSWORD");
            cnn = DriverManager.getConnection(url,user,pwd);
        }catch(ClassNotFoundException e){
            cnn= null;
            System.out.println("Error no se puede cargar el driver:" + e.getMessage());
        }catch(SQLException e){
            cnn = null;
            System.out.println("Error no se puede establecer la conexion:" + e.getMessage());
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        return cnn;
    }
    
    public static boolean TestConexion(String IPS, String USU, String PAS, String DAT, String PUE) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        String Url = "jdbc:mysql://"+IPS+":"+PUE+"/"+DAT;
        
        String Usuario = USU;
        String Contraseña = PAS;
        Connection CNN;
        CNN = DriverManager.getConnection(Url, Usuario, Contraseña);
        
        if(CNN!=null)
                
        {
            return true;
        }
        
        return false;
        //Statement SQL = CNN.createStatement(ResultSet)
    }
}
