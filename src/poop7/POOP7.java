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
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gerente ger = new Gerente();
        ger.setNombre("Saul Juarez");
        ger.setNumEmpleado(9638);
        ger.setSueldo(16000);
        
        System.out.println(ger);
        System.out.println(ger.getNombre());
        System.out.println(ger.getNumEmpleado());
        System.out.println(ger.getSueldo());
        ger.aumentarSueldo(10);
        System.out.println(ger.getSueldo());
        ger.asignarPresupuesto(100000);
        System.out.println(ger.getPresupuesto());
        
        System.out.println("################Ej2###################");
        
        if(ger instanceof Gerente){
            System.out.println("Instancia de Gerente");
        }
        if(ger instanceof Empleado){
            System.out.println("Instancia de Empelado");
        }
        if(ger instanceof Object){
            System.out.println("Instancia de Object");
        }
        
        System.out.println("################Ej3###################");
        
        Gerente ger2 = new Gerente(500000, "Paula Axul",1243,20000);
        System.out.println(ger2);
        
        System.out.println("\n###############Extra##################");
        System.out.println("###############Ballena##################");
        
        Ballena whale = new Ballena(15,2,"Ballena pequeña","Australia","azul");
        whale.sonido("hablar cetaceo");
        whale.comer();
        whale.nadar();
        whale.pelearConPicho();
        System.out.println(whale);
        
        System.out.println("\n###############Perro##################");
        
        Perro dog = new Perro("Rojo",4,"Nico","CDMX","Cafe con manchas");
        dog.sonido("ladrar");
        dog.comer();
        dog.correr();
        dog.hacerTrucos();
        System.out.println(dog);
        
        System.out.println("\n###############Pajaro##################");
        
        Pajaro bird = new Pajaro("Pico carpintero",2,"Pajaro Carpintero","Madagascar","Rojo con negro");
        bird.sonido("decir pio");
        bird.comer();
        bird.volar();
        bird.recolectarRamas();
        System.out.println(bird);
        
        
    }
    
}
