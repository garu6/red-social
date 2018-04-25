import java.util.ArrayList;

/**
 * Una entrada en nuestro muro con comentarios.
 * 
 * Pertenece al proyecto '0971 - red social'.
 * 
 * 
 * @author DAM-2017/2018
 * @version 2018/04/25
 */
public class EntradaConComentarios extends Entrada
{

    // Comentarios de la entrada.
    private ArrayList<String> comentarios;
 
    /**
     * Constructor -  Construye entradas a partir de un autor.
     * Las entradas se crean con ningun 'me gusta'. El instante de su 
     * creacion queda registrado. Por defecto, las entradas se crean sin comentarios.
     * @param autor Autor de la entrada.
     */
    public EntradaConComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<>();
    }
  
    /**
     * Anade un comentario a la entrada.
     * @param text El comentario a anadir.
     */
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
    /**
     * Devuelve los comentarios de la entrada.
     * @return Devuelve los comentarios de la entrada.
     */
    public ArrayList<String> getComentarios() 
    {
        return comentarios;
    }

}