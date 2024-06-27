package com.finalbetplay.views;

import java.util.Scanner;

import com.finalbetplay.Controller;
import com.finalbetplay.clases.Jugador;

public class viewJugador {
    public static Controller controladorJugador;

    public void startJugador(){
        Scanner scannerJugador = new Scanner(System.in);
        while (true) { 
            System.out.println("1. Agregar jugador");
            System.out.println("2. Actualizar jugador");
            System.out.println("3. Listar jugadores");
            System.out.println("4. Eliminar jugador");

            System.out.println("Selecciona la opción deseada: ");
            int choice = scannerJugador.nextInt();
            scannerJugador.nextLine();

            switch (choice) {
                case 1:
                    Jugador jugadores = new Jugador();
                    System.out.println("Ingrese el ID del jugador");
                    jugadores.setId(scannerJugador.nextInt());
                    System.out.println("Ingrese el nombre del jugador");
                    jugadores.setNombre(scannerJugador.nextLine());

                    break;
                default:
                    throw new AssertionError();
            }
          


            

        }}
    }

