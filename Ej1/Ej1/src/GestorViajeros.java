/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Sebastian
 */
public class GestorViajeros {
    private Integer cantidadViajeros;
    private Integer cantidadActual;
    private Viajero[] arrViajeros;

    public GestorViajeros(Integer cantidadViajeros) {
        this.cantidadViajeros = cantidadViajeros;
        this.arrViajeros = new Viajero[cantidadViajeros];
        this.cantidadActual = 0;
    }

    public void crearViajero(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = in.nextLine();
        System.out.println("Apellido: ");
        String apellido = in.nextLine();
        System.out.println("Dni: ");
        String dni = in.nextLine();
        this.arrViajeros[this.cantidadActual] = new Viajero(this.cantidadActual,dni,nombre,apellido,0);
        this.cantidadActual ++;
    }
    public int buscarViajero(String dni){
        int i = 0;
        while( i < this.cantidadViajeros && !dni.equals(this.arrViajeros[i].getDni())){
            i++;
        }
        if(i>=this.cantidadViajeros){
            i = -1;
        }
        return i;
    }
    public int buscarViajero(){
        Scanner in = new Scanner(System.in);
        System.out.println("Dni: ");
        String dni = in.nextLine();
        int i = 0;
        while( i < this.cantidadViajeros && !dni.equals(this.arrViajeros[i].getDni())){
            i++;
        }
        if(i>this.cantidadViajeros){
            i = -1;
        }
        return i;
    }
    public void mostrarViajero(int i){
        if (i<0){
            System.out.println("Viajero no encontrado");
        }
        else{
            System.out.println(this.arrViajeros[i].toString());
        }
    }         
    public void consultarMillas(int i){
        if (i<0){
            System.out.println("Viajero no encontrado");
        }
        else{
            System.out.println(this.arrViajeros[i].getMillas());
        }
    }
    public void acumularMillas(int i,int millas){
        if (i<0){
            System.out.println("Viajero no encontrado");
        }
        else{
            this.arrViajeros[i].setMillas(millas);
            System.out.println("Millas acumuladas");
        }
    }
    public void canjearMillas(int i,int millas){
        if (i<0){
            System.out.println("Viajero no encontrado");
        }
        else{
            this.arrViajeros[i].canjearMillas(millas);    
        }
    }
    public void mejorViajero(){
        int mejor = -1;
        int pos = -1;
        for( int i = 0; i<=this.cantidadActual; i++){
            if(this.arrViajeros[i].getMillas() > mejor){
                mejor = this.arrViajeros[i].getMillas();
                pos = i;
            }
        }
        System.out.println("Mejor viajero" + this.arrViajeros[pos].toString());
    }
    }


    
    

