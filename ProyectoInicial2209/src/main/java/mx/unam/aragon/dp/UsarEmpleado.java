package mx.unam.aragon.dp;

import java.util.Set;

public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1= new Empleado(1, "Sistemas", 45000.0f, 15);
                emp1.setNombre("Juan Jose");
                emp1.setApPatern("Garcia");
                emp1.setApMaterno("Bolanios");
                emp1.setEdad(24);
                emp1.setCurp("GABJ11JNEJWDF");
                System.out.print( "info:" + emp1);
        
    }
}
