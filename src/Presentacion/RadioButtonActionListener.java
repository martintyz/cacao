/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

/**
 *
 * @author Jefe de Sistemas
 */
class RadioButtonActionListener implements ActionListener{
    
    public JTabbedPane tabbedPanePrincipal;
    public JPanel pnl;
    
    public RadioButtonActionListener(JTabbedPane tabbedPanePrincipal){
        this.tabbedPanePrincipal = tabbedPanePrincipal;
    }
    
    public RadioButtonActionListener(JPanel pnl){
        this.pnl = pnl;
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        JRadioButton rbtn = (JRadioButton)e.getSource();
        
        /*if((rbtn.getText().equals("Casado")) || (rbtn.getText().equals("Unión Libre"))){
            tabbedPanePrincipal.setEnabledAt(2, true);        
        }else{
            tabbedPanePrincipal.setEnabledAt(2, false);          
        }*/
        switch (rbtn.getText()){
            case "Soltero":
                tabbedPanePrincipal.setEnabledAt(2, false);
                break;
            case "Divorciado":
                tabbedPanePrincipal.setEnabledAt(2, false);
                break;
            case "Casado":
                tabbedPanePrincipal.setEnabledAt(2, true);
                break;
            case "Unión Libre":
                tabbedPanePrincipal.setEnabledAt(2, true);
                break;       
            case "Empleado":
                tabbedPanePrincipal.setEnabledAt(3, true);
                tabbedPanePrincipal.setEnabledAt(4, false);
                break;
            case "Negocio":
                tabbedPanePrincipal.setEnabledAt(4, true);
                tabbedPanePrincipal.setEnabledAt(3, false);
                break;
            case "Ambos":
                tabbedPanePrincipal.setEnabledAt(3, true);
                tabbedPanePrincipal.setEnabledAt(4, true);
                break;
           /* default: 
                tabbedPanePrincipal.setEnabledAt(2, false);
                tabbedPanePrincipal.setEnabledAt(3, false);
                tabbedPanePrincipal.setEnabledAt(4, false);
                break;*/
            
        }
    }
    
}
