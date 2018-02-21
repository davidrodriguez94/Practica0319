import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class Instrumento here.
 *
 * @author (David)
 * @version (24-01-2018)
 */
public class Instrumento
{
    // Tipo de instrumento: cuerda, viento, percusion...
    private String tipoInstrumento;
    // Marca del instrumento
    private String marcaInstrumento;
    // Precio del instrumento
    private int precioInstrumento;
    // Define un numero identificativo
    private int id;
    // Categoria cuerda, viento, percusion
    private String categoria;
    /**
     * Constructor de la clase Instrumento
     */
    public Instrumento(String tipoInstrumento, String marcaInstrumento, int precioInstrumento, String categoria, int id)
    {
        this.tipoInstrumento = tipoInstrumento;
        this.marcaInstrumento = marcaInstrumento;
        this.precioInstrumento = 0;
        this.id=id;
        String categoriaActual = categoria.toLowerCase();
        if(categoriaActual.equals("cuerda") || categoriaActual.equals("viento") || categoriaActual.equals("percusion")){
            this.categoria = categoria;
        }
        else{
            this.categoria = "";
        }
    }

    /**
     * Método que define el tipo de instrumento 
     */
    public void setTipoInstrumento()
    {
        this.tipoInstrumento = tipoInstrumento;
    }

    /**
     * Método que retorna el tipo de instrumento
     */
    public String getTipoInstrumento()
    {
        return tipoInstrumento;
    }

    /**
     * Método que define la marca de instrumento 
     */
    public void setMarcaInstrumento()
    {
        this.tipoInstrumento = marcaInstrumento;
    }

    /**
     * Método que retorna la marca de instrumento 
     */
    public String getMarcaInstrumento()
    {
        return marcaInstrumento;
    }

    /**
     * Método que define el precio de instrumento 
     */
    public void setPrecioInstrumento(int precio)
    {
        if(precio >= 0){
            this.precioInstrumento = precioInstrumento;
        }
    }

    /**
     * Método que retorna el precio de instrumento 
     */
    public int getPrecioInstrumento()
    {
        return precioInstrumento;
    }

    /**
     * Método que retorna el id
     */
    public int getId(){
        return id;
    }

    /**
     * Cambia el tipo de categoría
     */
    public void setCategoria(){
        String categoriaActual = categoria.toLowerCase();
        if(categoriaActual.equals("cuerda") || categoriaActual.equals("viento") || categoriaActual.equals("percusion")){
            this.categoria = categoria;
        }
        else{
            this.categoria = "";
        }
    }

    /**
     * Método que retorna la categoría
     */
    public String getCategoria(){
        return categoria;
    }

    /**
     * Método que devuelva un String con
     * todas la características del objeto en formato texto
     */
    public String devolverCaracteristicas()
    {
        String detallesProducto = "Tipo: " + tipoInstrumento + "Marca: " +  marcaInstrumento + "Precio: " + precioInstrumento + "Categoria: " + categoria + "ID: " + id; 
        return detallesProducto;
    }
}