package mx.unam.aragon.dp;

public class Persona {
    private String nombre;
    private String apPatern;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona() {
    }

    public Persona(String nombre, String apPatern, String apMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apPatern = apPatern;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPatern() {
        return apPatern;
    }

    public void setApPatern(String apPatern) {
        this.apPatern = apPatern;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apPatern=" + apPatern + ", apMaterno=" + apMaterno + ", edad=" + edad + ", curp=" + curp + '}';
    }
    
    
    
}
