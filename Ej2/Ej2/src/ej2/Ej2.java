/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;


import deportistas.Deportista;
import java.io.IOException;
import java.util.List;
import campeonato.Campeonato;

import interfaz.IDeporte;
/**
 *
 * @author Sebastian
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
        int cantidadJugadoresFutbol= 5;
        
    
        List<Deportista> datosFutbol= Campeonato.leerArchivo("./src/datos/inscriptosFutbol.csv");
        List<Deportista> datosPinPon= Campeonato.leerArchivo("./src/datos/inscriptosPinPon.csv");
        
        List<IDeporte> equipos = Campeonato.creaEquipos(datosFutbol,cantidadJugadoresFutbol);
        List<IDeporte> parejas = Campeonato.creaParejas(datosPinPon);
        
        Campeonato.mostrar(equipos);
        Campeonato.mostrar(parejas);
    }
    
}
