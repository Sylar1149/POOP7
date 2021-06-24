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
public class Gerente extends Empleado {
    private int presupuesto;

    public Gerente() {
    }

    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    
    

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
   
    
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
}
