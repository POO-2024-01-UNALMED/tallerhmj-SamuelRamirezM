package futbol;

public class Jugador extends Futbolista {
    //Atributos
    public short golesMarcados;
    public byte dorsal;

    //Constructor 5 parámetros
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    //Constructor sin parámetros
    public Jugador() {
        this("Maradona", 30, "delantero", 289, 7);
    }

    @Override
    public int compareTo(Futbolista o) {
        return Math.abs(this.getEdad() - o.getEdad());
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
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}