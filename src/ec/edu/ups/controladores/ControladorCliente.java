/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 59398
 */
public class ControladorCliente {
    private Set <Cliente> lista;
    private int codigo;
    
    public ControladorCliente(){
        lista = new HashSet<>();
        int codigo = 0;
    }
    public void create(Cliente objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }

    public Cliente read(int codigo) {
        for(Cliente cliente : lista){
            if(cliente.getCodigo()== codigo){
               return cliente; 
            }
        }
        return null;
    }

    public void update(Cliente objeto) {
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for(Cliente cliente : lista){
            if(cliente.getCodigo()== codigo){
               lista.remove(cliente);
               break;
            }
        }
        
    }

    public void listar(){
        System.out.println("lista ");
        for(Cliente objeto : this.lista){
            System.out.println(objeto.getNombre());
        }
    }
    
    public int getCodigo(){
        return codigo;
    }

    public Object getCont() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void guardar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
