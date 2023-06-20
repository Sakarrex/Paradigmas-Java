import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Optional;

public class GestorViajeros {
    
    private List<Viajero> listViajeros;

    public GestorViajeros() {
        
        this.listViajeros = new ArrayList<Viajero>();
        
    }

    public void crearViajero(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = in.nextLine();
        System.out.println("Apellido: ");
        String apellido = in.nextLine();
        System.out.println("Dni: ");
        String dni = in.nextLine();
        this.listViajeros.add(new Viajero(this.listViajeros.size(), dni, nombre, apellido, 0));
    }
    
    public void viajerosporMillas(){
        List<Viajero> listaordenada = this.listViajeros.parallelStream().sorted(Comparator.comparing(Viajero::getMillas)).collect(Collectors.toList());
        System.out.println(listaordenada);
    }

    public void viajerosConMas200(){
        List<String> resultado = this.listViajeros.parallelStream().filter(x -> x.getMillas()>200).map(i -> i.getNombre()).collect(Collectors.toList());
        System.out.println(resultado);
    }

    public void viajeroConMasMillas(){
        Optional<Viajero> resultado = this.listViajeros.parallelStream().max(Comparator.comparing(Viajero::getMillas));
        System.out.println(resultado);
    }

    public void acumularMillas(int i,int millas){
        try{
            this.listViajeros.get(i).setMillas(millas);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Viajero no encontrado");
        }
    }

    }


    
    

