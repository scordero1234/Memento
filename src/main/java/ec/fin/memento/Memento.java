/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.memento;

/**
 *
 * @author s.corderoc
 */
class Memento {
     private Demanda demanda;

    public Memento(Demanda demanda) {
        this.demanda = demanda;
    }

    public Demanda getDemanda() {
        return demanda;
    }

    public void setDemanda(Demanda demanda) {
        this.demanda = demanda;
    }

  
}
