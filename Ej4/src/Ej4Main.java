import java.util.Scanner;

public class Ej4Main {
    
    public static void main(String[] args) {
        GestorViajeros gestor = new GestorViajeros();
        Scanner in = new Scanner(System.in);  
        System.out.println("1: cargar viajero"
                   + "2: Mostrar viajeros ordenado por millas"
                   + "3: Acumular millas"
                   + "4: Viajeros con mas de 200 millas"
                   + "5: viajero con mas millas"
                   + "0: salir");
           int opcion = in.nextInt();
           while(opcion != 0){
               switch(opcion){
                   case 1: gestor.crearViajero();break;
                   case 2: gestor.viajerosporMillas();break;
                   case 3: gestor.acumularMillas(in.nextInt(), in.nextInt());break;
                   case 4:gestor.viajerosConMas200();break;
                   case 5:gestor.viajeroConMasMillas();
               }
               System.out.println("1: cargar viajero"
                   + "2: Mostrar viajeros ordenado por millas"
                   + "3: Acumular millas"
                   + "4: Viajeros con mas de 200 millas"
                   + "5: viajero con mas millas"
                   + "0: salir");
               opcion = in.nextInt();
               
           }
    }
}
