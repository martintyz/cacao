/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Entidades.Empresa;
import java.awt.Dimension;

/**
 *
 * @author Sistemas
 */
public class frmMenusys extends javax.swing.JFrame {

    /**
     * Creates new form fmrMenusys
     */
    public frmMenusys() {
        initComponents();
         setLocationRelativeTo(null);
        Image icon=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/greed.png"));
        setIconImage(icon);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("GREED - Sistema de Cartera "+Empresa.getSnombreEmpresa());
        this.setLayout(new BorderLayout());
        this.add(jdpSistema, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpSistema = new javax.swing.JDesktopPane();
        mnbSistema = new javax.swing.JMenuBar();
        mnuCatalogos = new javax.swing.JMenu();
        mnicodigosp = new javax.swing.JMenuItem();
        mnuOperacion = new javax.swing.JMenu();
        mnuAcreditados = new javax.swing.JMenu();
        mniIndividuales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(6, 66, 125));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName(""); // NOI18N
        setSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        jdpSistema.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jdpSistema);
        jdpSistema.setBounds(0, -2, 150, 250);

        mnbSistema.setBackground(new java.awt.Color(255, 255, 255));
        mnbSistema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 36, 72)));
        mnbSistema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnbSistema.setPreferredSize(new java.awt.Dimension(124, 25));

        mnuCatalogos.setBackground(new java.awt.Color(255, 255, 255));
        mnuCatalogos.setText("Catálogos");

        mnicodigosp.setBackground(new java.awt.Color(255, 255, 255));
        mnicodigosp.setText("Municipios y Códigos Postales");
        mnicodigosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnicodigospActionPerformed(evt);
            }
        });
        mnuCatalogos.add(mnicodigosp);

        mnbSistema.add(mnuCatalogos);

        mnuOperacion.setBackground(new java.awt.Color(255, 255, 255));
        mnuOperacion.setText("Operación");

        mnuAcreditados.setBackground(new java.awt.Color(255, 255, 255));
        mnuAcreditados.setText("Acreditados");
        mnuAcreditados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcreditadosActionPerformed(evt);
            }
        });

        mniIndividuales.setBackground(new java.awt.Color(255, 255, 255));
        mniIndividuales.setText("Individuales");
        mniIndividuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniIndividualesActionPerformed(evt);
            }
        });
        mnuAcreditados.add(mniIndividuales);

        mnuOperacion.add(mnuAcreditados);

        mnbSistema.add(mnuOperacion);

        setJMenuBar(mnbSistema);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniIndividualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniIndividualesActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Click");
        try{
            frmDatosGeneralesCliente datos=new frmDatosGeneralesCliente();
            jdpSistema.add(datos);
            jdpSistema.moveToFront(datos);
            datos.setSize(jdpSistema.getWidth(), jdpSistema.getHeight());
            datos.setLocation(0, 0);
            datos.show();
            
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_mniIndividualesActionPerformed

    private void mnuAcreditadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcreditadosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnuAcreditadosActionPerformed

    private void mnicodigospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnicodigospActionPerformed
        // TODO add your handling code here:
        frmCodigoPostal cp=new frmCodigoPostal();
        Dimension desktopSize = jdpSistema.getSize();
        Dimension FrameSize = cp.getSize();
        cp.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        jdpSistema.add(cp);
        cp.show();
    }//GEN-LAST:event_mnicodigospActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jdpSistema;
    private javax.swing.JMenuBar mnbSistema;
    private javax.swing.JMenuItem mniIndividuales;
    private javax.swing.JMenuItem mnicodigosp;
    private javax.swing.JMenu mnuAcreditados;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenu mnuOperacion;
    // End of variables declaration//GEN-END:variables
}
