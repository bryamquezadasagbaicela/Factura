/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 59398
 */
public class ControladorFacturaDetalle {
   
 private Set<FacturaDetalle> lista;
    private int codigo;

    public ControladorFacturaDetalle() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    public void crear(FacturaDetalle objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
   
    
    public FacturaDetalle read(int codigo){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo() == codigo){
                return facturaDetalle;
            }
        }        
        return null;
    }
    
    
    public void update(FacturaDetalle objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo() == codigo){
                lista.remove(facturaDetalle);
                break;
            }
        }  
    } 
     public Set<FacturaDetalle> getLista(){
 
            return lista;
        
    }   
}
