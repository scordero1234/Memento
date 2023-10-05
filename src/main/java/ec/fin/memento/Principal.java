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
        System.out.println("El credito se encuentra restaurado: " + originador.getDemanda().getEstado());
        d = new Demanda();
        d.setNumeroCredito("23002");
        d.setMonto(3300);
        d.setEstado("citacion");
          System.out.println("El credito : " + originador.getDemanda().getEstado());
        // Cambiamos el estado nuevamente y guardamos otra instantánea
        originador.setDemanda(d);
        cuidador.agregarMemento(originador.guardarEstado());
        d = new Demanda();
        d.setNumeroCredito("23002");
        d.setMonto(3300);
        d.setEstado("embargo");
        cuidador.agregarMemento(originador.guardarEstado());
            System.out.println("El credito : " + originador.getDemanda().getEstado());
         d = new Demanda();
        d.setNumeroCredito("23002");
        d.setMonto(3300);
        d.setEstado("liquidacion");
        cuidador.agregarMemento(originador.guardarEstado());
             System.out.println("El credito : " + originador.getDemanda().getEstado());
         d = new Demanda();
        d.setNumeroCredito("23002");
        d.setMonto(3300);
        d.setEstado("insolvencia");
        cuidador.agregarMemento(originador.guardarEstado());
             System.out.println("El credito : " + originador.getDemanda().getEstado());
        // Restauramos a un estado previo
        originador.restaurarEstado(cuidador.obtenerMemento(2));
        System.out.println("El credito se encuentra restaurado: " + originador.getDemanda().getEstado());

    }
}
