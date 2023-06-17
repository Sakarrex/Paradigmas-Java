/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorViajeros gestor;
        Scanner in = new Scanner(System.in);
        System.out.println("Cantidad viajeros: ");
        if (in.hasNextInt()) {
           gestor = new GestorViajeros(in.nextInt());
           System.out.println("1: cargar viajero"
                   + "2: Mostrar viajeros"
                   + "3: Consultar millas"
                   + "4: Acumular millas"
                   + "5: Canjear millas"
                   + "6: Mejor viajero"
                   + "0: salir");
           int opcion = in.nextInt();
           while(opcion != 0){
               switch(opcion){
                   case 1: gestor.crearViajero();break;
                   case 2: gestor.mostrarViajero(gestor.buscarViajero());break;
                   case 3: gestor.consultarMillas(gestor.buscarViajero());break;
                   case 4: System.out.println("Cantidad de millas: ");
                       gestor.acumularMillas(gestor.buscarViajero(),in.nextInt());break;
                   case 5: System.out.println("Cantidad de millas: ");
                       gestor.acumularMillas(gestor.buscarViajero(),in.nextInt());break;
                   case 6: gestor.mejorViajero();break;
               }
               System.out.println("1: cargar viajero"
                   + "2: Mostrar viajeros"
                   + "3: Consultar millas"
                   + "4: Acumular millas"
                   + "5: Canjear millas"
                   + "6: Mejor viajero"
                   + "0: salir");
               opcion = in.nextInt();
               
           }
        }
        
        
    }
    
}

/*
1
Jose
Marcos
1234534
1
Antonio
Perez
7847283
1
Maria
Claudia
8468134
*/