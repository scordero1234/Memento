/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.fin.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s.corderoc
 */
class Cuidador {
        private List<Memento> mementos = new ArrayList<>();

    public void agregarMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento obtenerMemento(int indice) {
        return mementos.get(indice);
    }
}
