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
public class AnimalAereo extends Animal{
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    public void volar(){
        System.out.println("Soy un animal aereo y puedo volar");
    }
    
    public void comer(){
        System.out.println("Soy un animal aereo y estoy comiendo semillas");
    }

    @Override
    public String toString() {
        return super.toString()+
                "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }   
}
