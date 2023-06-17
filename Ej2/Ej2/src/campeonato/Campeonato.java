
package campeonato;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import interfaz.IDeporte;
import parejas.parejas;
import Equipos.Equipos;
import deportistas.Deportista;
import java.util.Scanner;
/**
 *
 * @author Sebastian
 */

public class Campeonato {
    public static final String SEPARADOR = ",";
	
    public static List<Deportista>leerArchivo(String nombreArchivo)throws IOException{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null){ 
             // Sepapar la linea leída con el separador definido previamente
             try{
                String[] campos = linea.split(SEPARADOR); 
                Deportista d = new Deportista(campos[0],campos[1]);
                datos.add(d);  
            }
             catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Deportista sin DNI o sin nombre");
            }
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
         // Cierro el buffer de lectura
         if (bufferLectura != null) {
             bufferLectura.close();
         }
        }
        return datos;
    }
    /**
    * Crea los equipos con los datos pasados como parámetro
    * @param datos lista con todos los deportistas inscriptos
     * @param cantidadJugadores cantidad de jugadores que conforman un equipo
     * @return una lista de equipos
    */
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores){
        
        List<IDeporte> Equipos = new ArrayList<IDeporte>();
        Scanner in = new Scanner(System.in);
        try{
            for(int i = 0; i< datos.size(); i+= cantidadJugadores){
            System.out.println("Nombre de equipo "+ i/cantidadJugadores +": ");
            Equipos e = new Equipos(in.nextLine());
            e.conformar(datos.subList(i,i+cantidadJugadores));
            Equipos.add(e);
            }

        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Cantidad insuficientes de jugadores para conformar un equipo");
        }
        return Equipos;
    }
    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public static List<IDeporte> creaParejas(List<Deportista> datos){
        List<IDeporte> Parejas = new ArrayList<IDeporte>();
        try{ 
            for(int i = 0; i< datos.size(); i+= 2){
            parejas p = new parejas();
            p.conformar(datos.subList(i,i+2));
            Parejas.add(p);
            }

        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Cantidad insuficientes de jugadores para conformar una pareja");
        }

        return Parejas;
    }
    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    public static void numerar(List<IDeporte> datos){
        
    }
    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */
    public static void mostrar(List<IDeporte> datos){
          for(int i = 0; i < datos.size(); i++){
              System.out.println(datos.get(i));
          }
    }
    

           
}
 

