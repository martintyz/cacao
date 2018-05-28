/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Presentacion.DomicilioTemporal;
import Negocio.Logica;
import groovyjarjarantlr.collections.impl.Vector;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Jefe de Sistemas
 */
public class frmDatosGeneralesCliente extends javax.swing.JInternalFrame {
    
    char validarCampoNumerico, validarCampoLetras;
    RadioButtonActionListener actionListener, actionListener2;
    DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat anio = new SimpleDateFormat("yyyy");
    SimpleDateFormat mes = new SimpleDateFormat("MM");
    SimpleDateFormat dia = new SimpleDateFormat("dd");
    
    String fechaChooser;
    DomicilioTemporal auxDom;
    ArrayList<DomicilioTemporal> listaDomicilios = new ArrayList<DomicilioTemporal>();
    boolean domicilioCompleto = false;
    boolean datosCompletos = false;

    /**
     * Creates new form frmDatosGeneralesCliente
     */ 
    public frmDatosGeneralesCliente() {
        initComponents();
        
        JFormattedTextField ftfieldMeses = ((JSpinner.DefaultEditor)spnNoHijos.getEditor()).getTextField();
        ftfieldMeses.setEditable(false);
        
        actionListener = new RadioButtonActionListener(tbpDatosGeneralesCliente);
        actionListener2 = new RadioButtonActionListener(pnlNoHijos);
       
        pnlNoHijos.setVisible(false);
        tbpDatosGeneralesCliente.setEnabledAt(2, false);
        tbpDatosGeneralesCliente.setEnabledAt(3, false);
        tbpDatosGeneralesCliente.setEnabledAt(4, false);
        setEnableContainer(pnlTelefonoCelular, false);
        setEnableContainer(pnlTelefonoFijo, false);
        setEnableContainer(pnlTelefonoReferencia, false);
        
        rbtnCasado.addActionListener(actionListener);
        rbtnSoltero.addActionListener(actionListener);
        rbtnUnionLibre.addActionListener(actionListener);
        rbtnDivorciado.addActionListener(actionListener);
        rbtnViudo.addActionListener(actionListener);
        rbtnEmpleado.addActionListener(actionListener);
        rbtnNegocio.addActionListener(actionListener);
        rbtnAmbos.addActionListener(actionListener);   
        rbtnHijosSi.addActionListener(actionListener2);
             
        rbtnMasculino.setActionCommand("Masculino");
        rbtnFemenino.setActionCommand("Femenino");
        rbtnSoltero.setActionCommand("Soltero");
        rbtnCasado.setActionCommand("Casado");
        rbtnDivorciado.setActionCommand("Divorciado");
        rbtnUnionLibre.setActionCommand("Unión Libre");
        rbtnViudo.setActionCommand("Viudo");
        rbtnHijosSi.setActionCommand("Si");
        rbtnHijosNo.setActionCommand("No");
        rbtnEmpleado.setActionCommand("Empleado");
        rbtnNegocio.setActionCommand("Negocio");
        rbtnAmbos.setActionCommand("Ambos");
                     
        dtcFechaNacimiento.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try{                   
                    fechaChooser= ""+dt.format(dtcFechaNacimiento.getDate());
                    CalcularEdad(fechaChooser, lblEdad);
                    
                }catch(Exception e){
                    e.printStackTrace();
                } 
            }
        });
        
        
        dtcFechaNacimientoC.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            try{
                    fechaChooser= ""+dt.format(dtcFechaNacimientoC.getDate());
                    CalcularEdad(fechaChooser, lblEdadC);
                    
                }catch(Exception e){
                    e.printStackTrace();
                } 
            }
        });
        
        llenaCombosEstado();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGenero = new javax.swing.ButtonGroup();
        btnGroupEstadoCivil = new javax.swing.ButtonGroup();
        btnGroupRegimen = new javax.swing.ButtonGroup();
        btnGroupFuenteIngresos = new javax.swing.ButtonGroup();
        btnGroupFuenteIngresosCon = new javax.swing.ButtonGroup();
        btnGroupGeneroCon = new javax.swing.ButtonGroup();
        btnGroupHijos = new javax.swing.ButtonGroup();
        jSeparator13 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tbpDatosGeneralesCliente = new javax.swing.JTabbedPane();
        pnldatosperonales = new javax.swing.JPanel();
        pnlDatosPersonalesSolicitante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtSegundoNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbEntidadFederativa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dtcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        pnlEstadoCivil = new javax.swing.JPanel();
        rbtnSoltero = new javax.swing.JRadioButton();
        rbtnCasado = new javax.swing.JRadioButton();
        rbtnDivorciado = new javax.swing.JRadioButton();
        rbtnViudo = new javax.swing.JRadioButton();
        rbtnUnionLibre = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        rbtnHijosSi = new javax.swing.JRadioButton();
        rbtnHijosNo = new javax.swing.JRadioButton();
        pnlNoHijos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        spnNoHijos = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        rbtnEmpleado = new javax.swing.JRadioButton();
        rbtnNegocio = new javax.swing.JRadioButton();
        rbtnAmbos = new javax.swing.JRadioButton();
        spnNoDependientesEco = new javax.swing.JSpinner();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtIdOficial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbTipoId = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtCurp = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        txtRfc = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        cmbNoZona = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        pnlTelefonoCelular = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtLadaCelular = new javax.swing.JTextField();
        txtNoCelular = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        pnlTelefonoReferencia = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        txtLadaReferencia = new javax.swing.JTextField();
        txtNoReferencia = new javax.swing.JTextField();
        pnlTelefonoFijo = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        txtLadaFijo = new javax.swing.JTextField();
        txtNoFijo = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        chcbTelefonoCelular = new javax.swing.JCheckBox();
        chcbTelefonoFijo = new javax.swing.JCheckBox();
        chcbTelefonoReferencia = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDomicilio = new javax.swing.JTable();
        pnlDatosConyugue = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        rbtnSeparacionBienes = new javax.swing.JRadioButton();
        rbtnSociedadConyugal = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtApellidoPaternoC = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        txt2doNombreC = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        txtApellidoMaternoC = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblEdadC = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cmbEntidadFederativaCon = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        dtcFechaNacimientoC = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        rbtnEmpleadoC = new javax.swing.JRadioButton();
        rbtnNegocioC = new javax.swing.JRadioButton();
        btnAmbosC = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        rbtnFemeninoC = new javax.swing.JRadioButton();
        rbtnMasculinoC = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        txtCurpC = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        pnlInformacionLaboral = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        lblAños = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txtCalleEmpresa = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        txtCodigoPostalEmpresa = new javax.swing.JTextField();
        cmbEstadoEmpresa = new javax.swing.JComboBox<>();
        cmbCiudadEmpresa = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtNoExteriorEmpresa = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        txtNoInteriorEmpresa = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        cmbColoniaEmpresa = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        spnAñoAntiguedad = new javax.swing.JSpinner();
        spnMesAntiguedad = new javax.swing.JSpinner();
        lblMeses = new javax.swing.JLabel();
        pnlActividadEconomica = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        txtNombreNegocio = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jLabel62 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDettalleActividad = new javax.swing.JTextArea();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jPanel25 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        txtCalleEmpresa1 = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        txtCodigoPostalEmpresa1 = new javax.swing.JTextField();
        cmbEstadoNegocio = new javax.swing.JComboBox<>();
        cmbCiudadEmpresa1 = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtNoExteriorEmpresa1 = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        txtNoInteriorEmpresa1 = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        cmbColoniaEmpresa1 = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        txtTelefonoNegocio = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);

        tbpDatosGeneralesCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpDatosGeneralesClienteMouseClicked(evt);
            }
        });

        pnldatosperonales.setBackground(new java.awt.Color(255, 255, 255));
        pnldatosperonales.setMaximumSize(new java.awt.Dimension(64834, 64834));

        pnlDatosPersonalesSolicitante.setBackground(new java.awt.Color(255, 255, 255));
        pnlDatosPersonalesSolicitante.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Solicitante"));

        jLabel1.setText("Nombre´s");

        jLabel2.setText("Apellidos");

        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidoPaterno.setBorder(null);
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtSegundoNombre.setBorder(null);
        txtSegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundoNombreKeyTyped(evt);
            }
        });

        txtApellidoMaterno.setBorder(null);
        txtApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoActionPerformed(evt);
            }
        });
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Género"));

        rbtnFemenino.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGenero.add(rbtnFemenino);
        rbtnFemenino.setText("Femenino");

        rbtnMasculino.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGenero.add(rbtnMasculino);
        rbtnMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnFemenino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(rbtnMasculino)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnFemenino)
                    .addComponent(rbtnMasculino)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Fecha de Nacimiento");

        jLabel4.setText("Edad");

        lblEdad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("años");

        jLabel5.setText("Entidad Federativa de Nacimiento");

        jLabel7.setText("Nacionalidad");

        jLabel8.setText("Mexicana");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        dtcFechaNacimiento.setDateFormatString("d-MM-yyyy");
        dtcFechaNacimiento.setMaxSelectableDate(new java.util.Date(2524633270000L));
        dtcFechaNacimiento.setMinSelectableDate(new java.util.Date(-2208961334000L));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dtcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbEntidadFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(dtcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbEntidadFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Otros Datos"));

        pnlEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estado Civil"));

        rbtnSoltero.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoCivil.add(rbtnSoltero);
        rbtnSoltero.setSelected(true);
        rbtnSoltero.setText("Soltero");

        rbtnCasado.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoCivil.add(rbtnCasado);
        rbtnCasado.setText("Casado");
        rbtnCasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCasadoActionPerformed(evt);
            }
        });

        rbtnDivorciado.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoCivil.add(rbtnDivorciado);
        rbtnDivorciado.setText("Divorciado");

        rbtnViudo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoCivil.add(rbtnViudo);
        rbtnViudo.setText("Viudo");

        rbtnUnionLibre.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupEstadoCivil.add(rbtnUnionLibre);
        rbtnUnionLibre.setText("Unión Libre");

        javax.swing.GroupLayout pnlEstadoCivilLayout = new javax.swing.GroupLayout(pnlEstadoCivil);
        pnlEstadoCivil.setLayout(pnlEstadoCivilLayout);
        pnlEstadoCivilLayout.setHorizontalGroup(
            pnlEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnSoltero)
                    .addComponent(rbtnCasado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnViudo)
                    .addComponent(rbtnDivorciado))
                .addGap(60, 60, 60)
                .addComponent(rbtnUnionLibre)
                .addGap(33, 33, 33))
        );
        pnlEstadoCivilLayout.setVerticalGroup(
            pnlEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadoCivilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSoltero)
                    .addComponent(rbtnDivorciado)
                    .addComponent(rbtnUnionLibre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnCasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtnViudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "¿Tiene Hijos?"));

        rbtnHijosSi.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupHijos.add(rbtnHijosSi);
        rbtnHijosSi.setText("Si");
        rbtnHijosSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHijosSiActionPerformed(evt);
            }
        });

        rbtnHijosNo.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupHijos.add(rbtnHijosNo);
        rbtnHijosNo.setSelected(true);
        rbtnHijosNo.setText("No");
        rbtnHijosNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHijosNoActionPerformed(evt);
            }
        });

        pnlNoHijos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("No. Hijos");

        spnNoHijos.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));

        javax.swing.GroupLayout pnlNoHijosLayout = new javax.swing.GroupLayout(pnlNoHijos);
        pnlNoHijos.setLayout(pnlNoHijosLayout);
        pnlNoHijosLayout.setHorizontalGroup(
            pnlNoHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNoHijosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnNoHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnlNoHijosLayout.setVerticalGroup(
            pnlNoHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNoHijosLayout.createSequentialGroup()
                .addGroup(pnlNoHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(spnNoHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnHijosSi)
                .addGap(63, 63, 63)
                .addComponent(rbtnHijosNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlNoHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNoHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnHijosSi)
                        .addComponent(rbtnHijosNo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("No. Dependientes económicos");

        jLabel11.setText("Último grado de estudios");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Primaria", "Secundaria", "Preparatoria", "Carrera Técnica", "Carrera Trunca", "Licenciatura", "Maestria" }));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fuente de ingresos"));

        rbtnEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuenteIngresos.add(rbtnEmpleado);
        rbtnEmpleado.setText("Empleado");
        rbtnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEmpleadoActionPerformed(evt);
            }
        });

        rbtnNegocio.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuenteIngresos.add(rbtnNegocio);
        rbtnNegocio.setText("Negocio");

        rbtnAmbos.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuenteIngresos.add(rbtnAmbos);
        rbtnAmbos.setText("Ambos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(rbtnNegocio)
                .addGap(67, 67, 67)
                .addComponent(rbtnAmbos)
                .addGap(21, 21, 21))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnEmpleado)
                    .addComponent(rbtnNegocio)
                    .addComponent(rbtnAmbos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnNoDependientesEco.setModel(new javax.swing.SpinnerNumberModel(1, 0, 15, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(spnNoDependientesEco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNoDependientesEco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("No. Identificación Oficial");

        txtIdOficial.setBorder(null);

        jLabel15.setText("Tipo de idenficación");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("CURP");

        jLabel13.setText("RFC");

        jButton3.setText("Generar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtCurp.setBorder(null);
        txtCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpKeyTyped(evt);
            }
        });

        txtRfc.setBorder(null);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator28)
                    .addComponent(jSeparator27)
                    .addComponent(txtCurp)
                    .addComponent(txtRfc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(txtIdOficial)
                            .addComponent(cmbTipoId, 0, 220, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIdOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel18.setText("Número de Zona");

        cmbNoZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.." }));

        javax.swing.GroupLayout pnlDatosPersonalesSolicitanteLayout = new javax.swing.GroupLayout(pnlDatosPersonalesSolicitante);
        pnlDatosPersonalesSolicitante.setLayout(pnlDatosPersonalesSolicitanteLayout);
        pnlDatosPersonalesSolicitanteLayout.setHorizontalGroup(
            pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                                .addComponent(jSeparator3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(53, 53, 53)
                                .addComponent(cmbNoZona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDatosPersonalesSolicitanteLayout.setVerticalGroup(
            pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosPersonalesSolicitanteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosPersonalesSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(cmbNoZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout pnldatosperonalesLayout = new javax.swing.GroupLayout(pnldatosperonales);
        pnldatosperonales.setLayout(pnldatosperonalesLayout);
        pnldatosperonalesLayout.setHorizontalGroup(
            pnldatosperonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatosperonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosPersonalesSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnldatosperonalesLayout.setVerticalGroup(
            pnldatosperonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatosperonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosPersonalesSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbpDatosGeneralesCliente.addTab("Datos Personales", pnldatosperonales);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Comunicación"));

        pnlTelefonoCelular.setBackground(new java.awt.Color(255, 255, 255));
        pnlTelefonoCelular.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel34.setText("Lada");

        jLabel35.setText("Número");

        txtLadaCelular.setBorder(null);
        txtLadaCelular.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtLadaCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadaCelularKeyTyped(evt);
            }
        });

        txtNoCelular.setBorder(null);
        txtNoCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCelularKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTelefonoCelularLayout = new javax.swing.GroupLayout(pnlTelefonoCelular);
        pnlTelefonoCelular.setLayout(pnlTelefonoCelularLayout);
        pnlTelefonoCelularLayout.setHorizontalGroup(
            pnlTelefonoCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoCelularLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonoCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTelefonoCelularLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(txtLadaCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(pnlTelefonoCelularLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTelefonoCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jSeparator14)
                            .addComponent(txtNoCelular))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlTelefonoCelularLayout.setVerticalGroup(
            pnlTelefonoCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoCelularLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlTelefonoCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtLadaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTelefonoCelularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtNoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTelefonoReferencia.setBackground(new java.awt.Color(255, 255, 255));
        pnlTelefonoReferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setText("Lada");

        jLabel44.setText("Número");

        txtLadaReferencia.setBorder(null);
        txtLadaReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadaReferenciaKeyTyped(evt);
            }
        });

        txtNoReferencia.setBorder(null);
        txtNoReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoReferenciaActionPerformed(evt);
            }
        });
        txtNoReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoReferenciaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTelefonoReferenciaLayout = new javax.swing.GroupLayout(pnlTelefonoReferencia);
        pnlTelefonoReferencia.setLayout(pnlTelefonoReferenciaLayout);
        pnlTelefonoReferenciaLayout.setHorizontalGroup(
            pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelefonoReferenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelefonoReferenciaLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(txtLadaReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTelefonoReferenciaLayout.createSequentialGroup()
                            .addComponent(jLabel44)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlTelefonoReferenciaLayout.setVerticalGroup(
            pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoReferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLadaReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(4, 4, 4)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTelefonoReferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTelefonoFijo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTelefonoFijo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setText("Lada");

        jLabel42.setText("Número");

        txtLadaFijo.setBorder(null);
        txtLadaFijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadaFijoKeyTyped(evt);
            }
        });

        txtNoFijo.setBorder(null);
        txtNoFijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoFijoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTelefonoFijoLayout = new javax.swing.GroupLayout(pnlTelefonoFijo);
        pnlTelefonoFijo.setLayout(pnlTelefonoFijoLayout);
        pnlTelefonoFijoLayout.setHorizontalGroup(
            pnlTelefonoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoFijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(pnlTelefonoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLadaFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlTelefonoFijoLayout.setVerticalGroup(
            pnlTelefonoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoFijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTelefonoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLadaFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(1, 1, 1)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTelefonoFijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTelefonoFijoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelefonoFijoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel40.setText("Correo electrónico");

        jTextField14.setBorder(null);

        chcbTelefonoCelular.setBackground(new java.awt.Color(255, 255, 255));
        chcbTelefonoCelular.setText("Teléfono Celular");
        chcbTelefonoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcbTelefonoCelularActionPerformed(evt);
            }
        });
        chcbTelefonoCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chcbTelefonoCelularKeyPressed(evt);
            }
        });

        chcbTelefonoFijo.setBackground(new java.awt.Color(255, 255, 255));
        chcbTelefonoFijo.setText("Teléfono fijo");
        chcbTelefonoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcbTelefonoFijoActionPerformed(evt);
            }
        });

        chcbTelefonoReferencia.setBackground(new java.awt.Color(255, 255, 255));
        chcbTelefonoReferencia.setText("Teléfono de referencia");
        chcbTelefonoReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcbTelefonoReferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chcbTelefonoCelular))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chcbTelefonoFijo))
                            .addComponent(pnlTelefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chcbTelefonoReferencia)
                            .addComponent(pnlTelefonoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator12)
                            .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                        .addGap(0, 306, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTelefonoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(pnlTelefonoFijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chcbTelefonoCelular)
                            .addComponent(chcbTelefonoReferencia)
                            .addComponent(chcbTelefonoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlTelefonoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Domiclio"));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Modify.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Create.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblDomicilio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDomicilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDomicilioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDomicilio);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar)
                .addGap(8, 8, 8))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        tbpDatosGeneralesCliente.addTab("Datos de contacto", jPanel11);

        pnlDatosConyugue.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Régimen"));

        rbtnSeparacionBienes.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupRegimen.add(rbtnSeparacionBienes);
        rbtnSeparacionBienes.setText("Separación de bienes");

        rbtnSociedadConyugal.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupRegimen.add(rbtnSociedadConyugal);
        rbtnSociedadConyugal.setText("Sociedad conyugal");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnSeparacionBienes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnSociedadConyugal)
                .addGap(52, 52, 52))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSeparacionBienes)
                    .addComponent(rbtnSociedadConyugal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel36.setText("Nombre´s");

        jLabel37.setText("Apellidos");

        txtNombreC.setBorder(null);

        txtApellidoPaternoC.setBorder(null);

        txt2doNombreC.setBorder(null);

        txtApellidoMaternoC.setBorder(null);
        txtApellidoMaternoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoCActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel38.setText("Fecha de Nacimiento");

        jLabel39.setText("Edad");

        lblEdadC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel45.setText("años");

        jLabel46.setText("Entidad Federativa de Nacimiento");

        jLabel47.setText("Nacionalidad");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mexicana", "Otro.." }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtcFechaNacimientoC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbEntidadFederativaCon, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)
                                .addComponent(lblEdadC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(dtcFechaNacimientoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(lblEdadC, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(cmbEntidadFederativaCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel39))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fuente de ingresos"));

        rbtnEmpleadoC.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuenteIngresosCon.add(rbtnEmpleadoC);
        rbtnEmpleadoC.setText("Empleado");

        rbtnNegocioC.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuenteIngresosCon.add(rbtnNegocioC);
        rbtnNegocioC.setText("Negocio");

        btnAmbosC.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupFuenteIngresosCon.add(btnAmbosC);
        btnAmbosC.setText("Ambos");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnEmpleadoC)
                .addGap(73, 73, 73)
                .addComponent(rbtnNegocioC)
                .addGap(45, 45, 45)
                .addComponent(btnAmbosC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnEmpleadoC)
                    .addComponent(rbtnNegocioC)
                    .addComponent(btnAmbosC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Género"));

        rbtnFemeninoC.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeneroCon.add(rbtnFemeninoC);
        rbtnFemeninoC.setText("Femenino");

        rbtnMasculinoC.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeneroCon.add(rbtnMasculinoC);
        rbtnMasculinoC.setText("Masculino");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnFemeninoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnMasculinoC)
                .addGap(89, 89, 89))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnFemeninoC)
                    .addComponent(rbtnMasculinoC)))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CURP"));

        jButton4.setText("Generar");

        txtCurpC.setBorder(null);
        txtCurpC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator26)
                    .addComponent(txtCurpC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurpC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout pnlDatosConyugueLayout = new javax.swing.GroupLayout(pnlDatosConyugue);
        pnlDatosConyugue.setLayout(pnlDatosConyugueLayout);
        pnlDatosConyugueLayout.setHorizontalGroup(
            pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                                .addComponent(jSeparator20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                                .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2doNombreC))))
                    .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                                .addComponent(txtApellidoPaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoMaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        pnlDatosConyugueLayout.setVerticalGroup(
            pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosConyugueLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2doNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator22)
                            .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtApellidoPaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoMaternoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosConyugueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        tbpDatosGeneralesCliente.addTab("Datos del Cónyugue / Pareja", pnlDatosConyugue);

        pnlInformacionLaboral.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Empresa donde labora");

        txtNombreEmpresa.setBorder(null);

        jLabel17.setText("Puesto");

        txtPuesto.setBorder(null);

        jLabel26.setText("Antigüedad");

        lblAños.setText("años");

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Domicilio de la empresa"));

        jLabel50.setText("Calle");

        txtCalleEmpresa.setBorder(null);

        txtCodigoPostalEmpresa.setBorder(null);

        cmbEstadoEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        cmbCiudadEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cmbCiudadEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadEmpresaActionPerformed(evt);
            }
        });
        cmbCiudadEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCiudadEmpresaKeyPressed(evt);
            }
        });

        jLabel54.setText("Ciudad o municipio");

        jLabel55.setText("Estado");

        jLabel56.setText("Código Postal");

        jLabel57.setText("Colonia");

        jLabel58.setText("No. Exterior");

        txtNoExteriorEmpresa.setBorder(null);
        txtNoExteriorEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoExteriorEmpresaKeyTyped(evt);
            }
        });

        jLabel59.setText("No. Interior");

        txtNoInteriorEmpresa.setBorder(null);
        txtNoInteriorEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoInteriorEmpresaKeyTyped(evt);
            }
        });

        cmbColoniaEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoPostalEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                            .addComponent(jLabel50)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator31)
                                .addComponent(txtCalleEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel24Layout.createSequentialGroup()
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel54)
                                        .addComponent(jLabel55)
                                        .addComponent(jLabel57))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbCiudadEmpresa, 0, 224, Short.MAX_VALUE)
                                        .addComponent(cmbEstadoEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbColoniaEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(41, 41, 41)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator36)
                            .addComponent(txtNoInteriorEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoExteriorEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtCalleEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(txtNoInteriorEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoExteriorEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoPostalEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbEstadoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudadEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(cmbColoniaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel51.setText("Giro de la empresa");

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.." }));

        jLabel52.setText("Teléfono");

        txtTelefonoEmpresa.setBorder(null);
        txtTelefonoEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpresaKeyTyped(evt);
            }
        });

        spnAñoAntiguedad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        spnAñoAntiguedad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAñoAntiguedadStateChanged(evt);
            }
        });

        spnMesAntiguedad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spnMesAntiguedad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMesAntiguedadStateChanged(evt);
            }
        });

        lblMeses.setText("meses");

        javax.swing.GroupLayout pnlInformacionLaboralLayout = new javax.swing.GroupLayout(pnlInformacionLaboral);
        pnlInformacionLaboral.setLayout(pnlInformacionLaboralLayout);
        pnlInformacionLaboralLayout.setHorizontalGroup(
            pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLaboralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInformacionLaboralLayout.createSequentialGroup()
                        .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator30, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jSeparator29)
                                .addComponent(txtNombreEmpresa)
                                .addComponent(txtPuesto))
                            .addGroup(pnlInformacionLaboralLayout.createSequentialGroup()
                                .addComponent(spnAñoAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAños)
                                .addGap(18, 18, 18)
                                .addComponent(spnMesAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator33, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        pnlInformacionLaboralLayout.setVerticalGroup(
            pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLaboralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(spnAñoAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAños))
                    .addGroup(pnlInformacionLaboralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnMesAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMeses))
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        tbpDatosGeneralesCliente.addTab("Informacion Laboral", pnlInformacionLaboral);

        pnlActividadEconomica.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setText("Nombre del negocio");

        jLabel60.setText("Estatus del Negocio");

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione.." }));

        jLabel61.setText("Giro");

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        txtNombreNegocio.setBorder(null);

        jLabel62.setText("Tipo de Actividad");

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        txaDettalleActividad.setColumns(20);
        txaDettalleActividad.setRows(5);
        jScrollPane1.setViewportView(txaDettalleActividad);

        jLabel63.setText("Detalle de la Actividad");

        jLabel64.setText("Estatus de las instalaciones");

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Domicilio del Negocio"));

        jLabel65.setText("Calle");

        txtCalleEmpresa1.setBorder(null);

        txtCodigoPostalEmpresa1.setBorder(null);

        cmbEstadoNegocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        cmbCiudadEmpresa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        jLabel66.setText("Ciudad o municipio");

        jLabel67.setText("Estado");

        jLabel68.setText("Código Postal");

        jLabel69.setText("Colonia");

        jLabel70.setText("No. Exterior");

        txtNoExteriorEmpresa1.setBorder(null);
        txtNoExteriorEmpresa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoExteriorEmpresa1KeyTyped(evt);
            }
        });

        jLabel71.setText("No. Interior");

        txtNoInteriorEmpresa1.setBorder(null);
        txtNoInteriorEmpresa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoInteriorEmpresa1KeyTyped(evt);
            }
        });

        cmbColoniaEmpresa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoPostalEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(jLabel65)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator38)
                                .addComponent(txtCalleEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel66)
                                        .addComponent(jLabel67)
                                        .addComponent(jLabel69))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbCiudadEmpresa1, 0, 224, Short.MAX_VALUE)
                                        .addComponent(cmbEstadoNegocio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbColoniaEmpresa1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(41, 41, 41)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel71)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator41)
                            .addComponent(txtNoInteriorEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoExteriorEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtCalleEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(txtNoInteriorEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoExteriorEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoPostalEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbEstadoNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudadEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(cmbColoniaEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel72.setText("Teléfono");

        txtTelefonoNegocio.setBorder(null);
        txtTelefonoNegocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoNegocioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlActividadEconomicaLayout = new javax.swing.GroupLayout(pnlActividadEconomica);
        pnlActividadEconomica.setLayout(pnlActividadEconomicaLayout);
        pnlActividadEconomicaLayout.setHorizontalGroup(
            pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                                .addComponent(txtTelefonoNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlActividadEconomicaLayout.createSequentialGroup()
                                    .addComponent(jLabel64)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlActividadEconomicaLayout.createSequentialGroup()
                                    .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel60)
                                        .addComponent(jLabel61)
                                        .addComponent(jLabel62))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox16, 0, 200, Short.MAX_VALUE)
                                        .addComponent(jComboBox17, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
        );
        pnlActividadEconomicaLayout.setVerticalGroup(
            pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActividadEconomicaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtNombreNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlActividadEconomicaLayout.createSequentialGroup()
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlActividadEconomicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(txtTelefonoNegocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        tbpDatosGeneralesCliente.addTab("Actividad Económica", pnlActividadEconomica);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Apply.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Erase.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpDatosGeneralesCliente)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpDatosGeneralesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoActionPerformed

   
    private void txtApellidoMaternoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMaternoCActionPerformed

    private void txtCurpCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpCActionPerformed

    private void chcbTelefonoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcbTelefonoCelularActionPerformed
        // TODO add your handling code here:
        if(chcbTelefonoCelular.isSelected()){
            setEnableContainer(pnlTelefonoCelular, true);
        }else{
            setEnableContainer(pnlTelefonoCelular, false);
        }
        
    }//GEN-LAST:event_chcbTelefonoCelularActionPerformed

    private void rbtnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEmpleadoActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_rbtnEmpleadoActionPerformed

    private void rbtnHijosSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHijosSiActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_rbtnHijosSiActionPerformed

    private void rbtnCasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCasadoActionPerformed
        // TODO add your handling code here:
       // tbpDatosGeneralesCliente.setEnabledAt(2, true);
    }//GEN-LAST:event_rbtnCasadoActionPerformed

    private void txtLadaCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadaCelularKeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9' || txtLadaCelular.getText().length()== 3) evt.consume();
    }//GEN-LAST:event_txtLadaCelularKeyTyped

    private void txtNoCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCelularKeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9' || txtNoCelular.getText().length() ==  10) evt.consume();
    }//GEN-LAST:event_txtNoCelularKeyTyped

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        validarCampoLetras = evt.getKeyChar();
        if ((validarCampoLetras < 'A' || validarCampoLetras > 'Z') && (validarCampoLetras < 'a' || validarCampoLetras > 'z') ) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtSegundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundoNombreKeyTyped
        // TODO add your handling code here:
        validarCampoLetras = evt.getKeyChar();
        if ((validarCampoLetras < 'A' || validarCampoLetras > 'Z') && (validarCampoLetras < 'a' || validarCampoLetras > 'z') ) evt.consume();
    }//GEN-LAST:event_txtSegundoNombreKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        // TODO add your handling code here:
       validarCampoLetras = evt.getKeyChar();
        if ((validarCampoLetras < 'A' || validarCampoLetras > 'Z') && (validarCampoLetras < 'a' || validarCampoLetras > 'z') ) evt.consume();
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        // TODO add your handling code here:
        validarCampoLetras = evt.getKeyChar();
        if ((validarCampoLetras < 'A' || validarCampoLetras > 'Z') && (validarCampoLetras < 'a' || validarCampoLetras > 'z') ) evt.consume();
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtCurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpKeyTyped

    private void rbtnHijosNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHijosNoActionPerformed
        // TODO add your handling code here:
        pnlNoHijos.hide();
    }//GEN-LAST:event_rbtnHijosNoActionPerformed

    private void chcbTelefonoCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chcbTelefonoCelularKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_chcbTelefonoCelularKeyPressed

    private void chcbTelefonoReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcbTelefonoReferenciaActionPerformed
        // TODO add your handling code here:
        if(chcbTelefonoReferencia.isSelected()){
            setEnableContainer(pnlTelefonoReferencia, true);
        }else{
            setEnableContainer(pnlTelefonoReferencia, false);
        }
    }//GEN-LAST:event_chcbTelefonoReferenciaActionPerformed

    private void chcbTelefonoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcbTelefonoFijoActionPerformed
        // TODO add your handling code here:
        if(chcbTelefonoFijo.isSelected()){
            setEnableContainer(pnlTelefonoFijo, true);
        }else{
            setEnableContainer(pnlTelefonoFijo, false);
        }
    }//GEN-LAST:event_chcbTelefonoFijoActionPerformed

    private void txtNoExteriorEmpresa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoExteriorEmpresa1KeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9') evt.consume();
    }//GEN-LAST:event_txtNoExteriorEmpresa1KeyTyped

    private void txtNoInteriorEmpresa1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoInteriorEmpresa1KeyTyped
        // TODO add your handling code here:
         validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9') evt.consume();
    }//GEN-LAST:event_txtNoInteriorEmpresa1KeyTyped

    private void txtTelefonoNegocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoNegocioKeyTyped
        // TODO add your handling code here:
         validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9') evt.consume();
    }//GEN-LAST:event_txtTelefonoNegocioKeyTyped

    private void txtTelefonoEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpresaKeyTyped
        // TODO add your handling code here:
         validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9') evt.consume();
    }//GEN-LAST:event_txtTelefonoEmpresaKeyTyped

    private void txtNoExteriorEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoExteriorEmpresaKeyTyped
        // TODO add your handling code here:
         validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9') evt.consume();
    }//GEN-LAST:event_txtNoExteriorEmpresaKeyTyped

    private void txtNoInteriorEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoInteriorEmpresaKeyTyped
        // TODO add your handling code here:
         validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9') evt.consume();
    }//GEN-LAST:event_txtNoInteriorEmpresaKeyTyped

    private void txtNoReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoReferenciaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       if(validaDatosContacto()) {

       }else{
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void spnAñoAntiguedadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAñoAntiguedadStateChanged
        // TODO add your handling code here:
        if(spnAñoAntiguedad.getValue().equals(1)){
            lblAños.setText("año");
        }else{
            lblAños.setText("años");
        }
    }//GEN-LAST:event_spnAñoAntiguedadStateChanged

    private void spnMesAntiguedadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMesAntiguedadStateChanged
        // TODO add your handling code here:
        if(spnMesAntiguedad.getValue().equals(1)){
            lblMeses.setText("mes");
        }else{
            lblMeses.setText("meses");
        }
    }//GEN-LAST:event_spnMesAntiguedadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Frame f=JOptionPane.getFrameForComponent(this);
        frmDomicilio dialogoDomicilio=new frmDomicilio(f, true);
        Dimension desktopSize = this.getParent().getSize();
        Dimension FrameSize = dialogoDomicilio.getSize();
        dialogoDomicilio.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        dialogoDomicilio.setVisible(true);
        
        if(dialogoDomicilio.isPulsoOK()){  
            auxDom = dialogoDomicilio.obtenerCamposDomicilio();
            listaDomicilios.add(auxDom);
           
            llenaTablaDomicilios(listaDomicilios);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Frame f=JOptionPane.getFrameForComponent(this);
        frmDomicilio dialogoDomicilio=new frmDomicilio(f, true);
        if(tblDomicilio.getSelectedRows().length>0){
            dialogoDomicilio.llenaCampos(listaDomicilios, tblDomicilio.getSelectedRow());
            Dimension desktopSize = this.getParent().getSize();
            Dimension FrameSize = dialogoDomicilio.getSize();
            dialogoDomicilio.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
            dialogoDomicilio.setVisible(true); 
        }
        else{
            if(listaDomicilios.size()>0){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un domicilio");
            }else{
                JOptionPane.showMessageDialog(null,"No hay registros por editar, por favor registre uno");
            }
            
        }
         
        if(dialogoDomicilio.isPulsoOK()){  
            auxDom = dialogoDomicilio.obtenerCamposDomicilio();
            listaDomicilios.set(tblDomicilio.getSelectedRow(), auxDom);
           
            llenaTablaDomicilios(listaDomicilios);
        JOptionPane.showMessageDialog(null,"Click");
        
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbCiudadEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadEmpresaActionPerformed

    private void cmbCiudadEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCiudadEmpresaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadEmpresaKeyPressed

    private void tblDomicilioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDomicilioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDomicilioMouseClicked

    private void tbpDatosGeneralesClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpDatosGeneralesClienteMouseClicked
        // TODO add your handling code here:     
        int noPestania = tbpDatosGeneralesCliente.getSelectedIndex();
        switch (noPestania){
            case 1 : 
                if(!validaDatosCliente()){
                    JOptionPane.showMessageDialog(null, "Por favor verifique los datos del cliente", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    tbpDatosGeneralesCliente.setSelectedIndex(0);
                }else{     
                }
                break;
            case 2:
                if(!validaDatosContacto()){
                    JOptionPane.showMessageDialog(null, "Por favor verifique los datos de domicilio", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    tbpDatosGeneralesCliente.setSelectedIndex(1);
                }
                break;
        }
        
    }//GEN-LAST:event_tbpDatosGeneralesClienteMouseClicked

    private void txtLadaFijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadaFijoKeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9' || txtLadaFijo.getText().length() ==  3) evt.consume();
    }//GEN-LAST:event_txtLadaFijoKeyTyped

    private void txtNoFijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoFijoKeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9' || txtNoFijo.getText().length() ==  10) evt.consume();
    }//GEN-LAST:event_txtNoFijoKeyTyped

    private void txtLadaReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadaReferenciaKeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9' || txtLadaReferencia.getText().length() ==  3) evt.consume();
    }//GEN-LAST:event_txtLadaReferenciaKeyTyped

    private void txtNoReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoReferenciaKeyTyped
        // TODO add your handling code here:
        validarCampoNumerico = evt.getKeyChar();
        if (validarCampoNumerico < '0' || validarCampoNumerico > '9' || txtNoReferencia.getText().length() ==  10) evt.consume();
    }//GEN-LAST:event_txtNoReferenciaKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CalcularCurp();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void setEnableContainer(Container c, boolean band) {

    Component [] components = c.getComponents();
    c.setEnabled(band);
    for(int i = 0; i < components.length; i++) {
        components[i].setEnabled(band);

        if(components[i] instanceof Container) {
            setEnableContainer((Container)components[i], band);
        }
    }
    
}
    public void llenaTablaDomicilios(ArrayList<DomicilioTemporal>auxLista){
        try{       
            String[] titulos={"Código","Descripción","Calle"};
            DefaultTableModel entidades=new DefaultTableModel(null, titulos){
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
                }};
            
            String matriz[][] = new String [listaDomicilios.size()][3];
            for (int i=0; i<auxLista.size();i++){
            
                matriz[i][0]=auxLista.get(i).getDescripcion().toString();
                matriz[i][1]=auxLista.get(i).getCalle();
                matriz[i][2]=auxLista.get(i).getCalleRef1();
                entidades.addRow(matriz[i]);
            }              
                tblDomicilio.setModel(entidades);
                tblDomicilio.setAutoCreateColumnsFromModel(true);
                JTableColumnsWidth.setWidth(tblDomicilio,611,6,30,64 );  
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
         
    public void llenaCombosEstado(){
        try{
            Logica oLogica=new Logica();
            ResultSet ent=oLogica.Entidades();
            while(ent.next()){
                cmbEntidadFederativa.addItem(ent.getString(2));
                cmbEntidadFederativaCon.addItem(ent.getString(2));
                cmbEstadoEmpresa.addItem(ent.getString(2));
                cmbEstadoNegocio.addItem(ent.getString(2));
            }
            
        }
        catch(Exception e){
              e.printStackTrace();
        }
       
    }
    
    public boolean validaDatosContacto(){
        if(listaDomicilios.size()>=1 && (chcbTelefonoCelular.isSelected() && !txtNoCelular.getText().isEmpty()) || (chcbTelefonoFijo.isSelected() && !txtNoFijo.getText().isEmpty())){
            domicilioCompleto = true;
            
        }else{
           // JOptionPane.showMessageDialog(null,"Verifique los datos, al menos un domicilio y un número de teléfono debe ingresarse");
            
                if(listaDomicilios.size()>=1){
                   
                    if(chcbTelefonoCelular.isSelected() && txtNoCelular.getText().isEmpty()){
                   
                        JOptionPane.showMessageDialog(null,"Ingrese un número de teléfono celular");
                        
                    }else{
                    
                    if(chcbTelefonoFijo.isSelected() && txtNoFijo.getText().isEmpty()){

                        JOptionPane.showMessageDialog(null,"Ingrese un número de teléfono fijo");
                    }else{
                    
                    if(chcbTelefonoReferencia.isSelected() && txtNoReferencia.getText().isEmpty()) {
                    
                        JOptionPane.showMessageDialog(null,"Ingrese un número de teléfono de referencia");    
                    }
                    }
                }
         }else{
                    
            JOptionPane.showMessageDialog(null,"Verifique los datos de contacto");
        }
            
        }

        return domicilioCompleto;
    }
    
    public void obtenerDatosConyugue(){
        rbtnSeparacionBienes.setActionCommand("Separación de bienes");
        rbtnSociedadConyugal.setActionCommand("Sociedad conyugal");
        JOptionPane.showMessageDialog(null,"Dato radio"+btnGroupRegimen.getSelection().getActionCommand()); 
    }
    
    public boolean validaDatosCliente(){
       
        if(!txtNombre.getText().isEmpty() && !txtApellidoPaterno.getText().isEmpty() && btnGroupGenero.getSelection()!=null){
            datosCompletos = true;         
        }else{
            if(txtNombre.getText().isEmpty()){
                txtNombre.setToolTipText("Campo Obligatorio");
                txtNombre.setBorder(new LineBorder(Color.RED));
            }else{
             
            }
         //  JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return datosCompletos;
    }
    
    public void obtenerDatosCliente(){
        //        txtNombre.getText();
//        txtSegundoNombre.getText();
//        txtApellidoMaterno.getText();
//        txtApellidoPaterno.getText();
//        btnGroupGenero.getSelection().getActionCommand();
//        btnGroupEstadoCivil.getSelection().getActionCommand();
//        btnGroupHijos.getSelection().getActionCommand();
//        spnNoHijos.getValue();
//        btnGroupFuenteIngresos.getSelection().getActionCommand();
    }
    
    public void CalcularCurp(){
        fechaChooser= ""+dt.format(dtcFechaNacimiento.getDate());
        String diaa = ""+dia.format(dtcFechaNacimiento.getDate());
        String mess =""+ mes.format(dtcFechaNacimiento.getDate());
        String aniio = ""+ anio.format(dtcFechaNacimiento.getDate());
        //anio =""+ dt.format(dtcFechaNacimiento.getDate().getYear());
        rbtnMasculino.setActionCommand("Hombre");
        rbtnFemenino.setActionCommand("Mujer");
        Curp c = new Curp();
        c.getNombrecompleto(txtNombre.getText()+" "+txtSegundoNombre.getText(), txtApellidoPaterno.getText(), txtApellidoMaterno.getText());
        c.getFecha(diaa,mess,aniio);
        c.getEstado(cmbEntidadFederativa.getSelectedItem().toString());
        c.getSexo(btnGroupGenero.getSelection().getActionCommand());
        
        txtCurp.setText(c.curpGen());
        //JOptionPane.showMessageDialog(null,"CURP");
    }
          
    public void CalcularEdad(String FechaChooser, JLabel lblEdad){
        try{
       
        String fechaChooser = FechaChooser;
        LocalDate FechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.parse(fechaChooser);
        Period periodo = Period.between(fechaNacimiento, FechaActual);
        if (periodo.getYears()<= 18){
            //JOptionPane.showMessageDialog(null,"No puede solicitar credito");
        }else{
            lblEdad.setText(""+periodo.getYears());
        }
        
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JRadioButton btnAmbosC;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup btnGroupEstadoCivil;
    private javax.swing.ButtonGroup btnGroupFuenteIngresos;
    private javax.swing.ButtonGroup btnGroupFuenteIngresosCon;
    private javax.swing.ButtonGroup btnGroupGenero;
    private javax.swing.ButtonGroup btnGroupGeneroCon;
    private javax.swing.ButtonGroup btnGroupHijos;
    private javax.swing.ButtonGroup btnGroupRegimen;
    private javax.swing.JCheckBox chcbTelefonoCelular;
    private javax.swing.JCheckBox chcbTelefonoFijo;
    private javax.swing.JCheckBox chcbTelefonoReferencia;
    private javax.swing.JComboBox<String> cmbCiudadEmpresa;
    private javax.swing.JComboBox<String> cmbCiudadEmpresa1;
    private javax.swing.JComboBox<String> cmbColoniaEmpresa;
    private javax.swing.JComboBox<String> cmbColoniaEmpresa1;
    private javax.swing.JComboBox<String> cmbEntidadFederativa;
    private javax.swing.JComboBox<String> cmbEntidadFederativaCon;
    private javax.swing.JComboBox<String> cmbEstadoEmpresa;
    private javax.swing.JComboBox<String> cmbEstadoNegocio;
    private javax.swing.JComboBox<String> cmbNoZona;
    private javax.swing.JComboBox<String> cmbTipoId;
    private com.toedter.calendar.JDateChooser dtcFechaNacimiento;
    private com.toedter.calendar.JDateChooser dtcFechaNacimientoC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JLabel lblAños;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdadC;
    private javax.swing.JLabel lblMeses;
    private javax.swing.JPanel pnlActividadEconomica;
    private javax.swing.JPanel pnlDatosConyugue;
    private javax.swing.JPanel pnlDatosPersonalesSolicitante;
    private javax.swing.JPanel pnlEstadoCivil;
    private javax.swing.JPanel pnlInformacionLaboral;
    private javax.swing.JPanel pnlNoHijos;
    private javax.swing.JPanel pnlTelefonoCelular;
    private javax.swing.JPanel pnlTelefonoFijo;
    private javax.swing.JPanel pnlTelefonoReferencia;
    private javax.swing.JPanel pnldatosperonales;
    private javax.swing.JRadioButton rbtnAmbos;
    private javax.swing.JRadioButton rbtnCasado;
    private javax.swing.JRadioButton rbtnDivorciado;
    private javax.swing.JRadioButton rbtnEmpleado;
    private javax.swing.JRadioButton rbtnEmpleadoC;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnFemeninoC;
    private javax.swing.JRadioButton rbtnHijosNo;
    private javax.swing.JRadioButton rbtnHijosSi;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JRadioButton rbtnMasculinoC;
    private javax.swing.JRadioButton rbtnNegocio;
    private javax.swing.JRadioButton rbtnNegocioC;
    private javax.swing.JRadioButton rbtnSeparacionBienes;
    private javax.swing.JRadioButton rbtnSociedadConyugal;
    private javax.swing.JRadioButton rbtnSoltero;
    private javax.swing.JRadioButton rbtnUnionLibre;
    private javax.swing.JRadioButton rbtnViudo;
    private javax.swing.JSpinner spnAñoAntiguedad;
    private javax.swing.JSpinner spnMesAntiguedad;
    private javax.swing.JSpinner spnNoDependientesEco;
    private javax.swing.JSpinner spnNoHijos;
    private javax.swing.JTable tblDomicilio;
    private javax.swing.JTabbedPane tbpDatosGeneralesCliente;
    private javax.swing.JTextArea txaDettalleActividad;
    private javax.swing.JTextField txt2doNombreC;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoMaternoC;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtApellidoPaternoC;
    private javax.swing.JTextField txtCalleEmpresa;
    private javax.swing.JTextField txtCalleEmpresa1;
    private javax.swing.JTextField txtCodigoPostalEmpresa;
    private javax.swing.JTextField txtCodigoPostalEmpresa1;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtCurpC;
    private javax.swing.JTextField txtIdOficial;
    private javax.swing.JTextField txtLadaCelular;
    private javax.swing.JTextField txtLadaFijo;
    private javax.swing.JTextField txtLadaReferencia;
    private javax.swing.JTextField txtNoCelular;
    private javax.swing.JTextField txtNoExteriorEmpresa;
    private javax.swing.JTextField txtNoExteriorEmpresa1;
    private javax.swing.JTextField txtNoFijo;
    private javax.swing.JTextField txtNoInteriorEmpresa;
    private javax.swing.JTextField txtNoInteriorEmpresa1;
    private javax.swing.JTextField txtNoReferencia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreNegocio;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTelefonoNegocio;
    // End of variables declaration//GEN-END:variables
}
