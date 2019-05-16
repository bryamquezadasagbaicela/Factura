/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author 59398
 */
public class FacturaDetalle {
     private int codigo;
    private double precio;
    private int cantidad;
    private double subtotal;
    private Producto producto;
    private int codigoFactura;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigo, double precio, int cantidad, double subtotal, Producto producto, int codigoFactura) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
        this.codigoFactura = codigoFactura;
    }

    
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

   
    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + ", codigoFactura=" + codigoFactura + '}';
    }
}
