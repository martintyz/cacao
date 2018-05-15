/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import org.jfree.text.TextBox;

/**
 *
 * @author Jefe de Sistemas
 */
class RadioButtonActionListener implements ActionListener, KeyListener{
    
    public JTabbedPane tabbedPanePrincipal;
    public JPanel pnl;
    public TextBox txt;
    
    public RadioButtonActionListener(JTabbedPane tabbedPanePrincipal){
        this.tabbedPanePrincipal = tabbedPanePrincipal;
    }
    
    public RadioButtonActionListener(JPanel pnl/*TextBox txt*/){
        this.pnl = pnl;
        //this.txt = txt;
    }
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        JRadioButton rbtn = (JRadioButton)e.getSource();
        
        switch (rbtn.getText()){
            case "Soltero":
                tabbedPanePrincipal.setEnabledAt(2, false);
                break;
            case "Divorciado":
                tabbedPanePrincipal.setEnabledAt(2, false);
                break;
            case "Viudo":
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
            case "Si":
                pnl.setVisible(true);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
