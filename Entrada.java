import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 * Una entrada en nuestro muro.
 * 
 * Pertenece al proyecto '0971 - red social'.
 * 
 * Una entrada es una publicacion de un usuario en el muro.
 * Las entradas pueden tener 'me gusta'. De las entradas
 * se registra el autor y la fecha de publicacion.
 * 
 * @author DAM-2017/2018
 * @version 2018/04/25
 */
public class Entrada
{
    // Autor de la entrada.
    private String usuario;
    // Fecha de publicacion de la entrada.
    private LocalDateTime momentoPublicacion;
    // Cantidad de 'me gusta'.
    private int cantidadMeGusta;
 
    /**
     * Constructor -  Construye entradas a partir de un autor.
     * Las entradas se crean con ningun 'me gusta'. El instante de su 
     * creacion queda registrado.
     * @param autor Autor de la entrada.
     */
    public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }
    
    /**
     * Anade un 'me gusta' a la entrada.
     */
    public void meGusta()
    {
        cantidadMeGusta += 1;
    }
    
    /**
     * Devuelve la fecha de publicacion.
     * @return Devuelve la fecha de publicacion.
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    /**
     * Devuelve el autor de la entrada.
     * @return Devuelve el autor de la entrada.
     */
    public String getUsuario()
    {
        return usuario;
    }
    
    /**
     * Devuelve el numero de 'me gusta' de la entrada.
     * @return Devuelve el numero de 'me gusta' de la entrada.
     */
    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;
    }
    
    public void mostrar()
    {
        // no tienes poder aqui. Nada que hacer aqui.
    }
    
    /**
     * Devuelve la informacion sobre la entrada como una cadena.
     * @return Devuelve la informacion sobre la entrada como una cadena.
     */
    @Override
    public String toString(){
        String aDevolver = "";
        aDevolver += "Usuario: " + usuario + "\n";
        aDevolver += "Likes: " + cantidadMeGusta + "\n";        
        
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        aDevolver += "Escrito hace ";
        
        // Comprobamos si debemos expresar el tiempo en segundos o minutos.
        if(numeroSegundos > 59){
            aDevolver += numeroSegundos / 60 + " minutos";
        }
        else {
            aDevolver += numeroSegundos + " segundos";
        }
        aDevolver += "\n";

        return aDevolver;
    }
    
}