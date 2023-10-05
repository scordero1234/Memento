/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.fin.memento;

/**
 *
 * @author s.corderoc
 */
public class Principal {

    public static void main(String[] args) {

        Originador originador = new Originador();
        Cuidador cuidador = new Cuidador();

        Demanda d = new Demanda();
        d.setNumeroCredito("230022");
        d.setMonto(3300);
        d.setEstado("inicio Demanda");
        // Cambiamos el estado y guardamos la instantánea
        originador.setDemanda(d);
        cuidador.agregarMemento(originador.guardarEstado());

        d = new Demanda();
        d.setNumeroCredito("23002");
        d.setMonto(3300);
        d.setEstado("citacion");
        // Cambiamos el estado nuevamente y guardamos otra instantánea
        originador.setDemanda(d);
        cuidador.agregarMemento(originador.guardarEstado());
        d = new Demanda();
        d.setNumeroCredito("230032");
        d.setMonto(3300);
        d.setEstado("citacion");
        cuidador.agregarMemento(originador.guardarEstado());
        // Restauramos a un estado previo
        originador.restaurarEstado(cuidador.obtenerMemento(1));
        System.out.println("Estado restaurado: " + originador.getDemanda().getEstado());

    }
}
