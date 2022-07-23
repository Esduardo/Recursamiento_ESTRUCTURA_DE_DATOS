import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner entrada =  new Scanner(System.in);
    public static void main (String [] srgs){
        menu();
    }

    public static void menu() {
        int opc;
        do{
                System.out.println("::              Recu            ::" +
                        "\n::  1. Registrar Participante   ::" +
                        "\n::  2. Consulta 1  Folio y      ::" +
                        "\n::     nombre de participantes  ::" +
                        "\n::  3. Consulta 2  Nombres de   ::" +
                        "\n::     postres                  ::" +
                        "\n::  4. Busqueda (Por nombre  y  ::" +
                        "\n::     visualizar ingredientes  ::" +
                        "\n::  5 .Salir                     ::");
            System.out.printf("       : ");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    Registro.registro();
                    break;
                case 2:
                    Consultas.consulta1();
                    break;
                case 3:
                    Consultas.consulta2();
                    break;
                case 4:
                    Consultas.busqueda();
                    break;
                case 5:
                    System.out.println("BYE :)");
                    break;
                default:
                    System.out.println("NO EXISTE :[");
            }
        }while(opc != 5);
    }
}
