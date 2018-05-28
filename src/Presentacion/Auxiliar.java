/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Sistemas
 */
public class Auxiliar {
    public Boolean RangoCP(int idestado,int cp){
        switch(idestado){
            case 1:
                return cp>=20000 && cp<=20999;
            case 2:
                return cp>=21000 && cp<=22999;
            case 3:
                return cp>=23000 && cp<=23999;
            case 4:
                return cp>=24000 && cp<=24999;
            case 5:
                return cp>=29000 && cp<=30999;
            case 6:
                return cp>=31000 && cp<=33999;
            case 7:
                return cp>=25000 && cp<=27999;
            case 8:
                return cp>=28000 && cp<=28999;
            case 9:
                return cp>=100 && cp<=16999;
            case 10:
                return cp>=34000 && cp<=35999;
            case 11:
                return cp>=36000 && cp<=38999;
            case 12:
                return cp>=39000 && cp<=41999;
            case 13:
                return cp>=42000 && cp<=43999;
            case 14:
                return cp>=44000 && cp<=49999;
            case 15:
                return cp>=50000 && cp<=57999;
            case 16:
                return cp>=58000 && cp<=61999;
            case 17:
                return cp>=62000 && cp<=62999;
            case 18:
                return cp>=63000 && cp<=63999;
            case 19:
                return cp>=64000 && cp<=67999;
            case 20:
                return cp>=68000 && cp<=71999;
            case 21:
                return cp>=72000 && cp<=75999;
            case 22:
                return cp>=76000 && cp<=76999;
            case 23:
                return cp>=77000 && cp<=77999;
            case 24:
                return cp>=78000&& cp<=79999;
            case 25:
                return cp>=80000 && cp<=82999;
            case 26:
                return cp>=83000 && cp<=85999;
            case 27:
                return cp>=86000 && cp<=86999;
            case 28:
                return cp>=87000 && cp<=89999;
            case 29:
                return cp>=90000 && cp<=90999;
            case 30:
                return cp>=91000 && cp<=96999;
            case 31:
                return cp>=97000 && cp<=97999;
            case 32:
                return cp>=98000 && cp<=99999;
            default:
                return false;
        }
    }
    public void llenarCombo(JComboBox cmb,ResultSet r,int iddisplay,int idvalue){
        cmb.removeAllItems();
        int cont=0;
        try {
            while(r.next()){
                cont++;
            }
            r.beforeFirst();
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
            Object[] matriz=new Object[cont];
            int i=0;
        try {
            while(r.next()){
             DisplayValueModel dvm=new DisplayValueModel(r.getObject(iddisplay),r.getObject(idvalue));
             matriz[i]=dvm;
             i++;
             //cmbemp.addItem(dvm);
             DefaultComboBoxModel mod=new DefaultComboBoxModel(matriz);
             cmb.setModel(mod);
            }
        } catch (SQLException e) {
        
            System.out.println("Error "+e.getMessage());
        }
    }
    public void llenarCombo(JComboBox cmb,ResultSet r,int iddisplay,int idvalue,int idvalue2){
        cmb.removeAllItems();
        int cont=0;
        try {
            while(r.next()){
                cont++;
            }
            r.beforeFirst();
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
            Object[] matriz=new Object[cont];
            int i=0;
        try {
            while(r.next()){
             DisplayValueModel dvm=new DisplayValueModel(r.getObject(iddisplay),r.getObject(idvalue),r.getObject(idvalue2));
             matriz[i]=dvm;
             i++;
            }
             //cmbemp.addItem(dvm);
             DefaultComboBoxModel mod=new DefaultComboBoxModel(matriz);
             cmb.setModel(mod);
            
        } catch (SQLException e) {
        
            System.out.println("Error "+e.getMessage());
        }
    }
}
