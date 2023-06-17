/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deportistas;

/**
 *
 * @author Sebastian
 */
public class Deportista {
    String nombre;
    String dni;
    int numJugador;

    public Deportista(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    @Override
    public String toString() {
        return "Deportista{" + "nombre=" + nombre + ", dni=" + dni + ", numJugador=" + numJugador + '}';
    }
    
    
    
}
