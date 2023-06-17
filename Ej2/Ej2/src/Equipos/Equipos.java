/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Equipos;
import deportistas.Deportista;
import interfaz.IDeporte;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class Equipos implements IDeporte{
    String nombre;
    java.util.List<Deportista> miembros;
    
    public Equipos(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean conformar(java.util.List<Deportista> deportistas){
        Scanner in = new Scanner(System.in);
        this.miembros = deportistas;
        for(int i = 0;i < miembros.size(); i++){
            miembros.get(i).setNumJugador(i+1);
        }
        return true;
    }
    @Override
    public void mostrar(){
        System.out.println(miembros);
    }
    @Override
    public void numDeportista(){
    
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", miembros=" + miembros + '}';
    }
    
}
