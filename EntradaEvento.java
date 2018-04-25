import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Una entrada que informa de un evento.
 * 
 * Pertenece a la aplicacion '0971 - red social'.
 * 
 * Una entrada de evento simboliza un evento. Los eventos son cosas como 'Un usuario
 * se ha unido al grupo'
 * 
 * @author DAM-2017/2018
 * @version 2018/04/25
 */

public class EntradaEvento extends Entrada
{
    // Contenido del evento.
    private String mensajeEvento;
    
    /**
     * Constructor - Construye entradas a partir de un autor y un contenido.
     * Las entradas se crean sin ningun ' me gusta'.
     * La fecha de publicacion coincide con el momento en el que se crea la entrada.
     * @param autor Autor de la entrada.
     * @param mensaje Contenido de la entrada.
     */
    public EntradaEvento (String autor, String texto)
    {
        super(autor);
        mensajeEvento = texto;
    }
    
    
    /**
     * Devuelve el contenido del evento.
     * @return Devuelve el contenido del evento.
     */
    public String getMensajeEvento()
    {
        return mensajeEvento;
    }
    
    /**
     * Devuelve una cadena con toda la informacion de la entrada.
     * @return Devuelve una cadena con toda la informacion de la entrada.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        aDevolver += "Usuario: " + getUsuario() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";        
        aDevolver += mensajeEvento + "\n";
        
        // Calculamos el numero de segundos que han pasado desde la fecha de publicacion.
        long numeroSegundos = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
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
    
    /**
     * Imprime por pantalla toda la informacion de la entrada.
     */
    @Override
    public void mostrar()
    {
        System.out.println(this);    
    }    
}