import java.util.ArrayList;
/**
 * Write a description of class Tienda here.
 *
 * @author (David Rodriguez)
 * @date (24-01-2018  10:47)
 */
public class Tienda
{
    // Array que guarda los instrumentos
    private ArrayList <Instrumento> instrumentos;
    // Define un numero identificativo
    private int id;
    /**
     * Constructor de Tienda
     */
    public Tienda()
    {
        instrumentos = new ArrayList<Instrumento>();
        id = 1;
    }
    
    /**
     * Añade instrumentos
     */
    public void addInstrumento(String instrumento, String marca, int precio, int id)
    {
        Instrumento nuevoInstrumento = new Instrumento(instrumento,marca,precio,id);
        instrumentos.add(nuevoInstrumento);
        id= id+1;
    }
    
    /**
     *  Muestra un listado de los objetos
     *  pertenecientes a la colección con todos sus datos
     */
    public void listarObjetos()
    {
        System.out.println("Instrumentos :");
        
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento.devolverCaracteristicas());
        }
    }
    
}
