/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Properties;

import Negocio.Logica;
import Entidades.Usuario;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Sistemas
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/greed.png"));
        setIconImage(icon);
        setTitle("CACAO - Sistema de cartera");
        this.getContentPane().setBackground(Color.WHITE);
        this.cmbemp.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbemp = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btniniciar = new javax.swing.JButton();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CACAO - Sistema de Cartera");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(730, 650));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(730, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(3, 36, 72));
        jPanel2.setPreferredSize(new java.awt.Dimension(365, 425));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/greedICO.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        btnsalir.setBackground(new java.awt.Color(3, 36, 72));
        btnsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.setBorder(null);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsalir))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnsalir)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 650));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Identifícate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 111, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        cmbemp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbemp.setBorder(null);
        cmbemp.setNextFocusableComponent(txtuser);
        getContentPane().add(cmbemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 190, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Empresa");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        txtuser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setBorder(null);
        txtuser.setNextFocusableComponent(txtpass);
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 306, 190, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 327, 190, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 431, 190, 10));

        btniniciar.setBackground(new java.awt.Color(255, 255, 255));
        btniniciar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btniniciar.setText("Iniciar Sesión");
        btniniciar.setBorder(null);
        btniniciar.setName(""); // NOI18N
        btniniciar.setNextFocusableComponent(cmbemp);
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 106, 37));

        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass.setBorder(null);
        txtpass.setNextFocusableComponent(btniniciar);
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 411, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
//        Logica oLogica=new Logica();
//        ResultSet emp=oLogica.Empresas();
//        DefaultComboBoxModel mod=new DefaultComboBoxModel();
//          cmbemp.removeAllItems();
//        mod.addElement("Seleccione un campo");
//        cmbemp.setModel(mod);
//        try {
//            while(emp.next()){
//             DisplayValueModel dvm=new DisplayValueModel(emp.getObject(1),emp.getObject(2));
//             //cmbemp.addItem(dvm);
//            }
//        } catch (SQLException e) {
//        
//            System.out.println("Error "+e.getMessage());
//        }
    }//GEN-LAST:event_formWindowActivated

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        // TODO add your handling code here:
        try{
            String  usuario = txtuser.getText();
            String pass= new String(txtpass.getPassword());
            //DisplayValueModel cbm = (DisplayValueModel)cmbemp.getSelectedItem();
            Logica oLogica=new Logica();
            ResultSet r=oLogica.Login(usuario, pass);
            if(r!=null){
                if(r.next()){
                    Usuario.setIiduser(r.getInt("idusuario"));
                    Usuario.setcAlias(usuario);
                    Usuario.setcPwd(pass);
                }
            }
            JOptionPane.showMessageDialog(null,"Bienvenido ");//+Usuario.getcNombre());
            this.setVisible(false);
            frmMenusys menu=new frmMenusys();
            menu.setVisible(true);    
            
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }//GEN-LAST:event_btniniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmLogin().setVisible(true);
//            }
//        });
        Reset();
       //new Thread (new Splash()).start();
    }
    
    public static void Reset(){
        try{
        Properties Proplect = new Properties();
        InputStream Entra = new FileInputStream("config.cao");
        Proplect.load(Entra);
        String chk=Proplect.getProperty("CHECK");
        if("1".equals(chk)){
            new Thread(new Splash()).start();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new frmLogin().setVisible(false);
            }
        });
        }else{
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConfiguracion().setVisible(true);
            }
            });
        }
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cmbemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
