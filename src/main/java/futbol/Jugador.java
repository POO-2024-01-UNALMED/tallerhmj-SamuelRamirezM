package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        this("Maradona", 30, "delantero", (short) 289, (byte) 7);
    }

    @Override
    public int compareTo(Object o) {
        if (f instanceof Jugador) {
            Jugador p = (Jugador) f;
            return Math.abs(this.getEdad() - p.getEdad());
        }
        return this.getEdad();
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}
