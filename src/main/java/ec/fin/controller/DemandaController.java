/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.controller; 
/**
 *
 * @author c.idrovo
 */ 
import ec.fin.model.Demanda;
import ec.fin.model.GestorDemanda; 
import ec.fin.model.Originador;
public class DemandaController {
    
    Originador originador;  
    GestorDemanda cuidador;
    Demanda demanda; 
    
    public DemandaController() {
        originador = new Originador(); 
        cuidador = new GestorDemanda();
        demanda = new Demanda();
    } 
    
    public void agregar(String estado){ 
        demanda = new Demanda(); 
        demanda.setEstado(estado);  
        originador.setDemanda(demanda);
        cuidador.agregarMemento(originador.guardarEstado()); 
    }
    
    public String restaurarEstado(int index){ 
        originador.restaurarEstado(cuidador.obtenerMemento(index));  
        return originador.getDemanda().getEstado();
    }
    
    
    
}
