package dataBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

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

    public void establishConnection(){
        connection = null;
        try{
            connection = DriverManager.getConnection(DATABASE_URL,user,password);
        }catch(SQLException sqlException){
            //sqlException.printStackTrace();
            System.out.println(sqlException.getMessage());
        }
    }

    public void loadDriver(){
        try {
                Class.forName(DRIVER);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void closeConnection(){
        try{
            connection.close();
        }catch(SQLException sqlException){
            //sqlException.printStackTrace();
            System.out.println(sqlException.getMessage());
        }
    }
    

}
