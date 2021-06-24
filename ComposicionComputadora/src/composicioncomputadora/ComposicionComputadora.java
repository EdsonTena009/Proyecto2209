/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncomputadora;
    

import ico.fes.objetos.CPU;
import ico.fes.objetos.Computadora;
import ico.fes.objetos.Monitor;
import ico.fes.objetos.Mouse;
import ico.fes.objetos.Teclado;




/**
 *
 * @author alete
 */
public class ComposicionComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Computadora c1 = new Computadora("HP", "  Pavillion"); CPU cpu1 = new CPU ("Procesador AMD", "  FX", 4 ); Monitor m1 = new Monitor ("LG", "  Flatron", 24); 
        Mouse m11 = new Mouse ("Logitech", "  G502 Hero", "  alambrico"); Teclado t1 = new Teclado("Corsair", "  Speed",   87,   10);
        
                 System.out.println(c1.getMarca());
                 System.out.println(c1.getModelo());
                 System.out.println(cpu1.getMarca());
                 System.out.println(cpu1.getModelo());
                 System.out.println(cpu1.getVelocidadProcesador() + " HZ");
                 System.out.println(m1.getMarca());
                 System.out.println(m1.getModelo());
                 System.out.println(m1.getPulgadas()+ " pulgadas");
                 System.out.println(m11.getMarca());
                 System.out.println(m11.getModelo());
                 System.out.println(m11.getTipo());
                 System.out.println(t1.getMarca());
                 System.out.println(t1.getModelo());
                 System.out.println(t1.getNumeroDeTeclas()+ " Numeros de teclas");
                 System.out.println(t1.getMultimedia());
        // TODO code application logic here
    }
    
}
