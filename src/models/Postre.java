package models;

public class Postre {
    private String nombrePostre;
    private int id;

    private  Ingredientes[] arregloI;

    public Postre(String nombrePostre, int id, Ingredientes[] arregloI) {
        this.nombrePostre = nombrePostre;
        this.id = id;
        this.arregloI = arregloI;
    }

    public String getNombrePostre() {
        return nombrePostre;
    }

    public int getId() {
        return id;
    }

    public Ingredientes[] getArregloI() {
        return arregloI;
    }
}
