/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sistemas
 */
public class ManejoDatos {
    //<editor-fold defaultstate="collapsed" desc="Consultas">
    public ResultSet Login(String Usuario, String pwd){
        
        try{
            
            Connection cnn= AccesoDatos.ObtenerConexion();
            PreparedStatement pstm = cnn.prepareStatement("{call spConsultaLoginUsuario(?,?)}");
            pstm.setString(1, Usuario);
            pstm.setString(2, pwd);
            ResultSet r= pstm.executeQuery();
            if(r!=null){
                return r;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public ResultSet Empresas(){
            try{
                Connection cnn= AccesoDatos.ObtenerConexion();
            PreparedStatement pstm = cnn.prepareStatement("{call spConsultaLoginEmpresa()}");
            ResultSet r= pstm.executeQuery();
            if(r!=null)
                return r;
            }catch(Exception e){
                System.out.println(e);
            }
           return null;
    }
    public ResultSet Entidades(){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareStatement("{call spConsultaEntidad()}");
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    // </editor-fold>
}
