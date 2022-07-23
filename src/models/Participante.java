package models;

public class Participante {
    private int folio;
    private String nombre;
    private String nombreLugar;
    Postre postre;
    public Participante(int folio, String nombre, Postre postre, String nombreLugar){
        this.nombre = nombre;
        this.nombreLugar = nombreLugar;
        this.folio =  folio;
        this.postre = postre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public int getFolio() {
        return folio;
    }
}
