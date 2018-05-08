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
        JRadioButton rbtnEstadoCivil = (JRadioButton)e.getSource();
        
        if((rbtnEstadoCivil.getText().equals("Casado")) || (rbtnEstadoCivil.getText().equals("Unión Libre"))){
            tabbedPanePrincipal.setEnabledAt(2, true);
        }else{
            tabbedPanePrincipal.setEnabledAt(2, false);
        }
    }
    
}
