import java.util.ArrayList;

/**
 * El muro de nuestra red social.
 * 
 * Pertenece a la aplicacion '0971 - red social'.
 * 
 * El muro es el lugar donde los usuarios publicaran sus entradas.
 * 
 * @author DAM-2017/2018
 * @version 2018/04/25
 */
 public class Muro 
 {
    // Entradas
    private ArrayList<Entrada> entradas;
    /**
     * Constructor - Construye e inicializa un muro vacio.
     */
    public Muro()
    {
        entradas = new ArrayList<>();
    }
    
     
    /**
     * Anade una entrada al muro.
     * @param entrada La entrada de evento a anadir.
     */
     public void addEntrada(Entrada entrada)
     {
         entradas.add(entrada);
     }
     
    /**
     * Devuelve una cadena con toda la informacion del muro.
     * @return Devuelve una cadena con toda la informacion del muro.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        
        // Buscamos todas las entradas
        for (Entrada entrada : entradas) {
            aDevolver += entrada + "\n\n";
        }
        
        return aDevolver;
    }
    
    /**
     * Muestra el muro por la terminal de texto.
     */
    public void mostrarMuro() 
    {
        System.out.println(this);
    }
    
    
    
    /**
     * Muestra los datos de las entradas que le digamos
     * @param el tipo de entrada que quieras imprimir
     */
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada)
    {
        for (Entrada entrada : entradas) {
            if (entrada.getClass().getSimpleName().equals(tipoEntrada) || tipoEntrada == null) {
                switch(entrada.getClass().getSimpleName()){
                    case "EntradaTexto":
                    ((EntradaTexto) entrada).mostrarDatosExclusivos(); 
                    break;
                    case "EntradaFoto":
                    ((EntradaFoto) entrada).mostrarDatosExclusivos();
                    break;
                    case "EntradaEvento":
                    ((EntradaEvento) entrada).mostrarDatosExclusivos();
                    break;
                }
            }
        }
    }
 }