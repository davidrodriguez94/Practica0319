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
        id = 0;
    }
    
    /**
     * Añade instrumentos
     */
    public void addInstrumento(String instrumento, String marca, int precio)
    {
        Instrumento nuevoInstrumento = new Instrumento(instrumento,marca,precio);
        instrumentos.add(nuevoInstrumento);
    }
    
    
}
