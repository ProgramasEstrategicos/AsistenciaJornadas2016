package dataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Clase base abstracta que sirve de interfaz para la conexión de la aplicación con base de datos MySQL.
 * @author Max Emmanuel Sierra Gómez
 * @version 1.0.0
 * @param <T> 
 * Última fecha de actualización: 04/07/2016
 */
public abstract class GeneralDAO<T> {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/jornadas2016";
    private static final String user = "root";
    private static final String password = "";
    protected String query;
    protected static Connection connection;

    public GeneralDAO() {
        loadDriver();
        establishConnection();
   }

    /**
     * Método que establece conexión con la base de datos.
     */
    public void establishConnection(){
        connection = null;
        try{
            connection = DriverManager.getConnection(DATABASE_URL,user,password);
        }catch(SQLException sqlException){
            JOptionPane.showMessageDialog(null,sqlException.getMessage());
        }
    }

    /**
     * Método que carga el driver.
     */
    public void loadDriver(){
        try {
                Class.forName(DRIVER);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * Método para cerrar la conexión a la base de datos.
     */
    public void closeConnection(){
        try{
            connection.close();
        }catch(SQLException sqlException){
            JOptionPane.showMessageDialog(null,sqlException.getMessage());
        }
    }
}
