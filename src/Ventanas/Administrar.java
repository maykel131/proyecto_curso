
package Ventanas;

import Clases.conexion_mysql;
import Clases.metodos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dennis
 */
public class Administrar extends javax.swing.JFrame {
    metodos sb = new metodos();

    //varibles importantes no tocar
    int hizo=0;
    int auxiliar;
    ResultSet consulta=null, consulta2=null;
  
    String  tabla; 
    int tipo;
    
    
    
    
    //Metodos globales       
    public Administrar() {
        initComponents();
        //pantalla centrada
        setLocationRelativeTo(null);
        //sin modificarse
        setResizable(false);
        //Titulo
        setTitle("ADMINISTRAR");
        /*Icono de ventana
        setIconImage(new ImageIcon(get.class).getResource("/Fondos/"));*/
        //Fondo
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/Fondos/fondo-azul.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno); getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
    }
    
    
    public void limpiar(){
        txtcedula.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtedad.setText("");
        txtemail.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txttelefijo.setText("");
        txtncarnet.setText("");
        boxcursos.setSelectedIndex(0);
        boxgenero.setSelectedIndex(0);
        boxstatus.setSelectedIndex(0); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txttelefijo = new javax.swing.JTextField();
        txtncarnet = new javax.swing.JTextField();
        boxgenero = new javax.swing.JComboBox<>();
        boxcursos = new javax.swing.JComboBox<>();
        boxstatus = new javax.swing.JComboBox<>();
        butagregar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        butconsultat = new javax.swing.JButton();
        butmodificar = new javax.swing.JButton();
        butlimpiar = new javax.swing.JButton();
        butsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Ubuntu", 3, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(254, 254, 254));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("ADMINISTRAR DOCENTE");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Cedula de Identidad:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Edad:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Genero:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Direccion:");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Telefono Movil:");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Telefono Habitacion");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("N° Carnet:");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Cursos");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("Status");

        txtcedula.setColumns(15);
        txtcedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        txtnombre.setColumns(15);
        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtapellido.setColumns(15);
        txtapellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        txtedad.setColumns(15);
        txtedad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        txtemail.setColumns(15);
        txtemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });

        txtdireccion.setColumns(15);
        txtdireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });

        txttelefono.setColumns(15);
        txttelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        txttelefijo.setColumns(15);
        txttelefijo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txttelefijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefijoActionPerformed(evt);
            }
        });
        txttelefijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefijoKeyTyped(evt);
            }
        });

        txtncarnet.setColumns(15);
        txtncarnet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtncarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtncarnetActionPerformed(evt);
            }
        });
        txtncarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtncarnetKeyTyped(evt);
            }
        });

        boxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));

        boxcursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Programacion", "Idiomas\t", "Redes", "Electricidad", "Computacion" }));
        boxcursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxcursosActionPerformed(evt);
            }
        });

        boxstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Activo", "Inactivo" }));
        boxstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxstatusActionPerformed(evt);
            }
        });

        butagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/5.png"))); // NOI18N
        butagregar.setText("Agregar");
        butagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butagregarActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtcedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtedad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtemail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtdireccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txttelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txttelefijo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtncarnet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(boxgenero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(boxcursos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(boxstatus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(butagregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcedula, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(boxgenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txttelefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtncarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(boxcursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(boxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(butagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtncarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxcursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(butagregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        butconsultat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/13.png"))); // NOI18N
        butconsultat.setText("Consultar");
        butconsultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butconsultatActionPerformed(evt);
            }
        });

        butmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/5.png"))); // NOI18N
        butmodificar.setText("Modificar");
        butmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butmodificarActionPerformed(evt);
            }
        });

        butlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/15.png"))); // NOI18N
        butlimpiar.setText("  Limpiar ");
        butlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlimpiarActionPerformed(evt);
            }
        });

        butsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/14.png"))); // NOI18N
        butsalir.setText("       Salir");
        butsalir.setToolTipText("");
        butsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsalirActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(butconsultat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(butmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(butlimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(butsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(butconsultat)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(butmodificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(butlimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(butconsultat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butmodificar)
                .addGap(7, 7, 7)
                .addComponent(butlimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butsalir)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        String Caracteres = txtcedula.getText();
        char ced=evt.getKeyChar();
        if(ced<'0'||ced>'9'){
            evt.consume();
        }
        if(Caracteres.length()>=8){ 
            evt.consume(); 
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
      char nom= evt.getKeyChar();
      if((nom<'a'|| nom>'z')&&(nom<'A'||nom>'Z')) evt.consume();    
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
       char ape= evt.getKeyChar();
      if((ape<'a'|| ape>'z')&&(ape<'A'||ape>'Z')) evt.consume();     
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
    char ced=evt.getKeyChar();
        if(ced<'0'||ced>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtedadKeyTyped

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
       /*if(txtemail.getText( ).matches("[a-z@.A-Z 0-9_]*")){
        JOptionPane.showMessageDialog(null,"Disculpe. Email invalido. Intente nuevamente","ERROR",0);
        }*/
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        String Caracteres = txttelefono.getText();
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();}
        if(Caracteres.length()>=11){ 
            evt.consume(); 
        }
        
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txttelefijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefijoActionPerformed

    private void txttelefijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefijoKeyTyped
        String Caracteres = txttelefijo.getText();
        if(!Character.isDigit(evt.getKeyChar())){
        evt.consume();}
        if(Caracteres.length()>=11){ 
            evt.consume(); 
        }
    }//GEN-LAST:event_txttelefijoKeyTyped

    private void txtncarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtncarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtncarnetActionPerformed

    private void txtncarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtncarnetKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtncarnetKeyTyped

    private void boxcursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxcursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxcursosActionPerformed

    private void boxstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxstatusActionPerformed

    private void butconsultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butconsultatActionPerformed

        if(!"".equals(txtcedula.getText())){         
      
         
         consulta=null;
         consulta2=null;
      int res=Integer.parseInt(txtcedula.getText());
        consulta= sb.consult_persona("persona",res );
         
              if (consulta!=null){
                  try {
                     auxiliar=consulta.getInt("Id_person");
                      consulta2= sb.consult_docente(auxiliar,getTabla());
             //          System.out.println( "  eesta ewgfwegwegweg     "+auxiliar );
                  }catch (SQLException ex) {
                      Logger.getLogger(Administrar.class.getName()).log(Level.SEVERE, null, ex);
                  }
              } 
     //    System.out.println( "  eesta      "+auxiliar );
       
    
         if(consulta2!=null && 0 != auxiliar){
      
             try {
                setTxtcedula(String.valueOf(consulta.getString("identification")));
                setTxtnombre(String.valueOf(consulta.getString("name")));
                setTxtapellido(String.valueOf(consulta.getString("last_name")));
                setTxtedad(String.valueOf(consulta.getString("age")));
                setBoxgenero(String.valueOf(consulta.getString("genere")));
                setTxtemail(String.valueOf(consulta.getString("email")));
                setTxtdireccion(String.valueOf(consulta.getString("address")));
                setTxttelefono(String.valueOf(consulta.getString("cellphone")));
                setTxttelefijo(String.valueOf(consulta.getString(10)));
                setBoxstatus(String.valueOf(consulta.getString("status")));
                boxcursos.setSelectedIndex(consulta2.getInt("id_curse"));
                setTxtncarnet(String.valueOf(consulta2.getString("num_carnet")));
                   hizo=1;
                 
            } catch (SQLException ex) {
                Logger.getLogger(Administrar.class.getName()).log(Level.SEVERE, null, ex);
            }
             
         }else{
             JOptionPane.showMessageDialog(null,"Disculpe. LA persona ingresado no se encuentra registrado",null,2);
         }
      
       }else{
          JOptionPane.showMessageDialog(null,"EL campo cedula de identidad se encuentra vacio. Intente nuevamente","ERROR",0);
      }
    }//GEN-LAST:event_butconsultatActionPerformed

    private void butmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butmodificarActionPerformed
        ///mofificarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr ok
                                                  
   // prueba JOptionPane.showMessageDialog(null," tabla: "+getTabla()+" tipo: "+getTipo());
     if(hizo==1){   
      if(!"".equals(txtcedula.getText())){
        if(!"".equals(txtnombre.getText())){
            if(!"".equals(txtapellido.getText())){
                if(!"".equals(txtedad.getText())){
                    if(boxgenero.getSelectedIndex()!=0 ){
                        if(!"".equals(txtemail.getText())){
                            if(!"".equals(txtdireccion.getText())){
                                if(!"".equals(txttelefono.getText())){
                                    if(!"".equals(txttelefijo.getText())){
                                        if(!"".equals(txtncarnet.getText())){
                                            if(boxcursos.getSelectedIndex()!=0 ){
                                                if(boxstatus.getSelectedIndex()!=0 ){
                         
        
        
                   try {
                       
           int yes=JOptionPane.showConfirmDialog(null,"Esta seguro que desea Modificar  los datos en la base de Datos","  Moficar Datos",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(JOptionPane.YES_OPTION==yes){
         
           sb.modificar(getTabla(),auxiliar,       // tabla y id a cambiar
                      Integer.parseInt(txtcedula.getText()),  // a
                      txtnombre.getText().toUpperCase(),      // b
                      txtapellido.getText().toUpperCase(),    // c
                      Integer.parseInt(txtedad.getText()),    // d
                      boxgenero.getSelectedItem().toString(), // e
                      txtemail.getText().toUpperCase(),       // f 
                      txtdireccion.getText().toUpperCase(),   // g
                      txttelefono.getText().toUpperCase(),    // h
                      txttelefijo.getText().toUpperCase(),    // i 
                      boxstatus.getSelectedItem().toString(), // st
                      Integer.parseInt(txtncarnet.getText()), // carnet
                      boxcursos.getSelectedIndex(),          // curso
                         getTipo()            );
           
            
                     txtcedula.setText("");
                     txtnombre.setText("");
                     txtapellido.setText("");
                     txtedad.setText("");
                     boxgenero.setSelectedIndex(0);
                     txtemail.setText("");
                     txtdireccion.setText("");
                     txttelefono.setText("");
                     txttelefijo.setText("");
                     boxcursos.setSelectedIndex(0);  
                     txtncarnet.setText("");
                     boxstatus.setSelectedIndex(0);
                     
                     hizo=0;
            }        
              
           
                     } catch (SQLException ex) {
              Logger.getLogger(Administrar.class.getName()).log(Level.SEVERE, null, ex);                 
                      }
        
        
       
                    
                                                    
                                                }else{ JOptionPane.showMessageDialog(null,"Debe selecionar una opcion en status. Intente nuevamente","ERROR",0);  }
                                            }else{ JOptionPane.showMessageDialog(null,"Debe selecionar una opcion en cursos. Intente nuevamente","ERROR",0);  }     
                                        }else{ JOptionPane.showMessageDialog(null,"EL campo numero de carnet se encuentra vacio. Intente nuevamente","ERROR",0);  }
                                    }else{ JOptionPane.showMessageDialog(null,"EL campo telefono fijo se encuentra vacio. Intente nuevamente","ERROR",0);  }
                                }else{ JOptionPane.showMessageDialog(null,"EL campo telefono se encuentra vacio. Intente nuevamente","ERROR",0);  }
                            }else{ JOptionPane.showMessageDialog(null,"EL campo direccion se encuentra vacio. Intente nuevamente","ERROR",0);  }
                        }else{ JOptionPane.showMessageDialog(null,"EL campo email se encuentra vacio. Intente nuevamente","ERROR",0);  }
                    }else{ JOptionPane.showMessageDialog(null,"Debe selecionar una opcion en genero. Intente nuevamente","ERROR",0);  }
                }else{ JOptionPane.showMessageDialog(null,"EL campo edad se encuentra vacio. Intente nuevamente","ERROR",0);  }
            }else{ JOptionPane.showMessageDialog(null,"EL campo apellido se encuentra vacio. Intente nuevamente","ERROR",0);  }
        }else{ JOptionPane.showMessageDialog(null,"EL campo nombre se encuentra vacio. Intente nuevamente","ERROR",0);  }
    }else{ JOptionPane.showMessageDialog(null,"EL campo cedula de identidad se encuentra vacio. Intente nuevamente","ERROR",0);   }
  }else{  JOptionPane.showMessageDialog(null,"Debe hazer una consulta antes de modificar. Intente nuevamente","ERROR",0);}    
        
   
        
        
        
        
        
    }//GEN-LAST:event_butmodificarActionPerformed

    private void butlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlimpiarActionPerformed
           limpiar();
    }//GEN-LAST:event_butlimpiarActionPerformed

    private void butagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butagregarActionPerformed
   // prueba JOptionPane.showMessageDialog(null," tabla: "+getTabla()+" tipo: "+getTipo());
      if(!"".equals(txtcedula.getText())){
        if(!"".equals(txtnombre.getText())){
            if(!"".equals(txtapellido.getText())){
                if(!"".equals(txtedad.getText())){
                    if(boxgenero.getSelectedIndex()!=0 ){
                        if(!"".equals(txtemail.getText())){
                            if(!"".equals(txtdireccion.getText())){
                                if(!"".equals(txttelefono.getText())){
                                    if(!"".equals(txttelefijo.getText())){
                                        if(!"".equals(txtncarnet.getText())){// no estan en la tabla persona no se enviearan
                                            if(boxcursos.getSelectedIndex()!=0 ){// no estan en la tabla persona no se enviaran
                                                if(boxstatus.getSelectedIndex()!=0 ){
                                                     
         
        
       

       
        
        
                   try {
                       
           int yes=JOptionPane.showConfirmDialog(null,"Deseas agregar los datos en la tabla","Insertar Datos",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(JOptionPane.YES_OPTION==yes){
         
           sb.insertar(getTabla(),                                  // tabla
                      Integer.parseInt(txtcedula.getText()),  // a
                      txtnombre.getText().toUpperCase(),      // b
                      txtapellido.getText().toUpperCase(),    // c
                      Integer.parseInt(txtedad.getText()),    // d
                      boxgenero.getSelectedItem().toString(), // e
                      txtemail.getText().toUpperCase(),       // f 
                      txtdireccion.getText().toUpperCase(),   // g
                      txttelefono.getText().toUpperCase(),    // h
                      txttelefijo.getText().toUpperCase(),    // i 
                      boxstatus.getSelectedItem().toString(), // st
                      Integer.parseInt(txtncarnet.getText()), // carnet
                       boxcursos.getSelectedIndex(),          // curso
                         getTipo()            );}        
              
           
                     } catch (SQLException ex) {
              Logger.getLogger(Administrar.class.getName()).log(Level.SEVERE, null, ex);                 
                      }
        
        
       
         txtcedula.setText("");
         txtnombre.setText("");
         txtapellido.setText("");
         txtedad.setText("");
         boxgenero.setSelectedIndex(0);
         txtemail.setText("");
         txtdireccion.setText("");
         txttelefono.setText("");
         txttelefijo.setText("");
         boxcursos.setSelectedIndex(0);  
         txtncarnet.setText("");
         boxstatus.setSelectedIndex(0);                   
                                                    
                                                }else{ JOptionPane.showMessageDialog(null,"Debe selecionar una opcion en status. Intente nuevamente","ERROR",0);  }
                                            }else{ JOptionPane.showMessageDialog(null,"Debe selecionar una opcion en cursos. Intente nuevamente","ERROR",0);  }     
                                        }else{ JOptionPane.showMessageDialog(null,"EL campo numero de carnet se encuentra vacio. Intente nuevamente","ERROR",0);  }
                                    }else{ JOptionPane.showMessageDialog(null,"EL campo telefono fijo se encuentra vacio. Intente nuevamente","ERROR",0);  }
                                }else{ JOptionPane.showMessageDialog(null,"EL campo telefono se encuentra vacio. Intente nuevamente","ERROR",0);  }
                            }else{ JOptionPane.showMessageDialog(null,"EL campo direccion se encuentra vacio. Intente nuevamente","ERROR",0);  }
                        }else{ JOptionPane.showMessageDialog(null,"EL campo email se encuentra vacio. Intente nuevamente","ERROR",0);  }
                    }else{ JOptionPane.showMessageDialog(null,"Debe selecionar una opcion en genero. Intente nuevamente","ERROR",0);  }
                }else{ JOptionPane.showMessageDialog(null,"EL campo edad se encuentra vacio. Intente nuevamente","ERROR",0);  }
            }else{ JOptionPane.showMessageDialog(null,"EL campo apellido se encuentra vacio. Intente nuevamente","ERROR",0);  }
        }else{ JOptionPane.showMessageDialog(null,"EL campo nombre se encuentra vacio. Intente nuevamente","ERROR",0);  }
    }else{ JOptionPane.showMessageDialog(null,"EL campo cedula de identidad se encuentra vacio. Intente nuevamente","ERROR",0);   }
        
        
        
        
        
    }//GEN-LAST:event_butagregarActionPerformed

    private void butsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsalirActionPerformed
        int accion = JOptionPane.showConfirmDialog(null,"¿Deseas salir al menu principal?","¡Alerta!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(accion == JOptionPane.YES_OPTION){
            Administrador n = new Administrador();
            n.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_butsalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxcursos;
    private javax.swing.JComboBox<String> boxgenero;
    private javax.swing.JComboBox<String> boxstatus;
    private javax.swing.JButton butagregar;
    private javax.swing.JButton butconsultat;
    private javax.swing.JButton butlimpiar;
    private javax.swing.JButton butmodificar;
    private javax.swing.JButton butsalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtncarnet;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefijo;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
   
//Metodos setter y getter de el formulario
//nombre  
    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(String txtnombre) {
        this.txtnombre.setText(txtnombre);
    }
//apellido
    public JTextField getTxtapellido() {
        return txtapellido;
    }

    public void setTxtapellido(String txtapellido) {
        this.txtapellido.setText(txtapellido);
    }
//cedula
    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public void setTxtcedula(String txtcedula) {
      this.txtcedula.setText(txtcedula);
    }
//direccion
    public JTextField getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(String txtdireccion) {
        this.txtdireccion.setText(txtdireccion);
    }
//edad
    public JTextField getTxtedad() {
        return txtedad;
    }

    public void setTxtedad(String txtedad) {
        this.txtedad.setText(txtedad);
    }
//email
    public JTextField getTxtemail() {
        return txtemail;
    }

    public void setTxtemail(String txtemail) {
        this.txtemail.setText(txtemail);
    }

    public JTextField getTxtncarnet() {
        return txtncarnet;
    }

    public void setTxtncarnet(String txtncarnet) {
        this.txtncarnet.setText(txtncarnet);
    }

    public JTextField getTxttelefijo() {
        return txttelefijo;
    }

    public void setTxttelefijo(String txttelefijo) {
        this.txttelefijo.setText(txttelefijo);
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(String txttelefono) {
        this.txttelefono.setText(txttelefono);
    }

    public JComboBox<String> getBoxgenero() {
        return boxgenero;
    }

    public void setBoxgenero(String boxgenero) {
        this.boxgenero.setSelectedItem(boxgenero);
    }

    public JComboBox<String> getBoxcursos() {
        return boxcursos;
    }

    public void setBoxcursos(String boxcursos) {
        this.boxcursos.setSelectedItem(boxcursos);
    }

    public JComboBox<String> getBoxstatus() {
        return boxstatus;
    }

    public void setBoxstatus(String boxstatus) {
        this.boxstatus.setSelectedItem(boxstatus);
    }
    
    
    //para iniciar pantalla
    public void iniciar(String titu ){
      titulo.setText(titu);
     }

    
    public void setTabla(String ta){
       this.tabla=ta;
    }
    
    public String getTabla(){
    
    return tabla;
    }
    
    
     public void setTipo(int ti){
       this.tipo=ti;
    }
    
    public int getTipo(){
    
    return tipo;
    }
    
    
    
    
    
    
    
}
