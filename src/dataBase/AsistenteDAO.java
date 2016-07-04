package dataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import lógica.Administrador;

/**
 * Clase que extiende de GeneralDAO para realizar los querys a la base de datos.
 * @author Max Emmanuel Sierra Gómez
 * @version 1.0.0
 */
public class AsistenteDAO extends GeneralDAO{
    
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/jornadas2016";
    static PreparedStatement psInsert;
    static Statement statementDelete;
    static Statement statementUpdate;
    static Statement statementQuery;
    static ResultSet resultSet;
    static ResultSetMetaData metaData;
    private String nom;

    public AsistenteDAO(){
        super();
    }
    
    /**
     * Método para agregar un elemento asistente a la tabla Asistente en la base de datos.
     * @param asistente: un objeto tipo AsistenteBean.
     * @param dias: inicializa el día en que asistió por primera vez.
     * @return verdadero si se realizó la inserción y falso si hubo algún error.
     */
    public boolean agregarAsistente(AsistenteBean asistente, boolean[] dias){
        boolean exito = true;
        try{
            psInsert = connection.prepareStatement("INSERT INTO Asistente (nombre, edad, adscripcion, dondeSeEntero, email, asistencias, lunes, martes, miercoles, jueves, viernes) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            psInsert.setString(1,asistente.getNombre());
            psInsert.setInt(2,asistente.getEdad());
            psInsert.setString(3,asistente.getAdscripcion());
            psInsert.setString(4,asistente.getDondeSeEntero());
            psInsert.setString(5,asistente.getEmail());
            psInsert.setInt(6,asistente.getAsistencias());
            psInsert.setBoolean(7,dias[0]);
            psInsert.setBoolean(8,dias[1]);
            psInsert.setBoolean(9,dias[2]);
            psInsert.setBoolean(10,dias[3]);
            psInsert.setBoolean(11,dias[4]);
            psInsert.execute();
            psInsert.close();
        }catch(SQLException sqlException){
            exito = false;
            JOptionPane.showMessageDialog(null,sqlException.getMessage());
        }
        return exito;
    }
    
    /**
     * Método para actualizar la asistencia de un elemento de la tabla Asistente.
     * @param nombre: el nombre del asistente al cual se le actualizará su asistencia.
     * @param dia: día de asistencia
     * @return verdadero si se realizó la actualización y falso si hubo algún error.
     */
    public boolean actualizarAsistente(String nombre, String dia){
        boolean exito = false;
        query = createQueryUpdate(nombre,dia);
        try{
            statementUpdate = connection.createStatement();
            statementUpdate.executeUpdate(query);
            exito = true;
            statementUpdate.close();
        }catch(SQLException sqlException){
            JOptionPane.showMessageDialog(null,sqlException.getMessage());
        }
        return exito;
    }
    
    /**
     * Método para crear el query de actualización.
     * @param nom: nombre del asistente.
     * @param dia: día de la asistencia.
     * @return una cadena que contiene la sentencia query "UPDATE" a ejecutar.
     */
    private String createQueryUpdate(String nom, String dia){
        String strUpdt = "UPDATE asistente SET " + dia + "= 1 where nombre = '" + nom + "'";
        return strUpdt;
    }
    
    /**
     * Método que realiza una consulta de los nombres de los asistentes registrados.
     * @return nom: String con los nombres de todos los asistentes separados por "|".
     */
    public String obtenerLista(){
        nom = "";
        try{
            statementQuery = connection.createStatement();
            resultSet = statementQuery.executeQuery("SELECT nombre from Asistente");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            try{
                while(resultSet.next()){
                    nom += resultSet.getString("nombre") + "|";
                }
            }catch(Exception exc){
                JOptionPane.showMessageDialog(null, exc.getMessage());
            }
        return nom;
    }
}