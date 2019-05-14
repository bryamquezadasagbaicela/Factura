/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.vista.producto.ActualizarProducto;
import ec.edu.ups.vista.producto.ListarProducto;
import ec.edu.ups.vista.producto.LeerProducto;
import ec.edu.ups.vista.producto.EliminarProducto;
import ec.edu.ups.vista.producto.CrearProducto;
import ec.edu.ups.vista.cliente.ListarCliente;
import ec.edu.ups.vista.cliente.LeerCliente;
import ec.edu.ups.vista.cliente.EliminarCliente;
import ec.edu.ups.vista.cliente.CrearCliente;
import ec.edu.ups.vista.cliente.ActualizarCliente;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author QuezadaBryam
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //atributos
    private CrearCliente crearCliente;
    private CrearProducto crearProducto;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();
        initComponents();
        this.setSize(500, 500);//tama;o 
        //System.out.println("localizacion por defecto: "+ Locale.getDefault().getLanguage());
        localizacion = new Locale("es","EC");
        Locale.setDefault(localizacion);
        //System.out.println("localizacion forzada: "+ Locale.getDefault().getLanguage());
        
        cambiarIdioma();
    }
    
    public void cambiarIdioma(){
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        clienteMenu.setText(mensajes.getString("menu.cliente"));
        productoMenu.setText(mensajes.getString("menu.producto"));
        facturaMenu.setText(mensajes.getString("menu.factura"));
        idiomasMenu.setText(mensajes.getString("menu.idiomas"));
        
        itmReadCreateCliente.setText(mensajes.getString("menu.item.create"));
        itmReadCreateProducto.setText(mensajes.getString("menu.item.create"));
        itmReadCreateFactura.setText(mensajes.getString("menu.item.create"));
        
        itmReadReadCliente.setText(mensajes.getString("menu.item.read"));
        itmReadReadProducto.setText(mensajes.getString("menu.item.read"));
        itmReadReadFactura.setText(mensajes.getString("menu.item.read"));
        
        imtReadUpdateCliente.setText(mensajes.getString("menu.item.update"));
        imtReadUpdateProducto.setText(mensajes.getString("menu.item.update"));
        imtReadUpdateFactura.setText(mensajes.getString("menu.item.update"));
        
        itmReadDeleteCliente.setText(mensajes.getString("menu.item.delete"));
        itmReadDeleteProducto.setText(mensajes.getString("menu.item.delete"));
        itmReadDeleteFactura.setText(mensajes.getString("menu.item.delete"));
        
        itmReadListCliente.setText(mensajes.getString("menu.item.list"));
        itmReadListProducto.setText(mensajes.getString("menu.item.list"));
        itmReadListFactura.setText(mensajes.getString("menu.item.list"));
        
        itmReadIdiomasEspañol.setText(mensajes.getString("menu.item.español"));
        itmReadIdiomasIngles.setText(mensajes.getString("menu.item.ingles"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        fileMenu1 = new javax.swing.JMenu();
        openMenuItem1 = new javax.swing.JMenuItem();
        saveMenuItem1 = new javax.swing.JMenuItem();
        saveAsMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        itmReadCreateCliente = new javax.swing.JMenuItem();
        itmReadReadCliente = new javax.swing.JMenuItem();
        imtReadUpdateCliente = new javax.swing.JMenuItem();
        itmReadDeleteCliente = new javax.swing.JMenuItem();
        itmReadListCliente = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenu();
        itmReadCreateProducto = new javax.swing.JMenuItem();
        itmReadReadProducto = new javax.swing.JMenuItem();
        imtReadUpdateProducto = new javax.swing.JMenuItem();
        itmReadDeleteProducto = new javax.swing.JMenuItem();
        itmReadListProducto = new javax.swing.JMenuItem();
        facturaMenu = new javax.swing.JMenu();
        itmReadCreateFactura = new javax.swing.JMenuItem();
        itmReadReadFactura = new javax.swing.JMenuItem();
        imtReadUpdateFactura = new javax.swing.JMenuItem();
        itmReadDeleteFactura = new javax.swing.JMenuItem();
        itmReadListFactura = new javax.swing.JMenuItem();
        idiomasMenu = new javax.swing.JMenu();
        itmReadIdiomasEspañol = new javax.swing.JMenuItem();
        itmReadIdiomasIngles = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        fileMenu1.setMnemonic('f');
        fileMenu1.setText("Cliente");

        openMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem1.setMnemonic('o');
        openMenuItem1.setText("Create");
        openMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(openMenuItem1);

        saveMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem1.setMnemonic('s');
        saveMenuItem1.setText("Read");
        saveMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(saveMenuItem1);

        saveAsMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem1.setMnemonic('a');
        saveAsMenuItem1.setText("Update");
        saveAsMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(saveAsMenuItem1);

        exitMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem1.setMnemonic('x');
        exitMenuItem1.setText("Delete");
        exitMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu1.add(exitMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Listar");
        fileMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(0, 0, 0));

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        itmReadCreateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmReadCreateCliente.setMnemonic('o');
        itmReadCreateCliente.setText("Create");
        itmReadCreateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadCreateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmReadCreateCliente);

        itmReadReadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmReadReadCliente.setMnemonic('s');
        itmReadReadCliente.setText("Read");
        itmReadReadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadReadClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmReadReadCliente);

        imtReadUpdateCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        imtReadUpdateCliente.setMnemonic('a');
        imtReadUpdateCliente.setText("Update");
        imtReadUpdateCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imtReadUpdateClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(imtReadUpdateCliente);

        itmReadDeleteCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmReadDeleteCliente.setMnemonic('x');
        itmReadDeleteCliente.setText("Delete");
        itmReadDeleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadDeleteClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmReadDeleteCliente);

        itmReadListCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmReadListCliente.setText("List");
        itmReadListCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadListClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmReadListCliente);

        menuBar.add(clienteMenu);

        productoMenu.setMnemonic('f');
        productoMenu.setText("Producto");

        itmReadCreateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmReadCreateProducto.setMnemonic('o');
        itmReadCreateProducto.setText("Create");
        itmReadCreateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadCreateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmReadCreateProducto);

        itmReadReadProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        itmReadReadProducto.setMnemonic('s');
        itmReadReadProducto.setText("Read");
        itmReadReadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadReadProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmReadReadProducto);

        imtReadUpdateProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        imtReadUpdateProducto.setMnemonic('a');
        imtReadUpdateProducto.setText("Update");
        imtReadUpdateProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imtReadUpdateProductoActionPerformed(evt);
            }
        });
        productoMenu.add(imtReadUpdateProducto);

        itmReadDeleteProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        itmReadDeleteProducto.setMnemonic('x');
        itmReadDeleteProducto.setText("Delete");
        itmReadDeleteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadDeleteProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmReadDeleteProducto);

        itmReadListProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        itmReadListProducto.setText("List");
        itmReadListProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadListProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmReadListProducto);

        menuBar.add(productoMenu);

        facturaMenu.setMnemonic('f');
        facturaMenu.setText("Factura");

        itmReadCreateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmReadCreateFactura.setMnemonic('o');
        itmReadCreateFactura.setText("Create");
        itmReadCreateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadCreateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmReadCreateFactura);

        itmReadReadFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        itmReadReadFactura.setMnemonic('s');
        itmReadReadFactura.setText("Read");
        itmReadReadFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadReadFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmReadReadFactura);

        imtReadUpdateFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        imtReadUpdateFactura.setMnemonic('a');
        imtReadUpdateFactura.setText("Update");
        imtReadUpdateFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imtReadUpdateFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(imtReadUpdateFactura);

        itmReadDeleteFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        itmReadDeleteFactura.setMnemonic('x');
        itmReadDeleteFactura.setText("Delete");
        itmReadDeleteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadDeleteFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmReadDeleteFactura);

        itmReadListFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        itmReadListFactura.setText("List");
        itmReadListFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadListFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmReadListFactura);

        menuBar.add(facturaMenu);

        idiomasMenu.setMnemonic('f');
        idiomasMenu.setText("Idiomas");

        itmReadIdiomasEspañol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmReadIdiomasEspañol.setMnemonic('o');
        itmReadIdiomasEspañol.setText("Español");
        itmReadIdiomasEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadIdiomasEspañolActionPerformed(evt);
            }
        });
        idiomasMenu.add(itmReadIdiomasEspañol);

        itmReadIdiomasIngles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        itmReadIdiomasIngles.setMnemonic('x');
        itmReadIdiomasIngles.setText("Ingles");
        itmReadIdiomasIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmReadIdiomasInglesActionPerformed(evt);
            }
        });
        idiomasMenu.add(itmReadIdiomasIngles);

        menuBar.add(idiomasMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmReadDeleteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadDeleteProductoActionPerformed
        //eliminar producto
        EliminarProducto eliminarProducto = new EliminarProducto(controladorProducto);
        eliminarProducto.setVisible(true);
        desktopPane.add(eliminarProducto);

    }//GEN-LAST:event_itmReadDeleteProductoActionPerformed

    private void itmReadCreateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadCreateProductoActionPerformed
        //crear producto
        if (crearProducto == null || !crearProducto.isVisible()) {
            crearProducto = new CrearProducto(controladorProducto);
            crearProducto.setVisible(true);
            desktopPane.add(crearProducto);
        }

    }//GEN-LAST:event_itmReadCreateProductoActionPerformed

    private void itmReadReadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadReadProductoActionPerformed
        //leer producto
        LeerProducto buscarProducto = new LeerProducto(controladorProducto);
        buscarProducto.setVisible(true);
        desktopPane.add(buscarProducto);
    }//GEN-LAST:event_itmReadReadProductoActionPerformed

    private void imtReadUpdateProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imtReadUpdateProductoActionPerformed

        ActualizarProducto actualizarProducto = new ActualizarProducto(controladorProducto);
        actualizarProducto.setVisible(true);
        desktopPane.add(actualizarProducto);
    }//GEN-LAST:event_imtReadUpdateProductoActionPerformed

    private void openMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItem1ActionPerformed

    private void saveMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItem1ActionPerformed

    private void saveAsMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveAsMenuItem1ActionPerformed

    private void exitMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuItem1ActionPerformed

    private void itmReadCreateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadCreateClienteActionPerformed
        //crear cliente
        if (crearCliente == null || !crearCliente.isVisible()) {
            crearCliente = new CrearCliente(controladorCliente);
            crearCliente.setVisible(true);
            desktopPane.add(crearCliente);
        }
    }//GEN-LAST:event_itmReadCreateClienteActionPerformed

    private void itmReadReadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadReadClienteActionPerformed
        //leer cliente
        LeerCliente buscarCliente = new LeerCliente(controladorCliente);
        buscarCliente.setVisible(true);
        desktopPane.add(buscarCliente);

    }//GEN-LAST:event_itmReadReadClienteActionPerformed

    private void imtReadUpdateClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imtReadUpdateClienteActionPerformed
        //actualizar cliente
        ActualizarCliente actualizarCliente = new ActualizarCliente(controladorCliente);
        actualizarCliente.setVisible(true);
        desktopPane.add(actualizarCliente);
    }//GEN-LAST:event_imtReadUpdateClienteActionPerformed

    private void itmReadDeleteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadDeleteClienteActionPerformed
        //eliminar cliente
        EliminarCliente eliminarCliente = new EliminarCliente(controladorCliente);
        eliminarCliente.setVisible(true);
        desktopPane.add(eliminarCliente);
    }//GEN-LAST:event_itmReadDeleteClienteActionPerformed

    private void itmReadListClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadListClienteActionPerformed
        //listar cliente
        ListarCliente listarCliente = new ListarCliente(controladorCliente);
        listarCliente.setVisible(true);
        desktopPane.add(listarCliente);
    }//GEN-LAST:event_itmReadListClienteActionPerformed

    private void itmReadListProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadListProductoActionPerformed
       //listar producto
        ListarProducto listarProducto = new ListarProducto(controladorProducto);
       listarProducto.setVisible(true);
       desktopPane.add(listarProducto);
    }//GEN-LAST:event_itmReadListProductoActionPerformed

    private void itmReadCreateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadCreateFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadCreateFacturaActionPerformed

    private void itmReadReadFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadReadFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadReadFacturaActionPerformed

    private void imtReadUpdateFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imtReadUpdateFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imtReadUpdateFacturaActionPerformed

    private void itmReadDeleteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadDeleteFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadDeleteFacturaActionPerformed

    private void itmReadListFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadListFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmReadListFacturaActionPerformed

    private void itmReadIdiomasEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadIdiomasEspañolActionPerformed
        // cambiar idioma español Ecuador
        localizacion = new Locale ("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itmReadIdiomasEspañolActionPerformed

    private void itmReadIdiomasInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmReadIdiomasInglesActionPerformed
        // cambiar idioma Ingles Estados Unidos
        localizacion = new Locale ("en", "US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itmReadIdiomasInglesActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem1;
    private javax.swing.JMenu facturaMenu;
    private javax.swing.JMenu fileMenu1;
    private javax.swing.JMenu idiomasMenu;
    private javax.swing.JMenuItem imtReadUpdateCliente;
    private javax.swing.JMenuItem imtReadUpdateFactura;
    private javax.swing.JMenuItem imtReadUpdateProducto;
    private javax.swing.JMenuItem itmReadCreateCliente;
    private javax.swing.JMenuItem itmReadCreateFactura;
    private javax.swing.JMenuItem itmReadCreateProducto;
    private javax.swing.JMenuItem itmReadDeleteCliente;
    private javax.swing.JMenuItem itmReadDeleteFactura;
    private javax.swing.JMenuItem itmReadDeleteProducto;
    private javax.swing.JMenuItem itmReadIdiomasEspañol;
    private javax.swing.JMenuItem itmReadIdiomasIngles;
    private javax.swing.JMenuItem itmReadListCliente;
    private javax.swing.JMenuItem itmReadListFactura;
    private javax.swing.JMenuItem itmReadListProducto;
    private javax.swing.JMenuItem itmReadReadCliente;
    private javax.swing.JMenuItem itmReadReadFactura;
    private javax.swing.JMenuItem itmReadReadProducto;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem1;
    private javax.swing.JMenu productoMenu;
    private javax.swing.JMenuItem saveAsMenuItem1;
    private javax.swing.JMenuItem saveMenuItem1;
    // End of variables declaration//GEN-END:variables

}
