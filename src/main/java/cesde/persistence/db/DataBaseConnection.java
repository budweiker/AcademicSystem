package cesde.persistence.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private final Connection connection;


    private static final String url = "jdbc:mysql://localhost:3306/academic_system";
    private static final String username = "root";
    private static final String password ="";

    private DataBaseConnection(){
        try{
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexión a la base de datos establecida");
        } catch (SQLException e) {
            throw new RuntimeException("Error al contactar a la base de datos",e);
        }
    }

    public static synchronized DataBaseConnection getInstance(){
        if (instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }
}
