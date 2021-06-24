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
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Soy un perro y de trucos puedo bailar y dar una vuelta");
    }

    @Override
    public String toString() {
        return super.toString()+
                "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
    
}
