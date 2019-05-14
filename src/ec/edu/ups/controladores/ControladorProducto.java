/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 59398
 */
public class ControladorProducto {
     private Set<Producto> lista;
    private int codigo;

    public ControladorProducto() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    public void crear(Producto objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
   
    
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                return producto;
            }
        }        
        return null;
    }
    
    public void update(Producto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                lista.remove(producto);
                break;
            }
        }  
    } 

    public Set<Producto> getLista() {
       
        return lista;
    
  }
}
