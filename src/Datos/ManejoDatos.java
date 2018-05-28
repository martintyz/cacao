/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.sun.accessibility.internal.resources.accessibility;
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
    public ResultSet LoginEmpresa(int idusuario,int idempresa){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareStatement("{call spConsultaUsuarioEmpresa(?,?)}");
            pstm.setInt(1, idusuario);
            pstm.setInt(2, idempresa);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
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
    public ResultSet Municipios(int idestado){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareStatement("{call spConsultaMunicipio(?)}");
            pstm.setInt(1, idestado);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;            
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet CP(int idmuni){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareStatement("{call spConsultaCP(?)}");
            pstm.setInt(1,idmuni);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet EdoyMuni(int idmuni){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaEdoyMuni(?)}");
            pstm.setInt(1, idmuni);
            ResultSet r=pstm.executeQuery();
            if (r!=null) 
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet TipoAsent(){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaTipoAsent()}");
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet CiudadEM(int edo,int muni){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaCiudadEM(?,?)}");
            pstm.setInt(1, edo);
            pstm.setInt(2, muni);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet ZonaP(){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaZonaP()}");
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet CPxId(int idcp){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaCPxId(?)}");
            pstm.setInt(1, idcp);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    public ResultSet TipoID(){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaTipoID()}");
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet CPxCod(String cod){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaCPxCod(?)}");
            pstm.setString(1, cod);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet tipoAxID(int tipoA){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareCall("{call spConsultaTipoAxID(?)}");
            pstm.setInt(1, tipoA);
            ResultSet r=pstm.executeQuery();
            if(r!=null)
                return r;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Insertar">
    public void InsertarCP(String detalle,String cp,int idciudad,int idmuni,int idedo,int idzonap,int idtipoa){
        
        try{
            
            Connection cnn= AccesoDatos.ObtenerConexion();
            PreparedStatement pstm = cnn.prepareStatement("{call spInsertarCP(?,?,?,?,?,?,?)}");
            pstm.setString(1, detalle);
            pstm.setString(2, cp);
            pstm.setInt(3, idciudad);
            pstm.setInt(4, idmuni);
            pstm.setInt(5, idedo);
            pstm.setInt(6, idzonap);
            pstm.setInt(7, idtipoa);
            pstm.executeQuery();
            cnn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Actualizar">
    public Boolean ActualizarCP(int idcp,String cp,String detalle,int tipoA,int zonaP,int idcd){
        try{
            Connection cnn=AccesoDatos.ObtenerConexion();
            PreparedStatement pstm=cnn.prepareStatement("{call spActualizarCP(?,?,?,?,?,?)}");
            pstm.setInt(1, idcp);
            pstm.setString(2, cp);
            pstm.setString(3, detalle);
            pstm.setInt(4, tipoA);
            pstm.setInt(5, zonaP);
            pstm.setInt(6, idcd);
            pstm.executeQuery();
            cnn.close();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    //</editor-fold>
}
