/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.model;

/**
 *
 * @author s.corderoc
 */
public class Originador {
    private Demanda demanda; 


    public Memento guardarEstado() {
        return new Memento(demanda);
    }

    public void restaurarEstado(Memento memento) {
        this.demanda = memento.getDemanda();
    }

    public Demanda getDemanda() {
        return demanda;
    }

    public void setDemanda(Demanda demanda) {
        this.demanda = demanda;
    }
}
