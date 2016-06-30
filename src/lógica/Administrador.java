package lógica;

import dataBase.AsistenteBean;
import dataBase.AsistenteDAO;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * @author Max Emmanuel Sierra Gómez
 */
public class Administrador {
    
    private AsistenteDAO asis;
    private boolean[] dias;
    
    public Administrador(){
        this.asis = new AsistenteDAO();
        this.dias = new boolean[] {false,false,false,false,false};
    }
    
    public void guardarAsistente(AsistenteBean asistente){
        this.dias[obtenerDia()] = true;
        if(asis.agregarAsistente(asistente,this.dias)){
            JOptionPane.showMessageDialog(null,"Asistente guardado con éxito.");
            asis.closeConnection();
        }else{
            JOptionPane.showMessageDialog(null,"Asistente no guardado.");
        }
    }
    
    public boolean existenciaAsistentes(){
        if(asis.obtenerLista().equals("")){
            return false;
        }else{
            return true;
        }
    }
    
    public String obtenerAsistentes(){
        return asis.obtenerLista();
    }
    
    public int obtenerDia(){
        return (new GregorianCalendar().get(Calendar.DAY_OF_WEEK) - 2);
    }
    
    public boolean actualizarAsistente(String nombre, String dia){
        return asis.actualizarAsistente(nombre, dia);
    }
}
