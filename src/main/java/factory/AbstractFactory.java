package factory;

import DAO.ClienteDAO;
import DAO.FacturaDAO;
import DAO.FacturaProductoDAO;
import DAO.ProductoDAO;

import java.sql.SQLException;

public abstract class AbstractFactory {
    public static final int MYSQL = 1;

    //public static final int ORACLE = 2;

    public AbstractFactory getDAOFactory(int whichFactory){
        switch (whichFactory) {
            case MYSQL:
                return new MySQLDAOFactory();
            /*otro ejemplo:
            case ORACLE:
                return new OracleDAOFactory();
             */
            default:
                return null;
        }

    }

    public abstract ClienteDAO getClienteDao() throws SQLException;

    public abstract ProductoDAO getProductoDao() throws SQLException;

    public abstract FacturaProductoDAO getFacturaProductoDao() throws SQLException;

    public abstract FacturaDAO getFacturaDao() throws SQLException;
}
