/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parejas;

import deportistas.Deportista;
import interfaz.IDeporte;
/**
 *
 * @author Sebastian
 */
public class parejas implements IDeporte{
        java.util.List<Deportista> miembros;
    @Override
    public boolean conformar(java.util.List<Deportista> deportistas){
        this.miembros = deportistas;
        this.numDeportista();
        return true;
    }
    @Override
    public void mostrar(){
        System.out.println(miembros);
    }
    @Override
    public void numDeportista(){
         for(int i = 0;i < miembros.size(); i++){
            miembros.get(i).setNumJugador(i+1);
        }
    }

    @Override
    public String toString() {
        return "parejas{" + "miembros=" + miembros + '}';
    }
    
    
}
