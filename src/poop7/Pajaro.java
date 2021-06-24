/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *
 * @author Miguel Lozano
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Soy un pajaro y puedo recolectar ramas para un nido");
    }

    @Override
    public String toString() {
        return super.toString()+
                "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    
}
