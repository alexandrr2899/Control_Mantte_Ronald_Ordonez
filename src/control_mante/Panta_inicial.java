/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package control_mante;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
   
    static Usuario currentUser;
    
    static Usuario admins = new Usuario("Alexander","Ordonez","0613199900105","97922697","alexander.ord99@gmail.com","Alexandrr","0613","");
    
    
    
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
        jButton2 = new javax.swing.JButton();
        vTareas = new javax.swing.JFrame();
        backgroud10 = new javax.swing.JPanel();
        backgroundSeconColor10 = new javax.swing.JPanel();
        Titulo10 = new javax.swing.JLabel();
        Logo10 = new javax.swing.JLabel();
        Volver_MP_btn = new javax.swing.JButton();
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

        vCrearUsuario.setLocationByPlatform(true);
        vCrearUsuario.setMaximumSize(new java.awt.Dimension(664, 467));
        vCrearUsuario.setMinimumSize(new java.awt.Dimension(664, 467));
        vCrearUsuario.setPreferredSize(new java.awt.Dimension(664, 467));
        vCrearUsuario.setSize(new java.awt.Dimension(664, 467));

        backgroud1.setBackground(new java.awt.Color(102, 204, 255));
        backgroud1.setBorder(null);
        backgroud1.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud1.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor1.setBackground(new java.awt.Color(242, 242, 242));

        Titulo1.setBackground(new java.awt.Color(0, 0, 128));
        Titulo1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(0, 0, 0));
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
                            .addGroup(backgroud1Layout.createSequentialGroup()
                                .addComponent(crearUser_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(backgroud1Layout.createSequentialGroup()
                        .addComponent(crearPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        vMenuPrincipal.setMaximumSize(new java.awt.Dimension(850, 500));
        vMenuPrincipal.setMinimumSize(new java.awt.Dimension(850, 500));
        vMenuPrincipal.setPreferredSize(new java.awt.Dimension(850, 500));
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

        vMaquinas.setMaximumSize(new java.awt.Dimension(850, 500));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 588, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundSeconColor3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
        tablaMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Voltaje", "Motor", "Estado", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMaquinas);

        crearMaquina_btn.setBackground(new java.awt.Color(0, 123, 255));
        crearMaquina_btn.setForeground(new java.awt.Color(255, 255, 255));
        crearMaquina_btn.setText("Crear Maquina");
        crearMaquina_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMaquina_btnMouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 123, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Modificar Maquina");

        javax.swing.GroupLayout backgroud3Layout = new javax.swing.GroupLayout(backgroud3);
        backgroud3.setLayout(backgroud3Layout);
        backgroud3Layout.setHorizontalGroup(
            backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSeconColor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroud3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearMaquina_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        backgroud3Layout.setVerticalGroup(
            backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud3Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroud3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroud3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(backgroud3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearMaquina_btn)
                        .addGap(96, 96, 96)
                        .addComponent(jButton2)
                        .addGap(153, 153, 153))))
        );

        javax.swing.GroupLayout vMaquinasLayout = new javax.swing.GroupLayout(vMaquinas.getContentPane());
        vMaquinas.getContentPane().setLayout(vMaquinasLayout);
        vMaquinasLayout.setHorizontalGroup(
            vMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud3, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        vMaquinasLayout.setVerticalGroup(
            vMaquinasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        vTareas.setMaximumSize(new java.awt.Dimension(850, 500));
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
                        .addContainerGap(363, Short.MAX_VALUE)
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

        javax.swing.GroupLayout backgroud10Layout = new javax.swing.GroupLayout(backgroud10);
        backgroud10.setLayout(backgroud10Layout);
        backgroud10Layout.setHorizontalGroup(
            backgroud10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundSeconColor10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroud10Layout.setVerticalGroup(
            backgroud10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroud10Layout.createSequentialGroup()
                .addComponent(backgroundSeconColor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout vTareasLayout = new javax.swing.GroupLayout(vTareas.getContentPane());
        vTareas.getContentPane().setLayout(vTareasLayout);
        vTareasLayout.setHorizontalGroup(
            vTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud10, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        vTareasLayout.setVerticalGroup(
            vTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vCrearMaquina.setLocationByPlatform(true);
        vCrearMaquina.setMaximumSize(new java.awt.Dimension(650, 504));
        vCrearMaquina.setMinimumSize(new java.awt.Dimension(650, 504));
        vCrearMaquina.setPreferredSize(new java.awt.Dimension(650, 504));
        vCrearMaquina.setSize(new java.awt.Dimension(650, 504));

        backgroud11.setBackground(new java.awt.Color(102, 204, 255));
        backgroud11.setBorder(null);
        backgroud11.setMaximumSize(new java.awt.Dimension(664, 467));
        backgroud11.setMinimumSize(new java.awt.Dimension(664, 467));

        backgroundSeconColor11.setBackground(new java.awt.Color(242, 242, 242));

        Titulo11.setBackground(new java.awt.Color(0, 0, 128));
        Titulo11.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Titulo11.setForeground(new java.awt.Color(0, 0, 0));
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
        codigoMaquina.setForeground(new java.awt.Color(255, 255, 255));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

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
                .addContainerGap(416, Short.MAX_VALUE)
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
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUserMouseClicked
        loginUser.setText("");
        loginUser.setForeground(Color.black);
    }//GEN-LAST:event_loginUserMouseClicked

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

    private void crearNombreInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNombreInputMouseClicked
        crearNombreInput.setText("");
        crearNombreInput.setForeground(Color.black);
    }//GEN-LAST:event_crearNombreInputMouseClicked

    private void crearApellidoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearApellidoInputMouseClicked
        crearApellidoInput.setText("");
        crearApellidoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearApellidoInputMouseClicked

    private void crearIdInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearIdInputMouseClicked
        crearIdInput.setText("");
        crearIdInput.setForeground(Color.black);
    }//GEN-LAST:event_crearIdInputMouseClicked

    private void crearTelefonoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearTelefonoInputMouseClicked
        crearTelefonoInput.setText("");
        crearTelefonoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearTelefonoInputMouseClicked

    private void crearCorreoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCorreoInputMouseClicked
        crearCorreoInput.setText("");
        crearCorreoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearCorreoInputMouseClicked

    private void crearCargoInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCargoInputMouseClicked
        crearCargoInput.setText("");
        crearCargoInput.setForeground(Color.black);
    }//GEN-LAST:event_crearCargoInputMouseClicked

    private void crearUserInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUserInputMouseClicked
        crearUserInput.setText("");
        crearUserInput.setForeground(Color.black);
    }//GEN-LAST:event_crearUserInputMouseClicked

    private void crearPasswordInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearPasswordInputMouseClicked
        crearPasswordInput.setText("");
        crearPasswordInput.setForeground(Color.black);
    }//GEN-LAST:event_crearPasswordInputMouseClicked

    private void crearUser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUser_btnMouseClicked
        boolean existe;
        
        if (existe = existeUser(crearUserInput.getText())){
        
            JOptionPane.showMessageDialog(null, "Ya existe un usuario registrado con este nombre");
        
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

    private void volverCrearUser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverCrearUser_btnMouseClicked
        vCrearUsuario.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_volverCrearUser_btnMouseClicked

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

    private void crearUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearUserMouseClicked

        this.setVisible(false);
        vCrearUsuario.setVisible(true);
        vCrearUsuario.setLocationRelativeTo(this);
        
    }//GEN-LAST:event_crearUserMouseClicked

    private void cerrarSesion_MP_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesion_MP_btnMouseClicked
        vMenuPrincipal.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_cerrarSesion_MP_btnMouseClicked

    private void Volver_MP_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volver_MP_btn2MouseClicked
        vMaquinas.dispose();
        vMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_Volver_MP_btn2MouseClicked

    private void Volver_MP_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volver_MP_btnMouseClicked
        vTareas.dispose();
        vMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_Volver_MP_btnMouseClicked

    private void maquinaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maquinaLabelMouseClicked
        vMaquinas.setVisible(true);
        vMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_maquinaLabelMouseClicked

    private void tareasLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareasLabelMouseClicked
        vTareas.setVisible(true);
        vMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_tareasLabelMouseClicked

    private void volverCrearMaquina_maquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverCrearMaquina_maquina_btnMouseClicked
        vCrearMaquina.dispose();
        vMaquinas.setVisible(true);
    }//GEN-LAST:event_volverCrearMaquina_maquina_btnMouseClicked

    private void crearNombreMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNombreMaquinaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearNombreMaquinaInputMouseClicked

    private void crearNombreMaquinaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearNombreMaquinaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearNombreMaquinaInputActionPerformed

    private void crearCategoriaMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCategoriaMaquinaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCategoriaMaquinaInputMouseClicked

    private void crearCategoriaMaquinaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCategoriaMaquinaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCategoriaMaquinaInputActionPerformed

    private void crearVoltajeMaquinaInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearVoltajeMaquinaInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearVoltajeMaquinaInputMouseClicked

    private void crearMotorInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMotorInputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearMotorInputMouseClicked

    private void crearNewMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearNewMaquina_btnMouseClicked
        
        Maquina newmaquina = new Maquina(crearNombreMaquinaInput.getText(),crearCategoriaMaquinaInput.getText(),Integer.parseInt(crearVoltajeMaquinaInput.getText()),Integer.parseInt(crearMotorInput.getText()),"Activa","");
        maquinas.add(newmaquina);
        
        JOptionPane.showMessageDialog(null, "Maquina agrega con exito");
        vCrearMaquina.dispose();
        vMaquinas.setVisible(true);
        resetPlaceHolderCrearMaquina();
        
        DefaultTableModel model = new DefaultTableModel();

        
    }//GEN-LAST:event_crearNewMaquina_btnMouseClicked

    private void crearMaquina_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMaquina_btnMouseClicked
        vMaquinas.setVisible(false);
        vCrearMaquina.setVisible(true);
    }//GEN-LAST:event_crearMaquina_btnMouseClicked

    
    
    
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

    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logo10;
    private javax.swing.JLabel Logo11;
    private javax.swing.JLabel Logo2;
    private javax.swing.JLabel Logo3;
    private javax.swing.JLabel Logo4;
    private javax.swing.JLabel Logo5;
    private javax.swing.JLabel Logo6;
    private javax.swing.JLabel Logo7;
    private javax.swing.JLabel Logo8;
    private javax.swing.JLabel Logo9;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo10;
    private javax.swing.JLabel Titulo11;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo7;
    private javax.swing.JLabel Titulo8;
    private javax.swing.JLabel Titulo9;
    private javax.swing.JButton Volver_MP_btn;
    private javax.swing.JButton Volver_MP_btn2;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JPanel backgroud;
    private javax.swing.JPanel backgroud1;
    private javax.swing.JPanel backgroud10;
    private javax.swing.JPanel backgroud11;
    private javax.swing.JPanel backgroud2;
    private javax.swing.JPanel backgroud3;
    private javax.swing.JPanel backgroud4;
    private javax.swing.JPanel backgroud5;
    private javax.swing.JPanel backgroud6;
    private javax.swing.JPanel backgroud7;
    private javax.swing.JPanel backgroud8;
    private javax.swing.JPanel backgroud9;
    private javax.swing.JPanel backgroundSeconColor;
    private javax.swing.JPanel backgroundSeconColor1;
    private javax.swing.JPanel backgroundSeconColor10;
    private javax.swing.JPanel backgroundSeconColor11;
    private javax.swing.JPanel backgroundSeconColor2;
    private javax.swing.JPanel backgroundSeconColor3;
    private javax.swing.JPanel backgroundSeconColor4;
    private javax.swing.JPanel backgroundSeconColor5;
    private javax.swing.JPanel backgroundSeconColor6;
    private javax.swing.JPanel backgroundSeconColor7;
    private javax.swing.JPanel backgroundSeconColor8;
    private javax.swing.JPanel backgroundSeconColor9;
    private javax.swing.JLabel bienvendoUser;
    private javax.swing.JLabel bienvendoUser2;
    private javax.swing.JLabel bienvendoUser3;
    private javax.swing.JLabel bienvendoUser4;
    private javax.swing.JLabel bienvendoUser5;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JLabel cargoLabel1;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JButton cerrarSesion_MP_btn;
    private javax.swing.JButton cerrarSesion_MP_btn2;
    private javax.swing.JButton cerrarSesion_MP_btn3;
    private javax.swing.JButton cerrarSesion_MP_btn4;
    private javax.swing.JButton cerrarSesion_MP_btn5;
    private javax.swing.JButton cerrarSesion_MP_btn6;
    private javax.swing.JButton cerrarSesion_MP_btn7;
    private javax.swing.JLabel codigoMaquina;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JTextField crearApellidoInput;
    private javax.swing.JTextField crearCargoInput;
    private javax.swing.JTextField crearCategoriaMaquinaInput;
    private javax.swing.JTextField crearCorreoInput;
    private javax.swing.JTextField crearIdInput;
    private javax.swing.JButton crearMaquina_btn;
    private javax.swing.JTextField crearMotorInput;
    private javax.swing.JButton crearNewMaquina_btn;
    private javax.swing.JTextField crearNombreInput;
    private javax.swing.JTextField crearNombreMaquinaInput;
    private javax.swing.JTextField crearPasswordInput;
    private javax.swing.JTextField crearTelefonoInput;
    private javax.swing.JButton crearUser;
    private javax.swing.JTextField crearUserInput;
    private javax.swing.JButton crearUser_btn;
    private javax.swing.JTextField crearVoltajeMaquinaInput;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel editUserLabel;
    private javax.swing.JPanel editUser_btn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUser;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel maquinaLabel;
    private javax.swing.JPanel maquinas_btn;
    private javax.swing.JLabel motorLabel;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JLabel oLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTable tablaMaquinas;
    private javax.swing.JLabel tareasLabel;
    private javax.swing.JPanel tareas_btn;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JDialog vCrearMaquina;
    private javax.swing.JDialog vCrearUsuario;
    private javax.swing.JFrame vMaquinas;
    private javax.swing.JFrame vMenuPrincipal;
    private javax.swing.JFrame vTareas;
    private javax.swing.JLabel voltajeLabel;
    private javax.swing.JButton volverCrearMaquina_maquina_btn;
    private javax.swing.JButton volverCrearUser_btn;
    // End of variables declaration//GEN-END:variables
}
