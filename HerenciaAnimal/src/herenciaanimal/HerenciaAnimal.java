/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimal;

import ico.fes.animales.Animal;
import ico.fes.animales.Gato;
import ico.fes.animales.Perro;



/**
 *
 * @author alete
 */
public class HerenciaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1=new Animal(4, "guau", "Si", "Si");
        Animal a2=new Animal(4, "miau", "Si", "Si");
        Perro p1=new Perro("Pug", "Si", "Si", "Si");
        Gato g1=new Gato("Siames", "Si", "Si", "Si");
        
        System.out.println("Raza: "+p1.getRaza());
        System.out.println("Patas: "+a1.getNumDePatas());
        System.out.println("Sonido: "+a1.getSonido());
        System.out.println("Lengua: "+a1.getLengua());
        System.out.println("Ojos: "+a1.getOjos());
        System.out.println("Cola: "+p1.getCola());
        System.out.println("Garras: "+p1.getGarras());
        System.out.println("Nariz: "+p1.getNariz());
        System.out.println("-------------------------------------------------");
        System.out.println("Raza: "+g1.getRaza());
        System.out.println("Patas: "+a2.getNumDePatas());
        System.out.println("Sonido: "+a2.getSonido());
        System.out.println("Lenguaje: "+a2.getLengua());
        System.out.println("Ojos: "+a2.getOjos());
        System.out.println("Cola: "+g1.getCola());
        System.out.println("Pelaje: "+g1.getPelaje());
        System.out.println("Orejas: "+g1.getOrejas());
    }
    
}
