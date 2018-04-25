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
public class Usuario {

    /**
     * @return the cAlias
     */
    public static String getcAlias() {
        return cAlias;
    }

    /**
     * @param acAlias the cAlias to set
     */
    public static void setcAlias(String acAlias) {
        cAlias = acAlias;
    }

    /**
     * @return the cPwd
     */
    public static String getcPwd() {
        return cPwd;
    }

    /**
     * @param acPwd the cPwd to set
     */
    public static void setcPwd(String acPwd) {
        cPwd = acPwd;
    }

    private static int Iiduser;
    private static String cAlias;
    private static String cPwd;
    
    /**
     * @return the Iiduser
     */
    public static int getIiduser() {
        return Iiduser;
    }

    /**
     * @param aIiduser the Iiduser to set
     */
    public static void setIiduser(int aIiduser) {
        Iiduser = aIiduser;
    }

    

}
