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
     * Devuelve la informacion sobre la entrada como una cadena.
     * @return Devuelve la informacion sobre la entrada como una cadena.
     */
    @Override
    public String toString() 
    {
        String aDevolver = super.toString();
        
        // Comprobamos si hay comentarios. 
        // Si hay los mostramos, si no, mostramos un mensaje indicandolo.
        if (comentarios.size() == 0) {
            aDevolver += "No hay comentarios\n";
        }
        else {
            aDevolver += "Comentarios: \n";
            for(String comentarioActual : comentarios){
                aDevolver += comentarioActual + "\n";
            }
        }     
        
        return aDevolver;
    }

}