package futbol;

public class Portero extends Futbolista {
    //Atributos
    public short golesRecibidos;
    public byte dorsal;

    //Constructor n parámetros
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos(Futbolista f) {
        if (f instanceof Portero) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    public int compareTo(Futbolista o) {
        return this.golesRecibidos;
    }

}
