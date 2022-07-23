package models;

import java.util.Scanner;

public class Consultas {
    static Ingredientes[] arregloAR = new Ingredientes[3];
    static Scanner entrada = new Scanner(System.in);
    public static void consulta1(){
        for(int i = 0; i < Registro.listaParticipantes.size(); i++){
            System.out.println("::  Folio: " + Registro.listaParticipantes.get(i).getFolio());
            System.out.println(":: Nombre: " + Registro.listaParticipantes.get(i).getNombre());
        }
    }

    public static void consulta2(){
        for(int i = 0; i < Registro.listaParticipantes.size(); i++){
            System.out.println(":: Nombre Postre: " + (i + 1) + ": " + Registro.listaParticipantes.get(i).postre.getNombrePostre());
        }
    }
    public static void busqueda(){
        String nomPos;
        System.out.printf(":: Ingresa el nombre del postre: ");
        nomPos = entrada.next();
        boolean isExist =  false;
        for(int i = 0; i < Registro.listaParticipantes.size(); i++){
            if(Registro.listaParticipantes.get(i).postre.getNombrePostre().equals(nomPos)){
                arregloAR = Registro.listaParticipantes.get(i).postre.getArregloI();
                isExist = true;
            }
        }
        if(isExist){
            System.out.println("::          INGREDIENTES            ::");
            System.out.println(arregloAR[0].getIngrediente());
            System.out.println(arregloAR[1].getIngrediente());
            System.out.println(arregloAR[2].getIngrediente());
        } else {
            System.out.println("NO existe :[");
        }
    }
}
