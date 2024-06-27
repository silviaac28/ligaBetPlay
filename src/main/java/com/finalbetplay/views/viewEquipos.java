package com.finalbetplay.views;
import java.util.Scanner;

import com.finalbetplay.Controller;

public class viewEquipos {

    public static Controller controlador;

    public void startEquipos(){

        Scanner scannerEquipos = new Scanner(System.in);
        while (true){
            System.out.println("GESTION EQUIPOS ");
            System.out.println("1. AGREGAR EQUIPO: ");
            System.out.println("2. EDITAR EQUIPO: ");
            System.out.println("3. ELIMINAR EQUIPO: ");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerEquipos.nextInt();

            
            switch(choice){
                case 1:

                System.out.println("Seleccionaste 1");
                break;

                default: 
                System.out.println("Opción incorrecta. Selecciona una opción válida.");
            }
        }
    }

}
