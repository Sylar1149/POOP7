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
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    public void correr(){
        System.out.println("Soy un animal terrestre y puedo correr");
    }
    
    public void comer(){
        System.out.println("Soy un animal terrestre y estoy comiendo pollo");
    }

    @Override
    public String toString() {
        return super.toString()+
                "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
    
}
