/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Datos.AccesoDatos;
import Datos.ManejoDatos;

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
    
}
