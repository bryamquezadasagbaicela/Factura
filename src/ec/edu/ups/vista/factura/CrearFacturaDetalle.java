/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.factura;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.modelo.Producto;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author 59398
 */
public class CrearFacturaDetalle extends javax.swing.JInternalFrame {

    private ControladorFactura controladorFactura;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private ControladorProducto controladorProducto;
    private Set<Producto> listaProductos;
    double SubTotal;

    /**
     * Creates new form CrearFacturaDetalle
     */
    public CrearFacturaDetalle(ControladorFacturaDetalle controladorFacturaDetalle, ControladorProducto controladorProducto) {
        initComponents();
        this.controladorFacturaDetalle = controladorFacturaDetalle;
        this.controladorProducto = controladorProducto;
        txtCodigo.setText(String.valueOf(this.controladorFacturaDetalle.getCodigo()));
        listaProductos = controladorProducto.getLista();
        for (Producto producto : listaProductos) {
            cbxanadirProducto.addItem(producto.getNombre());
        }
        productoEncontrado();
    }

    public void productoEncontrado() {
        Producto producto = buscarProducto();
        txtPrecioUnitario.setText(String.valueOf(producto.getPrecio()));
    }

    public Producto buscarProducto() {
        Producto l = new Producto();
        for (Producto producto : listaProductos) {
            if (cbxanadirProducto.getSelectedItem().toString().equalsIgnoreCase(producto.getNombre())) {
                l = producto;
            }
        }
        return l;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cbxanadirProducto = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        AnadirLista = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Codigo");

        jLabel2.setText("FACTURA DETALLE");

        jLabel3.setText("Producto");

        jLabel4.setText("P.Unitario");

        cbxanadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxanadirProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        jLabel6.setText("Sub Total");

        txtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUnitarioActionPerformed(evt);
            }
        });

        AnadirLista.setText("Añadir ");
        AnadirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirListaActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular");
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
                .addGap(135, 135, 135)
                .addComponent(jLabel2)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioUnitario)
                            .addComponent(txtCantidad)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxanadirProducto, 0, 163, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnadirLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxanadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnadirLista))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnadirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirListaActionPerformed
        Producto producto = buscarProducto();
        FacturaDetalle facturaDetalle = new FacturaDetalle();
        facturaDetalle.setPrecio(Double.parseDouble(txtPrecioUnitario.getText()));
        facturaDetalle.setCantidad(Integer.parseInt(txtCantidad.getText()));
        facturaDetalle.setSubtotal(Double.parseDouble(txtSubTotal.getText()));
        facturaDetalle.setProducto(producto);
        facturaDetalle.setCodigoFactura(CrearFactura.codigoFac);
        controladorFacturaDetalle.crear(facturaDetalle);
        Object[] fila = {facturaDetalle.getCodigo(), producto.getNombre(), facturaDetalle.getPrecio(), facturaDetalle.getCantidad(), facturaDetalle.getSubtotal()};
        CrearFactura.modeloTabla.addRow(fila);
        JOptionPane.showMessageDialog(this, "Se ha ingresado el Producto", "Añadir Producto", JOptionPane.OK_OPTION);
        //Setear codigo
        //vaciar Txts
        txtCodigo.setText(String.valueOf(this.controladorFacturaDetalle.getCodigo()));
        txtCantidad.setText("");
        txtSubTotal.setText("");
        AnadirLista.setEnabled(false);
    }//GEN-LAST:event_AnadirListaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtPrecioUnitario.getText().isEmpty()) {
        } else if (txtCantidad.getText().isEmpty()) {
        } else {
            SubTotal = (Double.parseDouble(txtPrecioUnitario.getText())) * (Double.parseDouble(txtCantidad.getText()));
            txtSubTotal.setText(String.valueOf(SubTotal));
            AnadirLista.setEnabled(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUnitarioActionPerformed

    private void cbxanadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxanadirProductoActionPerformed
         buscarProducto();
    }//GEN-LAST:event_cbxanadirProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnadirLista;
    private javax.swing.JComboBox cbxanadirProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables

}
