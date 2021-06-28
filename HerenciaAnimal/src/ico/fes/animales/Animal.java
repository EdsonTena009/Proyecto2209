
package ico.fes.animales;

public class Animal {
    private int numDePatas;
    private String sonido;
    private String lengua;
    private String ojos;  

    public Animal() {
    }

    public Animal(int numDePatas, String sonido, String lengua, String ojos) {
        this.numDePatas = numDePatas;
        this.sonido = sonido;
        this.lengua = lengua;
        this.ojos = ojos;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public int getNumDePatas() {
        return numDePatas;
    }

    public void setNumDePatas(int numDePatas) {
        this.numDePatas = numDePatas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    @Override
    public String toString() {
        return "Animal{" + "numDePatas=" + numDePatas + ", sonido=" + sonido + ", lengua=" + lengua + ", ojos=" + ojos + '}';
    }
    
    
    
}
