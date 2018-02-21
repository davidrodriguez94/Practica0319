import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
    public Tienda(String txt)
    {
        instrumentos = new ArrayList<Instrumento>();
        id = 1;
        try {
            File archivo = new File(txt);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] arrayStrings = sc.nextLine().split("#");
                String instrumento = arrayStrings[0];
                String marca = arrayStrings[1];
                int precio = Integer.parseInt(arrayStrings[2]);
                String categoria = arrayStrings[3];
                addInstrumento(instrumento,marca,precio,categoria);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Añade instrumentos
     */
    public void addInstrumento(String instrumento, String marca, int precio, String categoria)
    {
        Instrumento nuevoInstrumento = new Instrumento(instrumento,marca,precio,categoria,id);
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
    
    
    /**
     * Busca el mayor precio, lo imprime y lo devuelve sin ese elemento
     */
    public ArrayList<Instrumento> localizaMayorLoImprimeYLoBorra(ArrayList<Instrumento> coleccion){
        Instrumento instrumentoConMayorPrecio = null;
        int posicionInstrumentoConMayorPrecio = -1;
        int precioReferencia = 0;
        
        int posicion = 0;
        for(Instrumento instrumento : instrumentos){
            if(instrumento.getPrecioInstrumento() >= precioReferencia){
                precioReferencia = instrumento.getPrecioInstrumento();
                instrumentoConMayorPrecio = instrumento;
                posicionInstrumentoConMayorPrecio = posicion;
            }
            posicion++;
        }
        return coleccion;
    }
    /**
     * Muestra un listado de los objetos ordenados por precio
     */
    public void mostrarObjetosOrdenadosPorPrecio(){
        ArrayList<Instrumento> copiaListadoPrecios = new ArrayList(instrumentos);
        
        while(copiaListadoPrecios.size() > 0){
            copiaListadoPrecios = localizaMayorLoImprimeYLoBorra(copiaListadoPrecios);
        }
    }
    
    /**
     * Modifica el precio del instrumento por su id. 
     */
    public void cambiarPrecio(int id, int precio){
        int contador = 0;
        boolean cambioDePrecio = false;
        while(contador < instrumentos.size() && !cambioDePrecio){
            if(instrumentos.get(contador).getId() == id){
                instrumentos.get(contador).setPrecioInstrumento(precio);
                cambioDePrecio = true;
            }
        }
    }
    
    /**
     * Permite eliminar instrumentos que tienen menos de 100€ en el precio
     */
    public void eliminarInstrumentos(){
        Iterator<Instrumento> iterator = instrumentos.iterator();
        while(iterator.hasNext()){
            Instrumento instrumentoActual = iterator.next();
            if(instrumentoActual.getPrecioInstrumento() < 100){
                iterator.remove();
            }
        }
    }
}