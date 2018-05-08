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
    //</editor-fold> 
}
