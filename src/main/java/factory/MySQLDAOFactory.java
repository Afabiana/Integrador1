package factory;

import DAO.ClienteDAO;
import DAO.FacturaDAO;
import DAO.FacturaProductoDAO;
import DAO.ProductoDAO;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDAOFactory extends AbstractFactory{
    public static final String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static Connection conn;

    //mi esquema se llama primer_tp_arqui pero depende del nombre que cada uno le asigne localmente

    public static final String DBURL= "jdbc:mysql://localhost:3306/primer_tp_arqui";

    public static Connection connect() throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = createConnection();
        }
        return conn;
    }


    private static Connection createConnection() throws SQLException {
        try {
            Class.forName(DRIVER).getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(DBURL, "root", "root");
            conn.setAutoCommit(false);

        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException |
                 InvocationTargetException
                 | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
            //si falla al agregar el driver, que salga del programa
            System.exit(1);
        }
        return conn;
    }

    public ClienteDAO getClienteDao() throws SQLException {
        return new ClienteDAO(connect());
    }
    public ProductoDAO getProductoDao() throws SQLException {
        return new ProductoDAO(connect());
    }

    public FacturaProductoDAO getFacturaProductoDao() throws SQLException {
        return new FacturaProductoDAO(connect());
    }

    public FacturaDAO getFacturaDao() throws SQLException {
        return new FacturaDAO(connect());
    }
}
