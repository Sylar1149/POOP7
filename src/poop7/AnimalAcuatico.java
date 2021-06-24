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
public class AnimalAcuatico extends Animal {
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    
    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    public void nadar(){
        System.out.println("Soy un animal acuatico y puedo nadar");
    }
    
    public void comer(){
        System.out.println("Soy un animal acuatico y estoy comiendo peces");
    }

    @Override
    public String toString() {
        return super.toString()+
                "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
}

