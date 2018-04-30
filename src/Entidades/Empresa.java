/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Sistemas
 */
public class Empresa {

    /**
     * @return the Iidempresa
     */
    public static int getIidempresa() {
        return Iidempresa;
    }

    /**
     * @param aIidempresa the Iidempresa to set
     */
    public static void setIidempresa(int aIidempresa) {
        Iidempresa = aIidempresa;
    }

    /**
     * @return the SnombreEmpresa
     */
    public static String getSnombreEmpresa() {
        return SnombreEmpresa;
    }

    /**
     * @param aSnombreEmpresa the SnombreEmpresa to set
     */
    public static void setSnombreEmpresa(String aSnombreEmpresa) {
        SnombreEmpresa = aSnombreEmpresa;
    }
    private static int Iidempresa;
    private static String SnombreEmpresa;
    
}
