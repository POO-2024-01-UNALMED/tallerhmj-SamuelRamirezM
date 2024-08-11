public abstract class Futbolista implements Comparable<Futbolista> {
    //Atributos
    private String nombre;
    private int edad;
    private final String posicion;

    //Constructor 3 parámetros
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    //Constructor sin parámetros
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    //Métodos
    @Override
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", juega de " + posicion;
    }

    public boolean equals(Futbolista f) {
        //Terminar
        return true;
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
