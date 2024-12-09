/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control_mante;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexanderordonez
 */
public class Panta_inicial extends javax.swing.JFrame {

    /**
     * Creates new form Panta_inicial
     */
    public Panta_inicial() {
        initComponents();
    }

    //variables globales
    static ArrayList <Usuario> users = new ArrayList <Usuario>();
    static ArrayList <Maquina> maquinas = new ArrayList <Maquina>();
    static ArrayList <Tarea> tareas = new ArrayList <Tarea>();
   
    static Usuario currentUser;
    
    static Usuario admins = new Usuario("Alexander","Ordonez","0613199900105","97922697","alexander.ord99@gmail.com","Alexandrr","0613","");
    
    static String[] columnas = {"Nombre", "Categoria", "Voltaje","Motor","Codigo","Estado"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
    static String[] columnas2 = {"Nombre", "Tipo", "Maquina","Fecha","Estado","Responsable"};
        DefaultTableModel modeloTareas = new DefaultTableModel(columnas2, 0);    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vCrearUsuario = new javax.swing.JDialog();
        backgroud1 = new javax.swing.JPanel();
        backgroundSeconColor1 = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Logo1 = new javax.swing.JLabel();
        volverCrearUser_btn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        nombreLabel = new javax.swing.JLabel();
        crearNombreInput = new javax.swing.JTextField();
        apellidoLabel = new javax.swing.JLabel();
        crearApellidoInput = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        crearIdInput = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        crearTelefonoInput = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        crearCorreoInput = new javax.swing.JTextField();
        newUserLabel = new javax.swing.JLabel();
        crearUserInput = new javax.swing.JTextField();
        newPassLabel = new javax.swing.JLabel();
        crearPasswordInput = new javax.swing.JTextField();
        cargoLabel = new javax.swing.JLabel();
        crearCargoInput = new javax.swing.JTextField();
        crearUser_btn = new javax.swing.JButton();
        vMenuPrincipal = new javax.swing.JFrame();
        backgroud2 = new javax.swing.JPanel();
        backgroundSeconColor2 = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        Logo2 = new javax.swing.JLabel();
        bienvendoUser = new javax.swing.JLabel();
        cerrarSesion_MP_btn = new javax.swing.JButton();
        maquinas_btn = new javax.swing.JPanel();
        maquinaLabel = new javax.swing.JLabel();
        tareas_btn = new javax.swing.JPanel();
        tareasLabel = new javax.swing.JLabel();
        editUser_btn = new javax.swing.JPanel();
        editUserLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vMaquinas = new javax.swing.JFrame();
        backgroud3 = new javax.swing.JPanel();
        backgroundSeconColor3 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        Logo3 = new javax.swing.JLabel();
        Volver_MP_btn2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaquinas = new javax.swing.JTable();
        crearMaquina_btn = new javax.swing.JButton();
        modificarMaquina_btn = new javax.swing.JButton();
        eliminarMaquina_btn = new javax.swing.JButton();
        vTareas = new javax.swing.JFrame();
        backgroud10 = new javax.swing.JPanel();
        backgroundSeconColor10 = new javax.swing.JPanel();
        Titulo10 = new javax.swing.JLabel();
        Logo10 = new javax.swing.JLabel();
        Volver_MP_btn = new javax.swing.JButton();
        crearTarea_btn = new javax.swing.JButton();
        editarTarea_btn = new javax.swing.JButton();
        eliminarTarea_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();
        vCrearMaquina = new javax.swing.JDialog();
        backgroud11 = new javax.swing.JPanel();
        backgroundSeconColor11 = new javax.swing.JPanel();
        Titulo11 = new javax.swing.JLabel();
        Logo11 = new javax.swing.JLabel();
        volverCrearMaquina_maquina_btn = new javax.swing.JButton();
        nombreLabel1 = new javax.swing.JLabel();
        crearNombreMaquinaInput = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        crearCategoriaMaquinaInput = new javax.swing.JTextField();
        voltajeLabel = new javax.swing.JLabel();
        crearVoltajeMaquinaInput = new javax.swing.JTextField();
        motorLabel = new javax.swing.JLabel();
        crearMotorInput = new javax.swing.JTextField();
        cargoLabel1 = new javax.swing.JLabel();
        crearNewMaquina_btn = new javax.swing.JButton();
        codigoMaquina = new javax.swing.JLabel();
        vEliminarMaquina = new javax.swing.JDialog();
        backgroud12 = new javax.swing.JPanel();
        backgroundSeconColor12 = new javax.swing.JPanel();
        Titulo12 = new javax.swing.JLabel();
        Logo12 = new javax.swing.JLabel();
        volverEliminarMaquina_maquina_btn = new javax.swing.JButton();
        nombreLabel2 = new javax.swing.JLabel();
        eliminarMaquinabtn = new javax.swing.JButton();
        eliminarMaquinaDropDown = new javax.swing.JComboBox<>();
        vCrearTarea = new javax.swing.JDialog();
        backgroud13 = new javax.swing.JPanel();
        backgroundSeconColor13 = new javax.swing.JPanel();
        Titulo13 = new javax.swing.JLabel();
        Logo13 = new javax.swing.JLabel();
        volverCrearTarea_tarea_btn = new javax.swing.JButton();
        nombreLabel3 = new javax.swing.JLabel();
        crearNombreTareaInput = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        crearTipoTareaInput = new javax.swing.JTextField();
        voltajeLabel1 = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        cargoLabel2 = new javax.swing.JLabel();
        crearNewTarea_btn = new javax.swing.JButton();
        crearFechaTareaInput = new javax.swing.JFormattedTextField();
        crearResponsableTareaInput = new javax.swing.JTextField();
        maquinaTareaDropDown = new javax.swing.JComboBox<>();
        vEditarMaquina = new javax.swing.JDialog();
        backgroud14 = new javax.swing.JPanel();
        backgroundSeconColor14 = new javax.swing.JPanel();
        Titulo14 = new javax.swing.JLabel();
        Logo14 = new javax.swing.JLabel();
        volverModificarMaquina_maquina_btn = new javax.swing.JButton();
        nombreLabel4 = new javax.swing.JLabel();
        modificarNombreMaquinaInput = new javax.swing.JTextField();
        categoriaLabel1 = new javax.swing.JLabel();
        modificarCategoriaMaquinaInput = new javax.swing.JTextField();
        voltajeLabel2 = new javax.swing.JLabel();
        modificarVoltajeMaquinaInput = new javax.swing.JTextField();
        motorLabel1 = new javax.swing.JLabel();
        modificarMotorInput = new javax.swing.JTextField();
        cargoLabel3 = new javax.swing.JLabel();
        modificarNewMaquina_btn = new javax.swing.JButton();
        modificarMaquinaDropDown = new javax.swing.JComboBox<>();
        vEditarTarea = new javax.swing.JDialog();
        backgroud16 = new javax.swing.JPanel();
        backgroundSeconColor16 = new javax.swing.JPanel();
        Titulo16 = new javax.swing.JLabel();
        Logo16 = new javax.swing.JLabel();
        volverModificarTarea_tarea_btn = new javax.swing.JButton();
        nombreLabel6 = new javax.swing.JLabel();
        modificarMaquinaTareaInput = new javax.swing.JTextField();
        tipoLabel1 = new javax.swing.JLabel();
        modificarTipoTareaInput = new javax.swing.JTextField();
        voltajeLabel4 = new javax.swing.JLabel();
        fechaLabel1 = new javax.swing.JLabel();
        cargoLabel5 = new javax.swing.JLabel();
        modificarNewTarea_btn = new javax.swing.JButton();
        modificarFechaTareaInput = new javax.swing.JFormattedTextField();
        modificarResponsableTareaInput = new javax.swing.JTextField();
        modificarNombreTareaDropDown = new javax.swing.JComboBox<>();
        estadoTarea = new javax.swing.JLabel();
        modificarEstadoTareaInput = new javax.swing.JTextField();
        vEditarUsuario = new javax.swing.JDialog();
        backgroud4 = new javax.swing.JPanel();
        backgroundSeconColor4 = new javax.swing.JPanel();
        Titulo4 = new javax.swing.JLabel();
        Logo4 = new javax.swing.JLabel();
        volverEditarUser_btn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        nombreLabel5 = new javax.swing.JLabel();
        modificarNombreInput = new javax.swing.JTextField();
        apellidoLabel1 = new javax.swing.JLabel();
        modificarApellidoInput = new javax.swing.JTextField();
        dniLabel1 = new javax.swing.JLabel();
        modificarIdInput = new javax.swing.JTextField();
        telefonoLabel1 = new javax.swing.JLabel();
        modificarTelefonoInput = new javax.swing.JTextField();
        correoLabel1 = new javax.swing.JLabel();
        modificarCorreoInput = new javax.swing.JTextField();
        newUserLabel1 = new javax.swing.JLabel();
        newPassLabel1 = new javax.swing.JLabel();
        modificarPasswordInput = new javax.swing.JTextField();
        cargoLabel4 = new javax.swing.JLabel();
        modificarCargoInput = new javax.swing.JTextField();
        modificarUser_btn = new javax.swing.JButton();
        modificarUserDropDown = new javax.swing.JComboBox<>();
        backgroud = new javax.swing.JPanel();
        backgroundSeconColor = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        oLabel = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        crearUser = new javax.swing.JButton();

        vCrearUsuario.setMinimumSize(new java.awt.Dimension(664, 467));
        vCrearUsuario.setSize(new java.awt.Dimension(664, 467));

        backgroud1.setBackground(new java.awt.Color(102, 204, 255));
        backgroud1.setBorder(null);
        backgroud1.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud1.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor1.setBackground(new java.awt.Color(242, 242, 242));

        Titulo1.setBackground(new java.awt.Color(0, 0, 128));
        Titulo1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(21, 67, 96));
        Titulo1.setText("Crear Usuario");

