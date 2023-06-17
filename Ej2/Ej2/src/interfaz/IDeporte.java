/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import deportistas.Deportista;

/**
 *
 * @author Sebastian
 */
public interface IDeporte {
    int CANTIDAD_MINIMA = 2;
    
    public boolean conformar(java.util.List<Deportista> deportistas);
    public void mostrar();
    public void numDeportista();
   
}
