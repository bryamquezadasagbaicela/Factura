/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.producto;

import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 59398
 */
public class ListarProducto extends javax.swing.JInternalFrame {
    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public static DefaultTableModel modelo; 
    /**
     * Creates new form ListarProducto
     */
    public ListarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
         modelo = new DefaultTableModel();
        //Da los nombres de las columnas de la tabla
        Object[] columnas = {"Codigo","Nombre","Precio"};
        modelo.setColumnIdentifiers(columnas);
        tblProducto.setModel(modelo);
        
        llenarDatos();
    }

    public void llenarDatos() {
        DefaultTableModel modelo1 = (DefaultTableModel) tblProducto.getModel();
        Set<Producto> lista = controladorProducto.getLista();
        for (Producto producto : lista) {
            Object[] datos = {producto.getCodigo(),
                producto.getNombre(),
                producto.getPrecio()};
            modelo1.addRow(datos);
        }
    }
    public static void cambiarIdioma(Locale localizacion){
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        Object[] columnas = {mensajes.getString("cliente.codigo"),mensajes.getString("cliente.nombre"), mensajes.getString("producto.precio")};
        modelo.setColumnIdentifiers(columnas);
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("LISTAR PRODUCTO");

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio"
            }
        ));
        tblProducto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    // End of variables declaration//GEN-END:variables

}