        Logo1.setBackground(new java.awt.Color(153, 153, 153));
        Logo1.setForeground(new java.awt.Color(153, 153, 153));
        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverCrearUser_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverCrearUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverCrearUser_btn.setText("VOLVER");
        volverCrearUser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverCrearUser_btnMouseClicked(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 123, 255));

        javax.swing.GroupLayout backgroundSeconColor1Layout = new javax.swing.GroupLayout(backgroundSeconColor1);
        backgroundSeconColor1.setLayout(backgroundSeconColor1Layout);
        backgroundSeconColor1Layout.setHorizontalGroup(
            backgroundSeconColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor1Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor1Layout.createSequentialGroup()
                        .addContainerGap(234, Short.MAX_VALUE)
                        .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(backgroundSeconColor1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverCrearUser_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(backgroundSeconColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundSeconColor1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        backgroundSeconColor1Layout.setVerticalGroup(
            backgroundSeconColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverCrearUser_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(backgroundSeconColor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundSeconColor1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText("Nombre");

        crearNombreInput.setBackground(new java.awt.Color(242, 242, 242));
        crearNombreInput.setForeground(new java.awt.Color(77, 77, 77));
        crearNombreInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearNombreInput.setText("Ingrese su nombre");
        crearNombreInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearNombreInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNombreInputMouseClicked(evt);
            }
        });
        crearNombreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNombreInputActionPerformed(evt);
            }
        });

        apellidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLabel.setText("Apellidos");

        crearApellidoInput.setBackground(new java.awt.Color(242, 242, 242));
        crearApellidoInput.setForeground(new java.awt.Color(77, 77, 77));
        crearApellidoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearApellidoInput.setText("Ingrese su apelido");
        crearApellidoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearApellidoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearApellidoInputMouseClicked(evt);
            }
        });
        crearApellidoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearApellidoInputActionPerformed(evt);
            }
        });

        dniLabel.setForeground(new java.awt.Color(255, 255, 255));
        dniLabel.setText("DNI");

        crearIdInput.setBackground(new java.awt.Color(242, 242, 242));
        crearIdInput.setForeground(new java.awt.Color(77, 77, 77));
        crearIdInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearIdInput.setText("Ingrese su numero de identidad");
        crearIdInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearIdInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearIdInputMouseClicked(evt);
            }
        });

        telefonoLabel.setForeground(new java.awt.Color(255, 255, 255));
        telefonoLabel.setText("Telefono");

        crearTelefonoInput.setBackground(new java.awt.Color(242, 242, 242));
        crearTelefonoInput.setForeground(new java.awt.Color(77, 77, 77));
        crearTelefonoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearTelefonoInput.setText("Ingrese su telefono");
        crearTelefonoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearTelefonoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearTelefonoInputMouseClicked(evt);
            }
        });

        correoLabel.setForeground(new java.awt.Color(255, 255, 255));
        correoLabel.setText("Correo");

        crearCorreoInput.setBackground(new java.awt.Color(242, 242, 242));
        crearCorreoInput.setForeground(new java.awt.Color(77, 77, 77));
        crearCorreoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearCorreoInput.setText("Ingrese su correo");
        crearCorreoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearCorreoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCorreoInputMouseClicked(evt);
            }
        });

        newUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        newUserLabel.setText("Usuario");

        crearUserInput.setBackground(new java.awt.Color(242, 242, 242));
        crearUserInput.setForeground(new java.awt.Color(77, 77, 77));
        crearUserInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearUserInput.setText("Ingrese su usuario");
        crearUserInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearUserInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUserInputMouseClicked(evt);
            }
        });

        newPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        newPassLabel.setText("Contraseña");

        crearPasswordInput.setBackground(new java.awt.Color(242, 242, 242));
        crearPasswordInput.setForeground(new java.awt.Color(77, 77, 77));
        crearPasswordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearPasswordInput.setText("Ingrese su contraseña");
        crearPasswordInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearPasswordInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearPasswordInputMouseClicked(evt);
            }
        });

        cargoLabel.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel.setText("Cargo");

        crearCargoInput.setBackground(new java.awt.Color(242, 242, 242));
        crearCargoInput.setForeground(new java.awt.Color(77, 77, 77));
        crearCargoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearCargoInput.setText("Ingrese su cargo");
        crearCargoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearCargoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCargoInputMouseClicked(evt);
            }
        });

        crearUser_btn.setBackground(new java.awt.Color(0, 123, 255));
        crearUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        crearUser_btn.setText("Crear Usuario");
        crearUser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUser_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroud1Layout = new javax.swing.GroupLayout(backgroud1);
        backgroud1.setLayout(backgroud1Layout);
        backgroud1Layout.setHorizontalGroup(
            backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoLabel)
                            .addComponent(dniLabel))
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroud1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(crearIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroud1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearApellidoInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearNombreInput)))))
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoLabel)
                            .addComponent(cargoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(crearCorreoInput)
                            .addComponent(crearCargoInput)
                            .addComponent(crearTelefonoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                    .addComponent(correoLabel))
                .addGap(41, 41, 41)
                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addComponent(newPassLabel)
                        .addGap(18, 18, 18)
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crearUser_btn)
                            .addComponent(crearPasswordInput)))
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addComponent(newUserLabel)
                        .addGap(30, 30, 30)
                        .addComponent(crearUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(backgroud1Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroud1Layout.setVerticalGroup(
            backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud1Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel)
                            .addComponent(newUserLabel)
                            .addComponent(crearUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearNombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellidoLabel)
                                .addComponent(newPassLabel))
                            .addComponent(crearApellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniLabel)
                            .addComponent(crearIdInput, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoLabel)
                            .addComponent(crearTelefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(crearPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(correoLabel))
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(crearUser_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearCorreoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel)
                    .addComponent(crearCargoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout vCrearUsuarioLayout = new javax.swing.GroupLayout(vCrearUsuario.getContentPane());
        vCrearUsuario.getContentPane().setLayout(vCrearUsuarioLayout);
        vCrearUsuarioLayout.setHorizontalGroup(
            vCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vCrearUsuarioLayout.createSequentialGroup()
                .addComponent(backgroud1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        vCrearUsuarioLayout.setVerticalGroup(
            vCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vCrearUsuarioLayout.createSequentialGroup()
                .addComponent(backgroud1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        vMenuPrincipal.setMinimumSize(new java.awt.Dimension(850, 500));
        vMenuPrincipal.setSize(new java.awt.Dimension(850, 500));

        backgroud2.setBackground(new java.awt.Color(102, 204, 255));
        backgroud2.setBorder(null);
        backgroud2.setPreferredSize(new java.awt.Dimension(850, 500));

        backgroundSeconColor2.setBackground(new java.awt.Color(242, 242, 242));

        Titulo2.setBackground(new java.awt.Color(0, 0, 128));
        Titulo2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(21, 67, 96));
        Titulo2.setText("Menu Principal");

        Logo2.setBackground(new java.awt.Color(153, 153, 153));
        Logo2.setForeground(new java.awt.Color(153, 153, 153));
        Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        bienvendoUser.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        bienvendoUser.setForeground(new java.awt.Color(21, 67, 96));
        bienvendoUser.setText("Prueba");

        cerrarSesion_MP_btn.setBackground(new java.awt.Color(0, 123, 255));
        cerrarSesion_MP_btn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion_MP_btn.setText("Cerrar Sesion");
        cerrarSesion_MP_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion_MP_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion_MP_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor2Layout = new javax.swing.GroupLayout(backgroundSeconColor2);
        backgroundSeconColor2.setLayout(backgroundSeconColor2Layout);
        backgroundSeconColor2Layout.setHorizontalGroup(
            backgroundSeconColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor2Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor2Layout.createSequentialGroup()
                        .addGroup(backgroundSeconColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundSeconColor2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(bienvendoUser))
                            .addGroup(backgroundSeconColor2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(cerrarSesion_MP_btn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundSeconColor2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo2)
                        .addGap(161, 161, 161)))
                .addComponent(Logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        backgroundSeconColor2Layout.setVerticalGroup(
            backgroundSeconColor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cerrarSesion_MP_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bienvendoUser)
                .addGap(29, 29, 29))
        );

        maquinas_btn.setBackground(new java.awt.Color(0, 123, 255));

        maquinaLabel.setForeground(new java.awt.Color(255, 255, 255));
        maquinaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maquinaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pngtree-cartoon-industrial-machinery-manufacturer-png-image_6861374-2.png"))); // NOI18N
        maquinaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maquinaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maquinaLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout maquinas_btnLayout = new javax.swing.GroupLayout(maquinas_btn);
        maquinas_btn.setLayout(maquinas_btnLayout);
        maquinas_btnLayout.setHorizontalGroup(
            maquinas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maquinaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        maquinas_btnLayout.setVerticalGroup(
            maquinas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maquinaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tareas_btn.setBackground(new java.awt.Color(0, 123, 255));
        tareas_btn.setForeground(new java.awt.Color(255, 255, 255));

        tareasLabel.setBackground(new java.awt.Color(0, 123, 255));
        tareasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tareasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/—Pngtree—to do list vector_6781894-2.png"))); // NOI18N
        tareasLabel.setLabelFor(Logo);
        tareasLabel.setToolTipText("");
        tareasLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tareasLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tareasLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tareas_btnLayout = new javax.swing.GroupLayout(tareas_btn);
        tareas_btn.setLayout(tareas_btnLayout);
        tareas_btnLayout.setHorizontalGroup(
            tareas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tareas_btnLayout.createSequentialGroup()
                .addComponent(tareasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tareas_btnLayout.setVerticalGroup(
            tareas_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tareasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        editUser_btn.setBackground(new java.awt.Color(0, 123, 255));
        editUser_btn.setForeground(new java.awt.Color(255, 255, 255));

        editUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/—Pngtree—user avatar placeholder black_6796227-2.png"))); // NOI18N
        editUserLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUserLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editUser_btnLayout = new javax.swing.GroupLayout(editUser_btn);
        editUser_btn.setLayout(editUser_btnLayout);
        editUser_btnLayout.setHorizontalGroup(
            editUser_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editUser_btnLayout.setVerticalGroup(
            editUser_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 67, 96));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maquinas");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(21, 67, 96));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tareas");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(21, 67, 96));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editar Usuario");

        javax.swing.GroupLayout backgroud2Layout = new javax.swing.GroupLayout(backgroud2);
        backgroud2.setLayout(backgroud2Layout);
        backgroud2Layout.setHorizontalGroup(
            backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSeconColor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroud2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maquinas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111)
                .addGroup(backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tareas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(editUser_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        backgroud2Layout.setVerticalGroup(
            backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud2Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maquinas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tareas_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editUser_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroud2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vMenuPrincipalLayout = new javax.swing.GroupLayout(vMenuPrincipal.getContentPane());
        vMenuPrincipal.getContentPane().setLayout(vMenuPrincipalLayout);
        vMenuPrincipalLayout.setHorizontalGroup(
            vMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vMenuPrincipalLayout.createSequentialGroup()
                .addComponent(backgroud2, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
        );
        vMenuPrincipalLayout.setVerticalGroup(
            vMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vMaquinas.setMinimumSize(new java.awt.Dimension(850, 500));

        backgroud3.setBackground(new java.awt.Color(102, 204, 255));
        backgroud3.setBorder(null);
        backgroud3.setPreferredSize(new java.awt.Dimension(850, 500));

        backgroundSeconColor3.setBackground(new java.awt.Color(242, 242, 242));

        Titulo3.setBackground(new java.awt.Color(0, 0, 128));
        Titulo3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(21, 67, 96));
        Titulo3.setText("Maquinas");

        Logo3.setBackground(new java.awt.Color(153, 153, 153));
        Logo3.setForeground(new java.awt.Color(153, 153, 153));
        Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        Volver_MP_btn2.setBackground(new java.awt.Color(0, 123, 255));
        Volver_MP_btn2.setForeground(new java.awt.Color(255, 255, 255));
        Volver_MP_btn2.setText("Volver");
        Volver_MP_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver_MP_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volver_MP_btn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor3Layout = new javax.swing.GroupLayout(backgroundSeconColor3);
        backgroundSeconColor3.setLayout(backgroundSeconColor3Layout);
        backgroundSeconColor3Layout.setHorizontalGroup(
            backgroundSeconColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor3Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Volver_MP_btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor3Layout.createSequentialGroup()
                        .addGap(0, 353, Short.MAX_VALUE)
                        .addComponent(Titulo3)
                        .addGap(212, 212, 212)))
                .addComponent(Logo3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        backgroundSeconColor3Layout.setVerticalGroup(
            backgroundSeconColor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Volver_MP_btn2)
                .addGap(1, 1, 1)
                .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 62, Short.MAX_VALUE))
        );

        tablaMaquinas.setBackground(new java.awt.Color(0, 123, 255));
        tablaMaquinas.setForeground(new java.awt.Color(255, 255, 255));
        tablaMaquinas.setModel(modelo);
        jScrollPane1.setViewportView(tablaMaquinas);

        crearMaquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        crearMaquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        crearMaquina_btn.setText("Crear Maquina");
        crearMaquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMaquina_btnMouseClicked(evt);
            }
        });

        modificarMaquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        modificarMaquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        modificarMaquina_btn.setText("Modificar Maquina");
        modificarMaquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMaquina_btnMouseClicked(evt);
            }
        });

        eliminarMaquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        eliminarMaquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarMaquina_btn.setText("Eliminar Maquina");
        eliminarMaquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMaquina_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroud3Layout = new javax.swing.GroupLayout(backgroud3);
        backgroud3.setLayout(backgroud3Layout);
        backgroud3Layout.setHorizontalGroup(
            backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSeconColor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crearMaquina_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarMaquina_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarMaquina_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroud3Layout.setVerticalGroup(
            backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud3Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(crearMaquina_btn)
                        .addGap(48, 48, 48)
                        .addComponent(modificarMaquina_btn)
                        .addGap(43, 43, 43)
                        .addComponent(eliminarMaquina_btn))
                    .addGroup(backgroud3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vMaquinasLayout = new javax.swing.GroupLayout(vMaquinas.getContentPane());
        vMaquinas.getContentPane().setLayout(vMaquinasLayout);
        vMaquinasLayout.setHorizontalGroup(
            vMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud3, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        vMaquinasLayout.setVerticalGroup(
            vMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        vTareas.setMinimumSize(new java.awt.Dimension(850, 500));

        backgroud10.setBackground(new java.awt.Color(102, 204, 255));
        backgroud10.setBorder(null);
        backgroud10.setPreferredSize(new java.awt.Dimension(850, 500));

        backgroundSeconColor10.setBackground(new java.awt.Color(242, 242, 242));

        Titulo10.setBackground(new java.awt.Color(0, 0, 128));
        Titulo10.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo10.setForeground(new java.awt.Color(21, 67, 96));
        Titulo10.setText("Tareas");

        Logo10.setBackground(new java.awt.Color(153, 153, 153));
        Logo10.setForeground(new java.awt.Color(153, 153, 153));
        Logo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        Volver_MP_btn.setBackground(new java.awt.Color(0, 123, 255));
        Volver_MP_btn.setForeground(new java.awt.Color(255, 255, 255));
        Volver_MP_btn.setText("Volver");
        Volver_MP_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Volver_MP_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volver_MP_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor10Layout = new javax.swing.GroupLayout(backgroundSeconColor10);
        backgroundSeconColor10.setLayout(backgroundSeconColor10Layout);
        backgroundSeconColor10Layout.setHorizontalGroup(
            backgroundSeconColor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor10Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Volver_MP_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor10Layout.createSequentialGroup()
                        .addContainerGap(369, Short.MAX_VALUE)
                        .addComponent(Titulo10)
                        .addGap(235, 235, 235)))
                .addComponent(Logo10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        backgroundSeconColor10Layout.setVerticalGroup(
            backgroundSeconColor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Volver_MP_btn)
                .addGap(2, 2, 2)
                .addComponent(Titulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        crearTarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        crearTarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        crearTarea_btn.setText("Crear tarea");
        crearTarea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearTarea_btnMouseClicked(evt);
            }
        });

        editarTarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        editarTarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        editarTarea_btn.setText("Editar tarea");
        editarTarea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarTarea_btnMouseClicked(evt);
            }
        });

        eliminarTarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        eliminarTarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarTarea_btn.setText("Eliminar Tarea");

        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaTareas);

        javax.swing.GroupLayout backgroud10Layout = new javax.swing.GroupLayout(backgroud10);
        backgroud10.setLayout(backgroud10Layout);
        backgroud10Layout.setHorizontalGroup(
            backgroud10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSeconColor10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroud10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(backgroud10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(eliminarTarea_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarTarea_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearTarea_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroud10Layout.setVerticalGroup(
            backgroud10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud10Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroud10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(crearTarea_btn)
                        .addGap(73, 73, 73)
                        .addComponent(editarTarea_btn)
                        .addGap(63, 63, 63)
                        .addComponent(eliminarTarea_btn))
                    .addGroup(backgroud10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vTareasLayout = new javax.swing.GroupLayout(vTareas.getContentPane());
        vTareas.getContentPane().setLayout(vTareasLayout);
        vTareasLayout.setHorizontalGroup(
            vTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        vTareasLayout.setVerticalGroup(
            vTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud10, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        vCrearMaquina.setMinimumSize(new java.awt.Dimension(650, 504));
        vCrearMaquina.setSize(new java.awt.Dimension(650, 504));

        backgroud11.setBackground(new java.awt.Color(102, 204, 255));
        backgroud11.setBorder(null);
        backgroud11.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud11.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor11.setBackground(new java.awt.Color(242, 242, 242));

        Titulo11.setBackground(new java.awt.Color(0, 0, 128));
        Titulo11.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo11.setForeground(new java.awt.Color(21, 67, 96));
        Titulo11.setText("Crear Maquina");

        Logo11.setBackground(new java.awt.Color(153, 153, 153));
        Logo11.setForeground(new java.awt.Color(153, 153, 153));
        Logo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverCrearMaquina_maquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverCrearMaquina_maquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverCrearMaquina_maquina_btn.setText("VOLVER");
        volverCrearMaquina_maquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverCrearMaquina_maquina_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor11Layout = new javax.swing.GroupLayout(backgroundSeconColor11);
        backgroundSeconColor11.setLayout(backgroundSeconColor11Layout);
        backgroundSeconColor11Layout.setHorizontalGroup(
            backgroundSeconColor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor11Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor11Layout.createSequentialGroup()
                        .addContainerGap(234, Short.MAX_VALUE)
                        .addComponent(Titulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(backgroundSeconColor11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverCrearMaquina_maquina_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Logo11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        backgroundSeconColor11Layout.setVerticalGroup(
            backgroundSeconColor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverCrearMaquina_maquina_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        nombreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel1.setText("Nombre");

        crearNombreMaquinaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearNombreMaquinaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearNombreMaquinaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearNombreMaquinaInput.setText("Ingrese el nombre");
        crearNombreMaquinaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearNombreMaquinaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNombreMaquinaInputMouseClicked(evt);
            }
        });
        crearNombreMaquinaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNombreMaquinaInputActionPerformed(evt);
            }
        });

        categoriaLabel.setForeground(new java.awt.Color(255, 255, 255));
        categoriaLabel.setText("Categoria");

        crearCategoriaMaquinaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearCategoriaMaquinaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearCategoriaMaquinaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearCategoriaMaquinaInput.setText("Ingrese la categoria");
        crearCategoriaMaquinaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearCategoriaMaquinaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCategoriaMaquinaInputMouseClicked(evt);
            }
        });
        crearCategoriaMaquinaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCategoriaMaquinaInputActionPerformed(evt);
            }
        });

        voltajeLabel.setForeground(new java.awt.Color(255, 255, 255));
        voltajeLabel.setText("Voltaje");

        crearVoltajeMaquinaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearVoltajeMaquinaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearVoltajeMaquinaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearVoltajeMaquinaInput.setText("Ingrese el voltaje en que trabaja");
        crearVoltajeMaquinaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearVoltajeMaquinaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearVoltajeMaquinaInputMouseClicked(evt);
            }
        });

        motorLabel.setForeground(new java.awt.Color(255, 255, 255));
        motorLabel.setText("Motor");

        crearMotorInput.setBackground(new java.awt.Color(242, 242, 242));
        crearMotorInput.setForeground(new java.awt.Color(77, 77, 77));
        crearMotorInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearMotorInput.setText("Ingrese la potencia del motor (HP)");
        crearMotorInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearMotorInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMotorInputMouseClicked(evt);
            }
        });

        cargoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel1.setText("Codigo");

        crearNewMaquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        crearNewMaquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        crearNewMaquina_btn.setText("Crear maquina");
        crearNewMaquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNewMaquina_btnMouseClicked(evt);
            }
        });

        codigoMaquina.setBackground(new java.awt.Color(242, 242, 242));
        codigoMaquina.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        codigoMaquina.setForeground(new java.awt.Color(21, 67, 96));
        codigoMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoMaquina.setText("Codigo Maquina");
        codigoMaquina.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout backgroud11Layout = new javax.swing.GroupLayout(backgroud11);
        backgroud11.setLayout(backgroud11Layout);
        backgroud11Layout.setHorizontalGroup(
            backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud11Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroud11Layout.createSequentialGroup()
                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud11Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud11Layout.createSequentialGroup()
                                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroud11Layout.createSequentialGroup()
                                        .addComponent(voltajeLabel)
                                        .addGap(15, 15, 15))
                                    .addComponent(categoriaLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroud11Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(crearVoltajeMaquinaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(crearCategoriaMaquinaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(crearNombreMaquinaInput)))
                                    .addGroup(backgroud11Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(crearMotorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(backgroud11Layout.createSequentialGroup()
                                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreLabel1)
                                    .addComponent(motorLabel)
                                    .addComponent(cargoLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(backgroud11Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(crearNewMaquina_btn)))
                .addGap(234, 234, 234))
        );
        backgroud11Layout.setVerticalGroup(
            backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud11Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud11Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(nombreLabel1))
                    .addComponent(crearNombreMaquinaInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearCategoriaMaquinaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLabel))
                .addGap(18, 18, 18)
                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltajeLabel)
                    .addComponent(crearVoltajeMaquinaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorLabel)
                    .addComponent(crearMotorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroud11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel1)
                    .addComponent(codigoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(crearNewMaquina_btn)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout vCrearMaquinaLayout = new javax.swing.GroupLayout(vCrearMaquina.getContentPane());
        vCrearMaquina.getContentPane().setLayout(vCrearMaquinaLayout);
        vCrearMaquinaLayout.setHorizontalGroup(
            vCrearMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud11, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vCrearMaquinaLayout.setVerticalGroup(
            vCrearMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vEliminarMaquina.setMinimumSize(new java.awt.Dimension(402, 316));
        vEliminarMaquina.setSize(new java.awt.Dimension(402, 316));

        backgroud12.setBackground(new java.awt.Color(102, 204, 255));
        backgroud12.setBorder(null);
        backgroud12.setMaximumSize(new java.awt.Dimension(402, 316));
        backgroud12.setMinimumSize(new java.awt.Dimension(402, 316));
        backgroud12.setPreferredSize(new java.awt.Dimension(402, 316));

        backgroundSeconColor12.setBackground(new java.awt.Color(242, 242, 242));

        Titulo12.setBackground(new java.awt.Color(0, 0, 128));
        Titulo12.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo12.setForeground(new java.awt.Color(21, 67, 96));
        Titulo12.setText("Eliminar Maquina");

        Logo12.setBackground(new java.awt.Color(153, 153, 153));
        Logo12.setForeground(new java.awt.Color(153, 153, 153));
        Logo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverEliminarMaquina_maquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverEliminarMaquina_maquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverEliminarMaquina_maquina_btn.setText("VOLVER");
        volverEliminarMaquina_maquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverEliminarMaquina_maquina_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor12Layout = new javax.swing.GroupLayout(backgroundSeconColor12);
        backgroundSeconColor12.setLayout(backgroundSeconColor12Layout);
        backgroundSeconColor12Layout.setHorizontalGroup(
            backgroundSeconColor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor12Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverEliminarMaquina_maquina_btn))
                    .addGroup(backgroundSeconColor12Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Titulo12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(Logo12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        backgroundSeconColor12Layout.setVerticalGroup(
            backgroundSeconColor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverEliminarMaquina_maquina_btn)
                .addGap(29, 29, 29)
                .addComponent(Titulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        nombreLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        nombreLabel2.setForeground(new java.awt.Color(21, 67, 96));
        nombreLabel2.setText("Maquina a eliminar");

        eliminarMaquinabtn.setBackground(new java.awt.Color(0, 123, 255));
        eliminarMaquinabtn.setForeground(new java.awt.Color(255, 255, 255));
        eliminarMaquinabtn.setText("Eliminar maquina");
        eliminarMaquinabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMaquinabtnMouseClicked(evt);
            }
        });

        eliminarMaquinaDropDown.setBackground(new java.awt.Color(242, 242, 242));
        eliminarMaquinaDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout backgroud12Layout = new javax.swing.GroupLayout(backgroud12);
        backgroud12.setLayout(backgroud12Layout);
        backgroud12Layout.setHorizontalGroup(
            backgroud12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud12Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroud12Layout.createSequentialGroup()
                .addGroup(backgroud12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud12Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(nombreLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarMaquinaDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroud12Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(eliminarMaquinabtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroud12Layout.setVerticalGroup(
            backgroud12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud12Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(backgroud12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel2)
                    .addComponent(eliminarMaquinaDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(eliminarMaquinabtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vEliminarMaquinaLayout = new javax.swing.GroupLayout(vEliminarMaquina.getContentPane());
        vEliminarMaquina.getContentPane().setLayout(vEliminarMaquinaLayout);
        vEliminarMaquinaLayout.setHorizontalGroup(
            vEliminarMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud12, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vEliminarMaquinaLayout.setVerticalGroup(
            vEliminarMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        vCrearTarea.setMaximumSize(new java.awt.Dimension(650, 504));
        vCrearTarea.setMinimumSize(new java.awt.Dimension(650, 504));
        vCrearTarea.setPreferredSize(new java.awt.Dimension(650, 504));
        vCrearTarea.setSize(new java.awt.Dimension(650, 504));

        backgroud13.setBackground(new java.awt.Color(102, 204, 255));
        backgroud13.setBorder(null);
        backgroud13.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud13.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor13.setBackground(new java.awt.Color(242, 242, 242));

        Titulo13.setBackground(new java.awt.Color(0, 0, 128));
        Titulo13.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo13.setForeground(new java.awt.Color(21, 67, 96));
        Titulo13.setText("Crear Tarea");

        Logo13.setBackground(new java.awt.Color(153, 153, 153));
        Logo13.setForeground(new java.awt.Color(153, 153, 153));
        Logo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverCrearTarea_tarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverCrearTarea_tarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverCrearTarea_tarea_btn.setText("VOLVER");
        volverCrearTarea_tarea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverCrearTarea_tarea_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor13Layout = new javax.swing.GroupLayout(backgroundSeconColor13);
        backgroundSeconColor13.setLayout(backgroundSeconColor13Layout);
        backgroundSeconColor13Layout.setHorizontalGroup(
            backgroundSeconColor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor13Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor13Layout.createSequentialGroup()
                        .addContainerGap(234, Short.MAX_VALUE)
                        .addComponent(Titulo13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(backgroundSeconColor13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverCrearTarea_tarea_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Logo13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        backgroundSeconColor13Layout.setVerticalGroup(
            backgroundSeconColor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverCrearTarea_tarea_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        nombreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel3.setText("Nombre");

        crearNombreTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearNombreTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearNombreTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearNombreTareaInput.setText("Ingrese el nombre");
        crearNombreTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearNombreTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNombreTareaInputMouseClicked(evt);
            }
        });
        crearNombreTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearNombreTareaInputActionPerformed(evt);
            }
        });

        tipoLabel.setForeground(new java.awt.Color(255, 255, 255));
        tipoLabel.setText("Tipo");

        crearTipoTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearTipoTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearTipoTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearTipoTareaInput.setText("Ingrese el tipo de mantenimiento");
        crearTipoTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearTipoTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearTipoTareaInputMouseClicked(evt);
            }
        });
        crearTipoTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTipoTareaInputActionPerformed(evt);
            }
        });

        voltajeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        voltajeLabel1.setText("Maquina");

        fechaLabel.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel.setText("Fecha");

        cargoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel2.setText("Responsable");

        crearNewTarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        crearNewTarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        crearNewTarea_btn.setText("Crear tarea");
        crearNewTarea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearNewTarea_btnMouseClicked(evt);
            }
        });

        crearFechaTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearFechaTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearFechaTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearFechaTareaInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));
        crearFechaTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearFechaTareaInput.setText("01/01/01");
        crearFechaTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearFechaTareaInputMouseClicked(evt);
            }
        });

        crearResponsableTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        crearResponsableTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        crearResponsableTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crearResponsableTareaInput.setText("Ingrese el responsable");
        crearResponsableTareaInput.setToolTipText("");
        crearResponsableTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        crearResponsableTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearResponsableTareaInputMouseClicked(evt);
            }
        });
        crearResponsableTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearResponsableTareaInputActionPerformed(evt);
            }
        });

        maquinaTareaDropDown.setBackground(new java.awt.Color(242, 242, 242));
        maquinaTareaDropDown.setForeground(new java.awt.Color(21, 67, 96));
        maquinaTareaDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout backgroud13Layout = new javax.swing.GroupLayout(backgroud13);
        backgroud13.setLayout(backgroud13Layout);
        backgroud13Layout.setHorizontalGroup(
            backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud13Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroud13Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud13Layout.createSequentialGroup()
                        .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltajeLabel1)
                            .addComponent(tipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(crearTipoTareaInput))
                    .addGroup(backgroud13Layout.createSequentialGroup()
                        .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel3)
                            .addComponent(fechaLabel)
                            .addComponent(cargoLabel2))
                        .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud13Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(crearNombreTareaInput))
                            .addGroup(backgroud13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearResponsableTareaInput)
                                    .addComponent(crearFechaTareaInput)
                                    .addComponent(maquinaTareaDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(234, 234, 234))
            .addGroup(backgroud13Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(crearNewTarea_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroud13Layout.setVerticalGroup(
            backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud13Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud13Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(nombreLabel3))
                    .addComponent(crearNombreTareaInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearTipoTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel))
                .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(voltajeLabel1)
                        .addGap(18, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maquinaTareaDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cargoLabel2)
                    .addGroup(backgroud13Layout.createSequentialGroup()
                        .addGroup(backgroud13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearFechaTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crearResponsableTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(crearNewTarea_btn)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout vCrearTareaLayout = new javax.swing.GroupLayout(vCrearTarea.getContentPane());
        vCrearTarea.getContentPane().setLayout(vCrearTareaLayout);
        vCrearTareaLayout.setHorizontalGroup(
            vCrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud13, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vCrearTareaLayout.setVerticalGroup(
            vCrearTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vEditarMaquina.setMinimumSize(new java.awt.Dimension(650, 504));
        vEditarMaquina.setSize(new java.awt.Dimension(650, 504));

        backgroud14.setBackground(new java.awt.Color(102, 204, 255));
        backgroud14.setBorder(null);
        backgroud14.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud14.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor14.setBackground(new java.awt.Color(242, 242, 242));

        Titulo14.setBackground(new java.awt.Color(0, 0, 128));
        Titulo14.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo14.setForeground(new java.awt.Color(21, 67, 96));
        Titulo14.setText("Modificar Maquina");

        Logo14.setBackground(new java.awt.Color(153, 153, 153));
        Logo14.setForeground(new java.awt.Color(153, 153, 153));
        Logo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverModificarMaquina_maquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverModificarMaquina_maquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverModificarMaquina_maquina_btn.setText("VOLVER");
        volverModificarMaquina_maquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverModificarMaquina_maquina_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor14Layout = new javax.swing.GroupLayout(backgroundSeconColor14);
        backgroundSeconColor14.setLayout(backgroundSeconColor14Layout);
        backgroundSeconColor14Layout.setHorizontalGroup(
            backgroundSeconColor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor14Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverModificarMaquina_maquina_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titulo14)
                        .addGap(28, 28, 28)))
                .addComponent(Logo14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        backgroundSeconColor14Layout.setVerticalGroup(
            backgroundSeconColor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverModificarMaquina_maquina_btn)
                .addGap(13, 13, 13)
                .addComponent(Titulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nombreLabel4.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel4.setText("Nombre");

        modificarNombreMaquinaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarNombreMaquinaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarNombreMaquinaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarNombreMaquinaInput.setText("Ingrese el nombre");
        modificarNombreMaquinaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarNombreMaquinaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarNombreMaquinaInputMouseClicked(evt);
            }
        });
        modificarNombreMaquinaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreMaquinaInputActionPerformed(evt);
            }
        });

        categoriaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        categoriaLabel1.setText("Categoria");

        modificarCategoriaMaquinaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarCategoriaMaquinaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarCategoriaMaquinaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarCategoriaMaquinaInput.setText("Ingrese la categoria");
        modificarCategoriaMaquinaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarCategoriaMaquinaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarCategoriaMaquinaInputMouseClicked(evt);
            }
        });
        modificarCategoriaMaquinaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCategoriaMaquinaInputActionPerformed(evt);
            }
        });

        voltajeLabel2.setForeground(new java.awt.Color(255, 255, 255));
        voltajeLabel2.setText("Voltaje");

        modificarVoltajeMaquinaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarVoltajeMaquinaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarVoltajeMaquinaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarVoltajeMaquinaInput.setText("Ingrese el voltaje en que trabaja");
        modificarVoltajeMaquinaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarVoltajeMaquinaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarVoltajeMaquinaInputMouseClicked(evt);
            }
        });

        motorLabel1.setForeground(new java.awt.Color(255, 255, 255));
        motorLabel1.setText("Motor");

        modificarMotorInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarMotorInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarMotorInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarMotorInput.setText("Ingrese la potencia del motor (HP)");
        modificarMotorInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarMotorInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMotorInputMouseClicked(evt);
            }
        });

        cargoLabel3.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel3.setText("Codigo");

        modificarNewMaquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        modificarNewMaquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        modificarNewMaquina_btn.setText("Modificar maquina");
        modificarNewMaquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarNewMaquina_btnMouseClicked(evt);
            }
        });

        modificarMaquinaDropDown.setBackground(new java.awt.Color(242, 242, 242));
        modificarMaquinaDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        modificarMaquinaDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMaquinaDropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroud14Layout = new javax.swing.GroupLayout(backgroud14);
        backgroud14.setLayout(backgroud14Layout);
        backgroud14Layout.setHorizontalGroup(
            backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud14Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroud14Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud14Layout.createSequentialGroup()
                        .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud14Layout.createSequentialGroup()
                                .addComponent(voltajeLabel2)
                                .addGap(15, 15, 15))
                            .addComponent(categoriaLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud14Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(modificarMotorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroud14Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modificarVoltajeMaquinaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modificarCategoriaMaquinaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modificarNombreMaquinaInput)
                                    .addComponent(modificarMaquinaDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(backgroud14Layout.createSequentialGroup()
                        .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel4)
                            .addComponent(motorLabel1)
                            .addComponent(cargoLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(234, 234, 234))
            .addGroup(backgroud14Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(modificarNewMaquina_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroud14Layout.setVerticalGroup(
            backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud14Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel3)
                    .addComponent(modificarMaquinaDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud14Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(nombreLabel4))
                    .addComponent(modificarNombreMaquinaInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarCategoriaMaquinaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLabel1))
                .addGap(18, 18, 18)
                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltajeLabel2)
                    .addComponent(modificarVoltajeMaquinaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroud14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorLabel1)
                    .addComponent(modificarMotorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(modificarNewMaquina_btn)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout vEditarMaquinaLayout = new javax.swing.GroupLayout(vEditarMaquina.getContentPane());
        vEditarMaquina.getContentPane().setLayout(vEditarMaquinaLayout);
        vEditarMaquinaLayout.setHorizontalGroup(
            vEditarMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud14, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vEditarMaquinaLayout.setVerticalGroup(
            vEditarMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vEditarTarea.setMaximumSize(new java.awt.Dimension(650, 504));
        vEditarTarea.setMinimumSize(new java.awt.Dimension(650, 504));
        vEditarTarea.setPreferredSize(new java.awt.Dimension(650, 504));
        vEditarTarea.setSize(new java.awt.Dimension(650, 504));

        backgroud16.setBackground(new java.awt.Color(102, 204, 255));
        backgroud16.setBorder(null);
        backgroud16.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud16.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor16.setBackground(new java.awt.Color(242, 242, 242));

        Titulo16.setBackground(new java.awt.Color(0, 0, 128));
        Titulo16.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo16.setForeground(new java.awt.Color(21, 67, 96));
        Titulo16.setText("Editar Tarea");

        Logo16.setBackground(new java.awt.Color(153, 153, 153));
        Logo16.setForeground(new java.awt.Color(153, 153, 153));
        Logo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverModificarTarea_tarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverModificarTarea_tarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverModificarTarea_tarea_btn.setText("VOLVER");
        volverModificarTarea_tarea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverModificarTarea_tarea_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundSeconColor16Layout = new javax.swing.GroupLayout(backgroundSeconColor16);
        backgroundSeconColor16.setLayout(backgroundSeconColor16Layout);
        backgroundSeconColor16Layout.setHorizontalGroup(
            backgroundSeconColor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor16Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor16Layout.createSequentialGroup()
                        .addContainerGap(234, Short.MAX_VALUE)
                        .addComponent(Titulo16, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(backgroundSeconColor16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverModificarTarea_tarea_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Logo16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        backgroundSeconColor16Layout.setVerticalGroup(
            backgroundSeconColor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverModificarTarea_tarea_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        nombreLabel6.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel6.setText("Nombre");

        modificarMaquinaTareaInput.setEditable(false);
        modificarMaquinaTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarMaquinaTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarMaquinaTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarMaquinaTareaInput.setText("Ingrese el nombre");
        modificarMaquinaTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarMaquinaTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMaquinaTareaInputMouseClicked(evt);
            }
        });
        modificarMaquinaTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarMaquinaTareaInputActionPerformed(evt);
            }
        });

        tipoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        tipoLabel1.setText("Tipo");

        modificarTipoTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarTipoTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarTipoTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarTipoTareaInput.setText("Ingrese el tipo de mantenimiento");
        modificarTipoTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarTipoTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarTipoTareaInputMouseClicked(evt);
            }
        });
        modificarTipoTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTipoTareaInputActionPerformed(evt);
            }
        });

        voltajeLabel4.setForeground(new java.awt.Color(255, 255, 255));
        voltajeLabel4.setText("Maquina");

        fechaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        fechaLabel1.setText("Fecha");

        cargoLabel5.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel5.setText("Responsable");

        modificarNewTarea_btn.setBackground(new java.awt.Color(0, 123, 255));
        modificarNewTarea_btn.setForeground(new java.awt.Color(255, 255, 255));
        modificarNewTarea_btn.setText("Editar tarea");
        modificarNewTarea_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarNewTarea_btnMouseClicked(evt);
            }
        });

        modificarFechaTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarFechaTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarFechaTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarFechaTareaInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));
        modificarFechaTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarFechaTareaInput.setText("01/01/01");
        modificarFechaTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarFechaTareaInputMouseClicked(evt);
            }
        });

        modificarResponsableTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarResponsableTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarResponsableTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarResponsableTareaInput.setText("Ingrese el responsable");
        modificarResponsableTareaInput.setToolTipText("");
        modificarResponsableTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarResponsableTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarResponsableTareaInputMouseClicked(evt);
            }
        });
        modificarResponsableTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarResponsableTareaInputActionPerformed(evt);
            }
        });

        modificarNombreTareaDropDown.setBackground(new java.awt.Color(242, 242, 242));
        modificarNombreTareaDropDown.setForeground(new java.awt.Color(21, 67, 96));
        modificarNombreTareaDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        modificarNombreTareaDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreTareaDropDownActionPerformed(evt);
            }
        });

        estadoTarea.setForeground(new java.awt.Color(255, 255, 255));
        estadoTarea.setText("Estado");

        modificarEstadoTareaInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarEstadoTareaInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarEstadoTareaInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarEstadoTareaInput.setText("Ingrese el responsable");
        modificarEstadoTareaInput.setToolTipText("");
        modificarEstadoTareaInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarEstadoTareaInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarEstadoTareaInputMouseClicked(evt);
            }
        });
        modificarEstadoTareaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEstadoTareaInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroud16Layout = new javax.swing.GroupLayout(backgroud16);
        backgroud16.setLayout(backgroud16Layout);
        backgroud16Layout.setHorizontalGroup(
            backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud16Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroud16Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(modificarNewTarea_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroud16Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud16Layout.createSequentialGroup()
                        .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltajeLabel4)
                            .addComponent(tipoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarTipoTareaInput)
                            .addComponent(modificarMaquinaTareaInput)))
                    .addGroup(backgroud16Layout.createSequentialGroup()
                        .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel6)
                            .addComponent(fechaLabel1)
                            .addComponent(cargoLabel5)
                            .addComponent(estadoTarea))
                        .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modificarResponsableTareaInput)
                                    .addComponent(modificarFechaTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modificarEstadoTareaInput, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(backgroud16Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(modificarNombreTareaDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(234, 234, 234))
        );
        backgroud16Layout.setVerticalGroup(
            backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud16Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel6)
                    .addComponent(modificarNombreTareaDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarTipoTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel1))
                .addGap(18, 18, 18)
                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltajeLabel4)
                    .addComponent(modificarMaquinaTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cargoLabel5)
                    .addGroup(backgroud16Layout.createSequentialGroup()
                        .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarFechaTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificarResponsableTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(backgroud16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estadoTarea)
                    .addComponent(modificarEstadoTareaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(modificarNewTarea_btn)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout vEditarTareaLayout = new javax.swing.GroupLayout(vEditarTarea.getContentPane());
        vEditarTarea.getContentPane().setLayout(vEditarTareaLayout);
        vEditarTareaLayout.setHorizontalGroup(
            vEditarTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud16, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vEditarTareaLayout.setVerticalGroup(
            vEditarTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vEditarUsuario.setMinimumSize(new java.awt.Dimension(664, 467));
        vEditarUsuario.setSize(new java.awt.Dimension(664, 467));

        backgroud4.setBackground(new java.awt.Color(102, 204, 255));
        backgroud4.setBorder(null);
        backgroud4.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud4.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor4.setBackground(new java.awt.Color(242, 242, 242));

        Titulo4.setBackground(new java.awt.Color(0, 0, 128));
        Titulo4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo4.setForeground(new java.awt.Color(21, 67, 96));
        Titulo4.setText("Editar Usuario");

        Logo4.setBackground(new java.awt.Color(153, 153, 153));
        Logo4.setForeground(new java.awt.Color(153, 153, 153));
        Logo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        volverEditarUser_btn.setBackground(new java.awt.Color(0, 123, 255));
        volverEditarUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        volverEditarUser_btn.setText("VOLVER");
        volverEditarUser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverEditarUser_btnMouseClicked(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(0, 123, 255));

        javax.swing.GroupLayout backgroundSeconColor4Layout = new javax.swing.GroupLayout(backgroundSeconColor4);
        backgroundSeconColor4.setLayout(backgroundSeconColor4Layout);
        backgroundSeconColor4Layout.setHorizontalGroup(
            backgroundSeconColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColor4Layout.createSequentialGroup()
                .addGroup(backgroundSeconColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundSeconColor4Layout.createSequentialGroup()
                        .addContainerGap(234, Short.MAX_VALUE)
                        .addComponent(Titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(backgroundSeconColor4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverEditarUser_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Logo4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(backgroundSeconColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundSeconColor4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        backgroundSeconColor4Layout.setVerticalGroup(
            backgroundSeconColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundSeconColor4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(volverEditarUser_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(backgroundSeconColor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundSeconColor4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        nombreLabel5.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel5.setText("Nombre");

        modificarNombreInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarNombreInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarNombreInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarNombreInput.setText("Ingrese su nombre");
        modificarNombreInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarNombreInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarNombreInputMouseClicked(evt);
            }
        });
        modificarNombreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreInputActionPerformed(evt);
            }
        });

        apellidoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLabel1.setText("Apellidos");

        modificarApellidoInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarApellidoInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarApellidoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarApellidoInput.setText("Ingrese su apelido");
        modificarApellidoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarApellidoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarApellidoInputMouseClicked(evt);
            }
        });
        modificarApellidoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarApellidoInputActionPerformed(evt);
            }
        });

        dniLabel1.setForeground(new java.awt.Color(255, 255, 255));
        dniLabel1.setText("DNI");

        modificarIdInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarIdInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarIdInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarIdInput.setText("Ingrese su numero de identidad");
        modificarIdInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarIdInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarIdInputMouseClicked(evt);
            }
        });

        telefonoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        telefonoLabel1.setText("Telefono");

        modificarTelefonoInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarTelefonoInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarTelefonoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarTelefonoInput.setText("Ingrese su telefono");
        modificarTelefonoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarTelefonoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarTelefonoInputMouseClicked(evt);
            }
        });

        correoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        correoLabel1.setText("Correo");

        modificarCorreoInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarCorreoInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarCorreoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarCorreoInput.setText("Ingrese su correo");
        modificarCorreoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarCorreoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarCorreoInputMouseClicked(evt);
            }
        });

        newUserLabel1.setForeground(new java.awt.Color(255, 255, 255));
        newUserLabel1.setText("Usuario");

        newPassLabel1.setForeground(new java.awt.Color(255, 255, 255));
        newPassLabel1.setText("Contraseña");

        modificarPasswordInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarPasswordInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarPasswordInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarPasswordInput.setText("Ingrese su contraseña");
        modificarPasswordInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarPasswordInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarPasswordInputMouseClicked(evt);
            }
        });

        cargoLabel4.setForeground(new java.awt.Color(255, 255, 255));
        cargoLabel4.setText("Cargo");

        modificarCargoInput.setBackground(new java.awt.Color(242, 242, 242));
        modificarCargoInput.setForeground(new java.awt.Color(77, 77, 77));
        modificarCargoInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modificarCargoInput.setText("Ingrese su cargo");
        modificarCargoInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modificarCargoInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarCargoInputMouseClicked(evt);
            }
        });

        modificarUser_btn.setBackground(new java.awt.Color(0, 123, 255));
        modificarUser_btn.setForeground(new java.awt.Color(255, 255, 255));
        modificarUser_btn.setText("Editar Usuario");
        modificarUser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarUser_btnMouseClicked(evt);
            }
        });

        modificarUserDropDown.setBackground(new java.awt.Color(242, 242, 242));
        modificarUserDropDown.setForeground(new java.awt.Color(0, 0, 128));
        modificarUserDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        modificarUserDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUserDropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroud4Layout = new javax.swing.GroupLayout(backgroud4);
        backgroud4.setLayout(backgroud4Layout);
        backgroud4Layout.setHorizontalGroup(
            backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel5)
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidoLabel1)
                            .addComponent(dniLabel1))
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroud4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(modificarIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroud4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modificarApellidoInput, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(modificarNombreInput)))))
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoLabel1)
                            .addComponent(cargoLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modificarCorreoInput)
                            .addComponent(modificarCargoInput)
                            .addComponent(modificarTelefonoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                    .addComponent(correoLabel1))
                .addGap(41, 41, 41)
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addComponent(newPassLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud4Layout.createSequentialGroup()
                        .addComponent(newUserLabel1)
                        .addGap(26, 26, 26)))
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addComponent(modificarUser_btn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(modificarPasswordInput)
                    .addComponent(modificarUserDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(backgroud4Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroud4Layout.setVerticalGroup(
            backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud4Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel5)
                            .addComponent(newUserLabel1)
                            .addComponent(modificarUserDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarNombreInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellidoLabel1)
                                .addComponent(newPassLabel1))
                            .addComponent(modificarApellidoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniLabel1)
                            .addComponent(modificarIdInput, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoLabel1)
                            .addComponent(modificarTelefonoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(modificarPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(correoLabel1))
                    .addGroup(backgroud4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(modificarUser_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarCorreoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroud4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoLabel4)
                    .addComponent(modificarCargoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout vEditarUsuarioLayout = new javax.swing.GroupLayout(vEditarUsuario.getContentPane());
        vEditarUsuario.getContentPane().setLayout(vEditarUsuarioLayout);
        vEditarUsuarioLayout.setHorizontalGroup(
            vEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vEditarUsuarioLayout.createSequentialGroup()
                .addComponent(backgroud4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        vEditarUsuarioLayout.setVerticalGroup(
            vEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vEditarUsuarioLayout.createSequentialGroup()
                .addComponent(backgroud4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(850, 570));
        setMinimumSize(new java.awt.Dimension(850, 570));
        setPreferredSize(new java.awt.Dimension(850, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 570));

        backgroud.setBackground(new java.awt.Color(102, 204, 255));
        backgroud.setBorder(null);

        backgroundSeconColor.setBackground(new java.awt.Color(242, 242, 242));

        Titulo.setBackground(new java.awt.Color(0, 0, 128));
        Titulo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(21, 67, 96));
        Titulo.setText("Inicio de Sesion");

        Logo.setBackground(new java.awt.Color(153, 153, 153));
        Logo.setForeground(new java.awt.Color(153, 153, 153));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/png-transparent-tool-boxes-computer-icons-hand-tool-others-text-hand-logo-2.png"))); // NOI18N

        javax.swing.GroupLayout backgroundSeconColorLayout = new javax.swing.GroupLayout(backgroundSeconColor);
        backgroundSeconColor.setLayout(backgroundSeconColorLayout);
        backgroundSeconColorLayout.setHorizontalGroup(
            backgroundSeconColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundSeconColorLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundSeconColorLayout.setVerticalGroup(
            backgroundSeconColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColorLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        userLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("Usuario");

        loginUser.setBackground(new java.awt.Color(102, 204, 255));
        loginUser.setForeground(new java.awt.Color(77, 77, 77));
        loginUser.setText("Ingrese su usuario aqui");
        loginUser.setBorder(null);
        loginUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginUserMouseClicked(evt);
            }
        });

        passLabel.setBackground(new java.awt.Color(204, 255, 255));
        passLabel.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setText("Contraseña");

        loginPassword.setBackground(new java.awt.Color(102, 204, 255));
        loginPassword.setForeground(new java.awt.Color(77, 77, 77));
        loginPassword.setText("jPasswordField1");
        loginPassword.setBorder(null);
        loginPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPasswordMouseClicked(evt);
            }
        });

        oLabel.setBackground(new java.awt.Color(240, 250, 250));
        oLabel.setForeground(new java.awt.Color(0, 0, 0));
        oLabel.setText("O");

        login_btn.setBackground(new java.awt.Color(0, 123, 255));
        login_btn.setForeground(new java.awt.Color(255, 255, 255));
        login_btn.setText("Iniciar Sesion");
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });

        crearUser.setBackground(new java.awt.Color(0, 123, 255));
        crearUser.setForeground(new java.awt.Color(255, 255, 255));
        crearUser.setText("Crear Usuario");
        crearUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroudLayout = new javax.swing.GroupLayout(backgroud);
        backgroud.setLayout(backgroudLayout);
        backgroudLayout.setHorizontalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSeconColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel)
                    .addComponent(userLabel)
                    .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(loginPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroudLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(oLabel))
                    .addGroup(backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(login_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroudLayout.setVerticalGroup(
            backgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroudLayout.createSequentialGroup()
                .addComponent(backgroundSeconColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(userLabel)
                .addGap(18, 18, 18)
                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLabel)
                .addGap(18, 18, 18)
                .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_btn)
                .addGap(18, 18, 18)
                .addComponent(oLabel)
                .addGap(18, 18, 18)
                .addComponent(crearUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //reset placeholder de usuario en la ventana de inico de sesion
    private void loginUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMouseClicked
        loginUser.setText("");
        loginUser.setForeground(Color.black);
    }//GEN-LAST:event_loginUserMouseClicked

    //reset placeholder de contrasena en la ventana de inicio de sesion
    private void loginPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPasswordMouseClicked
        loginPassword.setText("");
        loginPassword.setForeground(Color.black);
    }//GEN-LAST:event_loginPasswordMouseClicked

    
    private void crearNombreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNombreInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearNombreInputActionPerformed

    private void crearApellidoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearApellidoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearApellidoInputActionPerformed

    //reset placeholder de nombre en la ventana de crear usuario
    private void crearNombreInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNombreInputMouseClicked
        crearNombreInput.setText("");
        crearNombreInput.setForeground(Color.black);
    }//GEN-LAST:event_crearNombreInputMouseClicked

    //reset placeholder de apellido en la ventana de crear usuario
    private void crearApellidoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearApellidoInputMouseClicked
        crearApellidoInput.setText("");
        crearApellidoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearApellidoInputMouseClicked

    //reset placeholder de id en la ventana de crear usuario
    private void crearIdInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearIdInputMouseClicked
        crearIdInput.setText("");
        crearIdInput.setForeground(Color.black);
    }//GEN-LAST:event_crearIdInputMouseClicked

    //reset placeholder de telefono en la ventana de crear usuario
    private void crearTelefonoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearTelefonoInputMouseClicked
        crearTelefonoInput.setText("");
        crearTelefonoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearTelefonoInputMouseClicked

    //reset placeholder de correo en la ventana de crear usuario
    private void crearCorreoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCorreoInputMouseClicked
        crearCorreoInput.setText("");
        crearCorreoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearCorreoInputMouseClicked

    //reset placeholder de cargo en la ventana de crear usuario
    private void crearCargoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCargoInputMouseClicked
        crearCargoInput.setText("");
        crearCargoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearCargoInputMouseClicked

    //reset placeholder de usuario en la ventana de crear usuario
    private void crearUserInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUserInputMouseClicked
        crearUserInput.setText("");
        crearUserInput.setForeground(Color.black);
    }//GEN-LAST:event_crearUserInputMouseClicked

    //reset placeholder de contrasena en la ventana de crear usuario
    private void crearPasswordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearPasswordInputMouseClicked
        crearPasswordInput.setText("");
        crearPasswordInput.setForeground(Color.black);
    }//GEN-LAST:event_crearPasswordInputMouseClicked

    //boton para crear nuevo usuario 
    private void crearUser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUser_btnMouseClicked
        boolean existe;
        
        if (existe = existeUser(crearUserInput.getText())){
        
            JOptionPane.showMessageDialog(null, "Ya existe un usuario registrado con este nombre");
        
        }
        else if(crearNombreInput.getText().contentEquals("")||crearNombreInput.getText().contentEquals("Ingrese su nombre") ||
                crearApellidoInput.getText().contentEquals("")||crearApellidoInput.getText().contentEquals("Ingrese su apellido") ||
                crearIdInput.getText().contentEquals("")||crearIdInput.getText().contentEquals("Ingrese su numero de identidad") ||
                crearTelefonoInput.getText().contentEquals("")||crearTelefonoInput.getText().contentEquals("Ingrese su telefono") ||
                crearCorreoInput.getText().contentEquals("")||crearCorreoInput.getText().contentEquals("Ingrese su correo") ||
                crearCargoInput.getText().contentEquals("")||crearCargoInput.getText().contentEquals("Ingrese su cargo") ||
                crearUserInput.getText().contentEquals("")||crearUserInput.getText().contentEquals("Ingrese su usuario") ||
                crearPasswordInput.getText().contentEquals("")||crearPasswordInput.getText().contentEquals("Ingrese su contraseña"))
        {
            JOptionPane.showMessageDialog(null, "Informacion incompleta\n Por favor llenar todos los espacios");
        
        }
        else{
        
            Usuario newuser = new Usuario (crearNombreInput.getText(),crearApellidoInput.getText(),crearIdInput.getText(),crearTelefonoInput.getText(),crearCorreoInput.getText(),crearUserInput.getText(),crearPasswordInput.getText(),crearCargoInput.getText());
            users.add(newuser);
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
            System.out.println(users.get(0).getUser());
            resetPlaceHolderCrearUser();
            this.setVisible(true);
            vCrearUsuario.dispose();
        }
    }//GEN-LAST:event_crearUser_btnMouseClicked

    // boton de volver de la ventana de crear usuario al menu de inicio de sesion
    private void volverCrearUser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverCrearUser_btnMouseClicked
        vCrearUsuario.dispose();
        resetPlaceHolderCrearUser();
        this.setVisible(true);
    }//GEN-LAST:event_volverCrearUser_btnMouseClicked

    // boton para ingresar
    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        
        boolean entro=false;
        for(int i=0;i<users.size();i++){
            if (users.get(i).getUser().contentEquals(loginUser.getText()) && users.get(i).getPassword().contentEquals(loginPassword.getText())){
                this.setVisible(false);
                vMenuPrincipal.setVisible(true);
                vMenuPrincipal.setLocationRelativeTo(null);
                currentUser = users.get(i);
                entro=true;
                bienvendoUser.setText("Bienvenido "+currentUser.getNombre());
                resetPlaceHolderLogin();
            }
        }
        if (entro==false){
        
            JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos");
            
        }
        
    }//GEN-LAST:event_login_btnMouseClicked

    // boton para entrar a la ventana de crear usuario
    private void crearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUserMouseClicked

        this.setVisible(false);
        vCrearUsuario.setVisible(true);
        vCrearUsuario.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_crearUserMouseClicked

    //boton para cerrar sesion desde el menu principal
    private void cerrarSesion_MP_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesion_MP_btnMouseClicked
        vMenuPrincipal.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_cerrarSesion_MP_btnMouseClicked

    // boton de volver al menu principal desde la ventana de maquinas
    private void Volver_MP_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volver_MP_btn2MouseClicked
        vMaquinas.dispose();
        vMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_Volver_MP_btn2MouseClicked

    // boton para volver al menu primcipal desde la ventana de tareas
    private void Volver_MP_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volver_MP_btnMouseClicked
        vTareas.dispose();
        vMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_Volver_MP_btnMouseClicked

    // boton para entrar a la ventana de maquinas desde el menu principal
    private void maquinaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maquinaLabelMouseClicked
        vMaquinas.setVisible(true);
        vMenuPrincipal.setVisible(false);
        tablaMaquinas.setModel(modelo);
    }//GEN-LAST:event_maquinaLabelMouseClicked

    //boton para entrar a la ventana de tareas desde el menu principal
    private void tareasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareasLabelMouseClicked
        vTareas.setVisible(true);
        vMenuPrincipal.setVisible(false);
        tablaTareas.setModel(modeloTareas);
    }//GEN-LAST:event_tareasLabelMouseClicked

    //boton de volver de la ventana de crear maquina
    private void volverCrearMaquina_maquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverCrearMaquina_maquina_btnMouseClicked
        vCrearMaquina.dispose();
        vMaquinas.setVisible(true);
    }//GEN-LAST:event_volverCrearMaquina_maquina_btnMouseClicked

    // reset placeholder de nombre al crear maquina nueva
    private void crearNombreMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNombreMaquinaInputMouseClicked
        crearNombreMaquinaInput.setText("");
    }//GEN-LAST:event_crearNombreMaquinaInputMouseClicked

    private void crearNombreMaquinaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNombreMaquinaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearNombreMaquinaInputActionPerformed

    //reset placeholder de categoria al crear maquina nueva
    private void crearCategoriaMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCategoriaMaquinaInputMouseClicked
        crearCategoriaMaquinaInput.setText("");
    }//GEN-LAST:event_crearCategoriaMaquinaInputMouseClicked

    private void crearCategoriaMaquinaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCategoriaMaquinaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCategoriaMaquinaInputActionPerformed

    // reset placeholder de voltaje al crear maquina nueva
    private void crearVoltajeMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearVoltajeMaquinaInputMouseClicked
        crearVoltajeMaquinaInput.setText("");
    }//GEN-LAST:event_crearVoltajeMaquinaInputMouseClicked

    //reset placeholder de motor al crear maquina nueva
    private void crearMotorInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMotorInputMouseClicked
        crearMotorInput.setText("");
    }//GEN-LAST:event_crearMotorInputMouseClicked

    //boton para crear una maquina nueva
    private void crearNewMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNewMaquina_btnMouseClicked
        
        if(crearNombreMaquinaInput.getText().contentEquals("") || crearNombreMaquinaInput.getText().contentEquals("Ingrese el nombre") ||
           crearCategoriaMaquinaInput.getText().contentEquals("") || crearCategoriaMaquinaInput.getText().contentEquals("Ingrese la categoria") ||
                crearVoltajeMaquinaInput.getText().contentEquals("") || crearVoltajeMaquinaInput.getText().contentEquals("Ingrese el voltaje en que trabaja") ||
                crearMotorInput.getText().contentEquals("") || crearMotorInput.getText().contentEquals("Ingrese la potencia del motor")
        ){
            
            JOptionPane.showMessageDialog(null, "Informacion incompleta\n Por favor llenar todos los espacios");

        }else{
        
            codigoMaquina.setText(crearNombreMaquinaInput.getText().substring(0, 5)+maquinas.size()+1);
            Maquina newmaquina = new Maquina(crearNombreMaquinaInput.getText(),crearCategoriaMaquinaInput.getText(),Integer.parseInt(crearVoltajeMaquinaInput.getText()),Integer.parseInt(crearMotorInput.getText()),"Activa",codigoMaquina.getText());
            maquinas.add(newmaquina);

            agregarMaquinaTabla();
            eliminarMaquinaDropDown();
            maquinaTareaDropDown();
            


            JOptionPane.showMessageDialog(null, "Maquina agrega con exito");
            vCrearMaquina.dispose();
            vMaquinas.setVisible(true);
            resetPlaceHolderCrearMaquina();
        
        }
        
    }//GEN-LAST:event_crearNewMaquina_btnMouseClicked

    //boton para entrar a la ventana de crear maquina
    private void crearMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMaquina_btnMouseClicked
        vMaquinas.setVisible(false);
        vCrearMaquina.setVisible(true);
        
    }//GEN-LAST:event_crearMaquina_btnMouseClicked

    //boton para entrar a la ventana de eliminar maquina
    private void eliminarMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMaquina_btnMouseClicked
        vEliminarMaquina.setVisible(true);
        vMaquinas.setVisible(false);
        
    }//GEN-LAST:event_eliminarMaquina_btnMouseClicked
    
    //boton para volver al menu de maquinas en ventana de eliminar maquina    
    private void volverEliminarMaquina_maquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverEliminarMaquina_maquina_btnMouseClicked
        vEliminarMaquina.dispose();
        vMaquinas.setVisible(true);
    }//GEN-LAST:event_volverEliminarMaquina_maquina_btnMouseClicked

    //boton para eliminar maquina
    private void eliminarMaquinabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMaquinabtnMouseClicked
        
        for(int i=0; i<maquinas.size();i++){
            if(maquinas.get(i).getCodigoMaquina().contentEquals(eliminarMaquinaDropDown.getSelectedItem().toString())){
                maquinas.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Maquina eliminado con exito");
        
        agregarMaquinaTabla();
        eliminarMaquinaDropDown();
        maquinaTareaDropDown();
        editarMaquinaDropDown();
        
        
    }//GEN-LAST:event_eliminarMaquinabtnMouseClicked

    //boton de volver de crear tarea al menu de tareas
    private void volverCrearTarea_tarea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverCrearTarea_tarea_btnMouseClicked
        vCrearTarea.dispose();
        vTareas.setVisible(true);
        
    }//GEN-LAST:event_volverCrearTarea_tarea_btnMouseClicked

    // reset placeholder de nombre en creacion de tarea
    private void crearNombreTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNombreTareaInputMouseClicked
        crearNombreTareaInput.setText("");
    }//GEN-LAST:event_crearNombreTareaInputMouseClicked

    private void crearNombreTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNombreTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearNombreTareaInputActionPerformed

    // reset placeholder de tipo de mantenimiento en creacion de tarea
    private void crearTipoTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearTipoTareaInputMouseClicked
        crearTipoTareaInput.setText("");
    }//GEN-LAST:event_crearTipoTareaInputMouseClicked

    private void crearTipoTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTipoTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearTipoTareaInputActionPerformed

    //boton para crear tarea nueva
    private void crearNewTarea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNewTarea_btnMouseClicked
        
        if(crearNombreTareaInput.getText().contentEquals("") || crearNombreTareaInput.getText().contentEquals("Ingrese el nombre") ||
           crearTipoTareaInput.getText().contentEquals("") || crearTipoTareaInput.getText().contentEquals("Ingrese la categoria") ||
                crearFechaTareaInput.getText().contentEquals("") || crearFechaTareaInput.getText().contentEquals("01/01/01") ||
                crearResponsableTareaInput.getText().contentEquals("") || crearResponsableTareaInput.getText().contentEquals("Ingrese el responsable")
        ){
        
        }
        else {
        
            Tarea newTarea = new Tarea(crearNombreTareaInput.getText(),crearTipoTareaInput.getText(),maquinaTareaDropDown.getSelectedItem().toString(),crearFechaTareaInput.getText(),"En ejecucion",crearResponsableTareaInput.getText());
            tareas.add(newTarea);

            agregarTareaTabla();

            for(int i=0;i<maquinas.size();i++){


                if(maquinas.get(i).getCodigoMaquina().contentEquals(maquinaTareaDropDown.getSelectedItem().toString())){

                    maquinas.get(i).setEstado("En mantenimiento");

                }


            }
            agregarMaquinaTabla();

            JOptionPane.showMessageDialog(null, "La tarea se agrego con exito");
            vCrearTarea.dispose();
            vTareas.setVisible(true);
            resetPlaceHolderCrearTarea();
            
        }
        
    }//GEN-LAST:event_crearNewTarea_btnMouseClicked

    //boton para entrar a la venta de crear tarea nueva
    private void crearTarea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearTarea_btnMouseClicked
        vCrearTarea.setVisible(true);
        vTareas.setVisible(false);
    }//GEN-LAST:event_crearTarea_btnMouseClicked

    //reset placeholder de fecha en creacion de tarea
    private void crearFechaTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearFechaTareaInputMouseClicked
        crearFechaTareaInput.setText("");
    }//GEN-LAST:event_crearFechaTareaInputMouseClicked

    private void crearResponsableTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearResponsableTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearResponsableTareaInputActionPerformed

    private void crearResponsableTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearResponsableTareaInputMouseClicked
        crearResponsableTareaInput.setText("");
    }//GEN-LAST:event_crearResponsableTareaInputMouseClicked

    private void volverModificarMaquina_maquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverModificarMaquina_maquina_btnMouseClicked
        vEditarMaquina.dispose();
        vMaquinas.setVisible(true);
    }//GEN-LAST:event_volverModificarMaquina_maquina_btnMouseClicked

    private void modificarNombreMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarNombreMaquinaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarNombreMaquinaInputMouseClicked

    private void modificarNombreMaquinaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNombreMaquinaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarNombreMaquinaInputActionPerformed

    private void modificarCategoriaMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCategoriaMaquinaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarCategoriaMaquinaInputMouseClicked

    private void modificarCategoriaMaquinaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCategoriaMaquinaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarCategoriaMaquinaInputActionPerformed

    private void modificarVoltajeMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarVoltajeMaquinaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarVoltajeMaquinaInputMouseClicked

    private void modificarMotorInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMotorInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMotorInputMouseClicked

    private void modificarNewMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarNewMaquina_btnMouseClicked
        
     for(int i=0;i<maquinas.size();i++){
        
            if(maquinas.get(i).getCodigoMaquina().contentEquals(modificarMaquinaDropDown.getSelectedItem().toString())){
            
                maquinas.get(i).setNombre(modificarNombreMaquinaInput.getText());
                maquinas.get(i).setCategoria(modificarCategoriaMaquinaInput.getText());
                maquinas.get(i).setVoltaje(Integer.parseInt(modificarVoltajeMaquinaInput.getText()));
                maquinas.get(i).setMotor(Integer.parseInt(modificarMotorInput.getText()));
                
            }
        } 
     
     agregarMaquinaTabla();
     vEditarMaquina.dispose();
     vMaquinas.setVisible(true);

    }//GEN-LAST:event_modificarNewMaquina_btnMouseClicked

    private void modificarMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMaquina_btnMouseClicked
        vEditarMaquina.setVisible(true);
        vMaquinas.setVisible(false);
        
        
        
        
        
    }//GEN-LAST:event_modificarMaquina_btnMouseClicked

    private void modificarMaquinaDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMaquinaDropDownActionPerformed
        
        for(int i=0;i<maquinas.size();i++){
        
            if(maquinas.get(i).getCodigoMaquina().contentEquals(modificarMaquinaDropDown.getSelectedItem().toString())){
            
                modificarNombreMaquinaInput.setText(maquinas.get(i).getNombre());
                modificarCategoriaMaquinaInput.setText(maquinas.get(i).getCategoria());
                modificarVoltajeMaquinaInput.setText(String.valueOf(maquinas.get(i).getVoltaje()));
                modificarMotorInput.setText(String.valueOf(maquinas.get(i).getMotor()));
                
            }
        }

    }//GEN-LAST:event_modificarMaquinaDropDownActionPerformed

    private void volverModificarTarea_tarea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverModificarTarea_tarea_btnMouseClicked
        
        vEditarTarea.dispose();
        vTareas.setVisible(true);
        
    }//GEN-LAST:event_volverModificarTarea_tarea_btnMouseClicked

    private void modificarMaquinaTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMaquinaTareaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMaquinaTareaInputMouseClicked

    private void modificarMaquinaTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMaquinaTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarMaquinaTareaInputActionPerformed

    private void modificarTipoTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTipoTareaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarTipoTareaInputMouseClicked

    private void modificarTipoTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTipoTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarTipoTareaInputActionPerformed

    private void modificarNewTarea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarNewTarea_btnMouseClicked
        
        for(int i=0;i<tareas.size();i++){
        
            if(tareas.get(i).getNombreTarea().contentEquals(modificarNombreTareaDropDown.getSelectedItem().toString())){
            
                tareas.get(i).setTipoMantenimiento(modificarTipoTareaInput.getText());
                tareas.get(i).setFecha(modificarFechaTareaInput.getText());
                tareas.get(i).setResponsable(modificarResponsableTareaInput.getText());
                tareas.get(i).setEstadoTarea(modificarEstadoTareaInput.getText());
                
                if(modificarEstadoTareaInput.getText().contentEquals("Completada")){
                
                    for(int j=0;j<maquinas.size();j++){

                        if(maquinas.get(j).getCodigoMaquina().contentEquals(tareas.get(i).getMaquina())){
                            maquinas.get(j).setEstado("Activa");

                        }

                }
                
                
                }

            }
        } 
        
        agregarMaquinaTabla();
        agregarTareaTabla();
        vEditarTarea.dispose();
        vTareas.setVisible(true);
    }//GEN-LAST:event_modificarNewTarea_btnMouseClicked

    private void modificarFechaTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarFechaTareaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarFechaTareaInputMouseClicked

    private void modificarResponsableTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarResponsableTareaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarResponsableTareaInputMouseClicked

    private void modificarResponsableTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarResponsableTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarResponsableTareaInputActionPerformed

    private void editarTarea_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarTarea_btnMouseClicked
        
        vEditarTarea.setVisible(true);
        vTareas.setVisible(false);
        
        editarTareaNombreDropDown();
    }//GEN-LAST:event_editarTarea_btnMouseClicked

    private void modificarNombreTareaDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNombreTareaDropDownActionPerformed
        
        for(int i=0;i<tareas.size();i++){
        
            if(tareas.get(i).getNombreTarea().contentEquals(modificarNombreTareaDropDown.getSelectedItem().toString())){
            
                modificarTipoTareaInput.setText(tareas.get(i).getTipoMantenimiento());
                modificarMaquinaTareaInput.setText(tareas.get(i).getMaquina());
                modificarFechaTareaInput.setText(tareas.get(i).getFecha());
                modificarResponsableTareaInput.setText(tareas.get(i).getResponsable());
                modificarEstadoTareaInput.setText(tareas.get(i).getEstadoTarea());

            }
        }
        
        
        
    }//GEN-LAST:event_modificarNombreTareaDropDownActionPerformed

    private void modificarEstadoTareaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarEstadoTareaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarEstadoTareaInputMouseClicked

    private void modificarEstadoTareaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEstadoTareaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarEstadoTareaInputActionPerformed

    private void volverEditarUser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverEditarUser_btnMouseClicked
        vEditarUsuario.dispose();
        vMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_volverEditarUser_btnMouseClicked

    private void modificarNombreInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarNombreInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarNombreInputMouseClicked

    private void modificarNombreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNombreInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarNombreInputActionPerformed

    private void modificarApellidoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarApellidoInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarApellidoInputMouseClicked

    private void modificarApellidoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarApellidoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarApellidoInputActionPerformed

    private void modificarIdInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarIdInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarIdInputMouseClicked

    private void modificarTelefonoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTelefonoInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarTelefonoInputMouseClicked

    private void modificarCorreoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCorreoInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarCorreoInputMouseClicked

    private void modificarPasswordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarPasswordInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarPasswordInputMouseClicked

    private void modificarCargoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCargoInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarCargoInputMouseClicked

    private void modificarUser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarUser_btnMouseClicked
        
        for(int i=0;i<users.size();i++){
        
            if(users.get(i).getUser().contentEquals(modificarUserDropDown.getSelectedItem().toString())){
            
                users.get(i).setNombre(modificarNombreInput.getText());
                users.get(i).setapellido(modificarApellidoInput.getText());
                users.get(i).setId(modificarIdInput.getText());
                users.get(i).setTelefono(modificarTelefonoInput.getText());
                users.get(i).setCorreo(modificarCorreoInput.getText());
                users.get(i).setcargo(modificarCargoInput.getText());
                users.get(i).setPassword(modificarPasswordInput.getText());
                
            }
        
        }
        
        
        
        vEditarUsuario.dispose();
        vMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_modificarUser_btnMouseClicked

    //boton para entrar a la ventana de editar usuario desde el menu principal
    private void editUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUserLabelMouseClicked
        vMenuPrincipal.setVisible(false);
        vEditarUsuario.setVisible(true);
        editarUserDropDown();
    }//GEN-LAST:event_editUserLabelMouseClicked

    private void modificarUserDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUserDropDownActionPerformed
        
        for (int i=0;i<users.size();i++){
        
            if(users.get(i).getUser().contentEquals(modificarUserDropDown.getSelectedItem().toString())){
            
                modificarNombreInput.setText(users.get(i).getNombre());
                modificarApellidoInput.setText(users.get(i).getapellido());
                modificarIdInput.setText(users.get(i).getId());
                modificarTelefonoInput.setText(users.get(i).getTelefono());
                modificarCorreoInput.setText(users.get(i).getCorreo());
                modificarCargoInput.setText(users.get(i).getcargo());
                modificarPasswordInput.setText(users.get(i).getPassword());
            
            }
        
        
        
        }
        
        
        
    }//GEN-LAST:event_modificarUserDropDownActionPerformed

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panta_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panta_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panta_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panta_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panta_inicial().setVisible(true);
            }
        });
        
        users.add(admins);
        
        
        
    }

    static boolean existeUser (String user){
        boolean existe=false;
    
        for(int i=0; i<users.size();i++){
        
            if (users.get(i).getUser().contentEquals(user)){
            
                existe = true;
            
            }
        
        }
    
        return existe;
    }
    
    public void resetPlaceHolderLogin(){
        loginUser.setText("Ingrese su usuario");
        loginPassword.setText("*************");

    }
    public void resetPlaceHolderCrearUser(){
    
        crearNombreInput.setText("Ingrese su nombre");
        crearApellidoInput.setText("Ingrese su apellido");
        crearIdInput.setText("Ingrese su numero de identidad");
        crearTelefonoInput.setText("Ingrese su telefono");
        crearCorreoInput.setText("Ingrese su correo");
        crearCargoInput.setText("Ingrese su cargo");
        crearUserInput.setText("Ingrese su usuario");
        crearPasswordInput.setText("Ingrese su contraseña");
    }
    
    public void resetPlaceHolderCrearMaquina(){
    
        crearNombreMaquinaInput.setText("Ingrese el nombre");
        crearCategoriaMaquinaInput.setText("Ingrese la categoria");
        crearVoltajeMaquinaInput.setText("Ingrese el voltaje en el que trabaja");
        crearMotorInput.setText("Ingrese la potencia del motor (HP)");
        codigoMaquina.setText("Codigo Maquina");

    }    
    public void resetPlaceHolderCrearTarea(){
    
        crearNombreTareaInput.setText("Ingrese el nombre");
        crearTipoTareaInput.setText("Ingrese el tipo de mantenimiento");
        crearFechaTareaInput.setText("01/01/01");
        crearResponsableTareaInput.setText("Ingrese el responsable");

    }
    
    
    public void agregarMaquinaTabla(){
    
    modelo.setRowCount(0);
        
        for (Maquina maquina : maquinas){
            Object[] fila = {
                maquina.getNombre(),
                maquina.getCategoria(),
                maquina.getVoltaje(),
                maquina.getMotor(),
                maquina.getCodigoMaquina(),
                maquina.getEstado()
            };
            modelo.addRow(fila);
        
        }
    
    
    }
    public void agregarTareaTabla(){
    
        modeloTareas.setRowCount(0);
        
        for (Tarea tarea : tareas){
            Object[] fila = {
                tarea.getNombreTarea(),
                tarea.getTipoMantenimiento(),
                tarea.getMaquina(),
                tarea.getFecha(),
                tarea.getEstadoTarea(),
                tarea.getResponsable()
                
            };
            modeloTareas.addRow(fila);
        
        }
    }
    
    public void eliminarMaquinaDropDown(){
        
        eliminarMaquinaDropDown.removeAllItems();
        for (Maquina maquina : maquinas) {
            eliminarMaquinaDropDown.addItem(maquina.getCodigoMaquina());
        }
        
    }
    public void eliminarTareaDropDown(){
        eliminarMaquinaDropDown.removeAllItems();
        for (Tarea tarea : tareas) {
            eliminarMaquinaDropDown.addItem(tarea.getNombreTarea());
        }
        

    
    
    
    }
    
    public void maquinaTareaDropDown(){
    
        maquinaTareaDropDown.removeAllItems();
        for (Maquina maquina : maquinas) {
            maquinaTareaDropDown.addItem(maquina.getCodigoMaquina());
        }
        

    }
    
    public void editarMaquinaDropDown(){
        
        modificarMaquinaDropDown.removeAllItems();
        for (Maquina maquina : maquinas) {
            modificarMaquinaDropDown.addItem(maquina.getCodigoMaquina());
        }
        
    }
    public void editarTareaNombreDropDown(){
    
        modificarNombreTareaDropDown.removeAllItems();
        for (Tarea tarea : tareas){
            modificarNombreTareaDropDown.addItem(tarea.getNombreTarea());
        
        }
    
    }
    public void editarUserDropDown(){
    
        modificarUserDropDown.removeAllItems();
        for (Usuario user : users){
            modificarUserDropDown.addItem(user.getUser());
        }
    
    
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo10;
    private javax.swing.JLabel Logo11;
    private javax.swing.JLabel Logo12;
    private javax.swing.JLabel Logo13;
    private javax.swing.JLabel Logo14;
    private javax.swing.JLabel Logo16;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel Logo3;
    private javax.swing.JLabel Logo4;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo10;
    private javax.swing.JLabel Titulo11;
    private javax.swing.JLabel Titulo12;
    private javax.swing.JLabel Titulo13;
    private javax.swing.JLabel Titulo14;
    private javax.swing.JLabel Titulo16;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JButton Volver_MP_btn;
    private javax.swing.JButton Volver_MP_btn2;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JLabel apellidoLabel1;
    private javax.swing.JPanel backgroud;
    private javax.swing.JPanel backgroud1;
    private javax.swing.JPanel backgroud10;
    private javax.swing.JPanel backgroud11;
    private javax.swing.JPanel backgroud12;
    private javax.swing.JPanel backgroud13;
    private javax.swing.JPanel backgroud14;
    private javax.swing.JPanel backgroud16;
    private javax.swing.JPanel backgroud2;
    private javax.swing.JPanel backgroud3;
    private javax.swing.JPanel backgroud4;
    private javax.swing.JPanel backgroundSeconColor;
    private javax.swing.JPanel backgroundSeconColor1;
    private javax.swing.JPanel backgroundSeconColor10;
    private javax.swing.JPanel backgroundSeconColor11;
    private javax.swing.JPanel backgroundSeconColor12;
    private javax.swing.JPanel backgroundSeconColor13;
    private javax.swing.JPanel backgroundSeconColor14;
    private javax.swing.JPanel backgroundSeconColor16;
    private javax.swing.JPanel backgroundSeconColor2;
    private javax.swing.JPanel backgroundSeconColor3;
    private javax.swing.JPanel backgroundSeconColor4;
    private javax.swing.JLabel bienvendoUser;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JLabel cargoLabel1;
    private javax.swing.JLabel cargoLabel2;
    private javax.swing.JLabel cargoLabel3;
    private javax.swing.JLabel cargoLabel4;
    private javax.swing.JLabel cargoLabel5;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel categoriaLabel1;
    private javax.swing.JButton cerrarSesion_MP_btn;
    private javax.swing.JLabel codigoMaquina;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JLabel correoLabel1;
    private javax.swing.JTextField crearApellidoInput;
    private javax.swing.JTextField crearCargoInput;
    private javax.swing.JTextField crearCategoriaMaquinaInput;
    private javax.swing.JTextField crearCorreoInput;
    private javax.swing.JFormattedTextField crearFechaTareaInput;
    private javax.swing.JTextField crearIdInput;
    private javax.swing.JButton crearMaquina_btn;
    private javax.swing.JTextField crearMotorInput;
    private javax.swing.JButton crearNewMaquina_btn;
    private javax.swing.JButton crearNewTarea_btn;
    private javax.swing.JTextField crearNombreInput;
    private javax.swing.JTextField crearNombreMaquinaInput;
    private javax.swing.JTextField crearNombreTareaInput;
    private javax.swing.JTextField crearPasswordInput;
    private javax.swing.JTextField crearResponsableTareaInput;
    private javax.swing.JButton crearTarea_btn;
    private javax.swing.JTextField crearTelefonoInput;
    private javax.swing.JTextField crearTipoTareaInput;
    private javax.swing.JButton crearUser;
    private javax.swing.JTextField crearUserInput;
    private javax.swing.JButton crearUser_btn;
    private javax.swing.JTextField crearVoltajeMaquinaInput;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel dniLabel1;
    private javax.swing.JLabel editUserLabel;
    private javax.swing.JPanel editUser_btn;
    private javax.swing.JButton editarTarea_btn;
    private javax.swing.JComboBox<String> eliminarMaquinaDropDown;
    private javax.swing.JButton eliminarMaquina_btn;
    private javax.swing.JButton eliminarMaquinabtn;
    private javax.swing.JButton eliminarTarea_btn;
    private javax.swing.JLabel estadoTarea;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fechaLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUser;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel maquinaLabel;
    private javax.swing.JComboBox<String> maquinaTareaDropDown;
    private javax.swing.JPanel maquinas_btn;
    private javax.swing.JTextField modificarApellidoInput;
    private javax.swing.JTextField modificarCargoInput;
    private javax.swing.JTextField modificarCategoriaMaquinaInput;
    private javax.swing.JTextField modificarCorreoInput;
    private javax.swing.JTextField modificarEstadoTareaInput;
    private javax.swing.JFormattedTextField modificarFechaTareaInput;
    private javax.swing.JTextField modificarIdInput;
    private javax.swing.JComboBox<String> modificarMaquinaDropDown;
    private javax.swing.JTextField modificarMaquinaTareaInput;
    private javax.swing.JButton modificarMaquina_btn;
    private javax.swing.JTextField modificarMotorInput;
    private javax.swing.JButton modificarNewMaquina_btn;
    private javax.swing.JButton modificarNewTarea_btn;
    private javax.swing.JTextField modificarNombreInput;
    private javax.swing.JTextField modificarNombreMaquinaInput;
    private javax.swing.JComboBox<String> modificarNombreTareaDropDown;
    private javax.swing.JTextField modificarPasswordInput;
    private javax.swing.JTextField modificarResponsableTareaInput;
    private javax.swing.JTextField modificarTelefonoInput;
    private javax.swing.JTextField modificarTipoTareaInput;
    private javax.swing.JComboBox<String> modificarUserDropDown;
    private javax.swing.JButton modificarUser_btn;
    private javax.swing.JTextField modificarVoltajeMaquinaInput;
    private javax.swing.JLabel motorLabel;
    private javax.swing.JLabel motorLabel1;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JLabel newPassLabel1;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JLabel newUserLabel1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JLabel nombreLabel2;
    private javax.swing.JLabel nombreLabel3;
    private javax.swing.JLabel nombreLabel4;
    private javax.swing.JLabel nombreLabel5;
    private javax.swing.JLabel nombreLabel6;
    private javax.swing.JLabel oLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTable tablaMaquinas;
    private javax.swing.JTable tablaTareas;
    private javax.swing.JLabel tareasLabel;
    private javax.swing.JPanel tareas_btn;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel telefonoLabel1;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JLabel tipoLabel1;
    private javax.swing.JLabel userLabel;
    private javax.swing.JDialog vCrearMaquina;
    private javax.swing.JDialog vCrearTarea;
    private javax.swing.JDialog vCrearUsuario;
    private javax.swing.JDialog vEditarMaquina;
    private javax.swing.JDialog vEditarTarea;
    private javax.swing.JDialog vEditarUsuario;
    private javax.swing.JDialog vEliminarMaquina;
    private javax.swing.JFrame vMaquinas;
    private javax.swing.JFrame vMenuPrincipal;
    private javax.swing.JFrame vTareas;
    private javax.swing.JLabel voltajeLabel;
    private javax.swing.JLabel voltajeLabel1;
    private javax.swing.JLabel voltajeLabel2;
    private javax.swing.JLabel voltajeLabel4;
    private javax.swing.JButton volverCrearMaquina_maquina_btn;
    private javax.swing.JButton volverCrearTarea_tarea_btn;
    private javax.swing.JButton volverCrearUser_btn;
    private javax.swing.JButton volverEditarUser_btn;
    private javax.swing.JButton volverEliminarMaquina_maquina_btn;
    private javax.swing.JButton volverModificarMaquina_maquina_btn;
    private javax.swing.JButton volverModificarTarea_tarea_btn;
    // End of variables declaration//GEN-END:variables
}
