package models;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Registro {

    public static ArrayList<Participante> listaParticipantes =  new ArrayList<>();
    static Ingredientes[] arregloAR;
    static Ingredientes ingredientes;
    static Participante participante;
    static Postre postre;
    static Scanner entrada = new Scanner(System.in);
    static Random random =  new Random();

    public static String registro() {
        String nombre;
        String lugar;
        String nomPostre;
        String ingrediente;
        int folio, folioPostre;
        System.out.println("::              Recu            ::" +
                "\n::  Nombre de Participante:     ::");
        System.out.printf("   : ");
        nombre = entrada.next();
        System.out.println("::  Lugar de participante:      ::");
        System.out.printf("   : ");
        lugar = entrada.next();
        System.out.println("::   Registro de Postre:        ::");
        System.out.println("::   Nombre de Postre:          ::");
        System.out.printf("   : ");
        folioPostre = random.nextInt(1000);
        nomPostre = entrada.next();
        arregloAR = new Ingredientes[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Ingrediente " + (i + 1) + ": ");
            ingrediente = entrada.next();
            ingredientes =  new Ingredientes(ingrediente);
            arregloAR[i] = ingredientes;
        }
        postre = new Postre(nomPostre, folioPostre, arregloAR);
        folio = random.nextInt(100);
        participante = new Participante(folio, nombre, postre, lugar);
        listaParticipantes.add(participante);
        comprobante(nombre);
        return nombre;
    }

    public static void comprobante(String nombre){
        String nom =  nombre;
        System.out.println("::              Comprobante            ::");
        for(int i = 0; i < listaParticipantes.size(); i++){
            if(nom == listaParticipantes.get(i).getNombre()){
                System.out.println("::         Folio: " + listaParticipantes.get(i).getFolio());
                System.out.println("::        Nombre: " + listaParticipantes.get(i).getNombre());
                System.out.println(":: Nombre Postre: " + listaParticipantes.get(i).postre.getNombrePostre());
                System.out.println("::         Lugar: " + listaParticipantes.get(i).getNombreLugar() + "\n");
                }
        }
    }
}

