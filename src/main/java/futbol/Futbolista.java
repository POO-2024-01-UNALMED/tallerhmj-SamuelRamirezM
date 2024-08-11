package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    //Métodos
    @Override
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", juega de " + posicion;
    }

    public boolean equals(Futbolista f) {
        if (f.getNombre().equals(this.nombre) && f.getEdad() == this.edad && f.getPosicion().equals(this.getPosicion())) {
            return true;
        }
        return false;
    }

    public abstract boolean jugarConLasManos(Futbolista f);

    //Getters - Setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }
}
