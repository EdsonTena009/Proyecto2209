package ico.fes.animales;

public class Perro extends Animal{
    private String raza;
    private String cola;
    private String garras;  
    private String nariz;

    public Perro() {
    }

    public Perro(String raza, String cola, String garras, String nariz) {
        this.raza = raza;
        this.cola = cola;
        this.garras = garras;
        this.nariz = nariz;
    }

    public Perro(String raza, String cola, String garras, String nariz, int numDePatas, String sonido, String lengua, String ojos) {
        super(numDePatas, sonido, lengua, ojos);
        this.raza = raza;
        this.cola = cola;
        this.garras = garras;
        this.nariz = nariz;
    }

    public String getNariz() {
        return nariz;
    }

    public void setNariz(String nariz) {
        this.nariz = nariz;
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

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", cola=" + cola + ", garras=" + garras + ", nariz=" + nariz + '}';
    }
     
}
