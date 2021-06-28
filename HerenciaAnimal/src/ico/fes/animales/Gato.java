
package ico.fes.animales;

public class Gato extends Animal{
    private String raza;
    private String cola;
    private String pelaje;
    private String orejas;

    public Gato() {
    }

    public Gato(String raza, String cola, String pelaje, String orejas) {
        this.raza = raza;
        this.cola = cola;
        this.pelaje = pelaje;
        this.orejas = orejas;
    }

    public Gato(String raza, String cola, String pelaje, String orejas, int numDePatas, String sonido, String lengua, String ojos) {
        super(numDePatas, sonido, lengua, ojos);
        this.raza = raza;
        this.cola = cola;
        this.pelaje = pelaje;
        this.orejas = orejas;
    }

    public String getOrejas() {
        return orejas;
    }

    public void setOrejas(String orejas) {
        this.orejas = orejas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gato{" + "raza=" + raza + ", cola=" + cola + ", pelaje=" + pelaje + ", orejas=" + orejas + '}';
    }
    
}
