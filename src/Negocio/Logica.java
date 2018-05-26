/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Datos.AccesoDatos;
import Datos.ManejoDatos;
import java.sql.ResultSet;

/**
 *
 * @author Sistemas
 */
public class Logica {
    public boolean TestCon(String IP, String Contraseña, String Puerto, String Base, String Usuario){
        try{
            if(AccesoDatos.TestConexion(IP, Usuario, Contraseña, Base, Puerto))
            {
                return true;
            }
            else{
                return false;
            }
        }catch(Exception e){
           return false;
        }
    }
    public ResultSet Login(String Usuario, String Clave){
        try{
            ManejoDatos mdDatos = new ManejoDatos();
            ResultSet Resultado= mdDatos.Login(Usuario,Clave);
            if(Resultado != null)
            return Resultado; 
        }catch(Exception e){
            System.out.println("Ha ocurrido un error validando los datos:" + e.getMessage());
        }
        return null;
    }
    //<editor-fold defaultstate="collapsed" desc="Consultas"> 
    public ResultSet Empresas(){
        try {
            ManejoDatos mdDatos=new ManejoDatos();
            ResultSet emp=mdDatos.Empresas();
            if(emp!=null)
                return emp;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error cargando la lista de empresas "+e.getMessage());
        }
        return null;
    }
    public ResultSet LoginEmpresa(int idusuario,int idempresa){
        try{
            ManejoDatos mdDatos=new ManejoDatos();
            ResultSet perm=mdDatos.LoginEmpresa(idusuario, idempresa);
            if(perm!=null)
                return perm;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando los permisos del usuario en la empresa "+e.getMessage());
        }
        return null;
    }
    public ResultSet Entidades(){
        try{
            ManejoDatos mdDatos=new ManejoDatos();
            ResultSet ent=mdDatos.Entidades();
            if(ent!=null)
                return ent;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando la lista de Entidades "+e.getMessage());
        }
        return null;
    }
    public ResultSet Municipios(int idestado){
        try{
            ManejoDatos mdDatos=new ManejoDatos();
            ResultSet muni=mdDatos.Municipios(idestado);
            if(muni!=null)
                return muni;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando la lista de Municipios "+e.getMessage());
        }
        return null;
    }
    public ResultSet CP(int idmuni){
        try{
            ManejoDatos mdDatos=new ManejoDatos();
            ResultSet cp=mdDatos.CP(idmuni);
            if(cp!=null)
                return cp;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando la lista de Códigos Postales "+e.getMessage());
        }
        return null;
    }
    public ResultSet EdoyMuni(int idmuni){
        try{
            ManejoDatos mdDatos=new ManejoDatos();
            ResultSet edoymuni=mdDatos.EdoyMuni(idmuni);
            if(edoymuni!=null)
                return edoymuni;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando el estado y municipio "+e.getMessage());
        }
        return null;
    }
    public ResultSet TipoAsent(){
        try{
            ManejoDatos mdd=new ManejoDatos();
            ResultSet tipoa=mdd.TipoAsent();
            if(tipoa!=null)
                return tipoa;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando el tipo de asentamiento "+e.getMessage());
        }
        return null;
    }
    public ResultSet CiudadEM(int edo,int muni){
        try{
            ManejoDatos mdd=new ManejoDatos();
            ResultSet cem=mdd.CiudadEM(edo, muni);
            if(cem!=null)
                return cem;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando la lista de Ciudades del municipio "+e.getMessage());
        }
        return null;
    }
    public ResultSet ZonaP(){
        try{
            ManejoDatos mdd=new ManejoDatos();
            ResultSet zona=mdd.ZonaP();
            if(zona!=null)
                return zona;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando la lista de Zona de Poblacion "+e.getMessage());
        }
        return null;
    }
    public ResultSet  CPxId(int idcp){
        try{
            ManejoDatos mdd=new ManejoDatos();
            ResultSet cp=mdd.CPxId(idcp);
            if(cp!=null)
                return cp;
        }catch(Exception e){
            System.out.println("Ha ocurrido un error cargando los datos del Código Postal "+e.getMessage());
        }
        return null;
    }
    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc="Insertar">
    public void InsertarCP(String detalle,String cp,int idciudad,int idmuni,int idedo,int idzonap,int idtipoa){
        try{
            ManejoDatos mdd=new ManejoDatos();
            mdd.InsertarCP(detalle, cp, idciudad, idmuni, idedo, idzonap, idtipoa);
        }catch(Exception e){
            System.out.println("Ha ocurrido un error al agregar el Código Postal "+e.getMessage());
        }
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Actualizar">
    public Boolean ActualizarCP(int idcp,String codigo,String detalle,int tipoa,int zonap,int idcd){
        try{
            ManejoDatos mdd=new ManejoDatos();
            return mdd.ActualizarCP(idcp, codigo, detalle, tipoa, zonap, idcd);
        }catch(Exception e){
            System.out.println("Ha ocurrido un error al actualizar el Código Postal "+e.getMessage());
        }
        return false;
    }
    //</editor-fold>
}
