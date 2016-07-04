package lógica;

import dataBase.AsistenteBean;
import dataBase.AsistenteDAO;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * Clase para administrar la inserción y actualización. Sirve de interfaz entre GUI y dataBase.
 * @author Max Emmanuel Sierra Gómez
 * @version 1.0.0
 * Última fecha de actualización: 04/07/2016
 */
public class Administrador {
    
    private AsistenteDAO asisDAO;
    private boolean[] dias;
    
    public Administrador(){
        this.asisDAO = new AsistenteDAO();
        this.dias = new boolean[] {false,false,false,false,false};
    }
    
    /**
     * Método que valida que se haya agregado un asistente en la base de datos para mandar un mensaje
     * a la interfaz de usuario.
     * @param asistente 
     */
    public void guardarAsistente(AsistenteBean asistente){
        this.dias[obtenerDia()] = true;
        if(asisDAO.agregarAsistente(asistente,this.dias)){
            JOptionPane.showMessageDialog(null,"Asistente guardado con éxito.");
            asisDAO.closeConnection();
        }else{
            JOptionPane.showMessageDialog(null,"Asistente no guardado.");
        }
    }
    
    /**
     * Método para validar que haya asistentes registrados en la base de datos
     * @return verdadero si existen personas registradas y falso si está vacía la base de datos.
     */
    public boolean existenciaAsistentes(){
        if(asisDAO.obtenerLista().equals("")){
            return false;
        }else{
            return true;
        }
    }
    
    /**
     * Método que obtiene de la base de datos una lista de nombres de asistentes registrados.
     * @return una cadena con los nombres separados por "|"
     */
    public String obtenerAsistentes(){
        return asisDAO.obtenerLista();
    }
    
    /**
     * Método para obtener el día actual.
     * @return un entero que identifica al día presente de la semana.
     */
    public int obtenerDia(){
        return (new GregorianCalendar().get(Calendar.DAY_OF_WEEK) - 2);
    }
    
    /**
     * Método para enlazar con la clase y método que actualiza un asistente en la base de datos.
     * @param nombre: nombre del asistente.
     * @param dia: día de la asistencia.
     * @return verdadero si se realizó la actualización y falso si hubo algún error.
     */
    public boolean actualizarAsistente(String nombre, String dia){
        return asisDAO.actualizarAsistente(nombre, dia);
    }
}