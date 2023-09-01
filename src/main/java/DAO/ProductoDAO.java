package main.java.DAO;

import main.java.interfaces.DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class ProductoDAO implements DAO<ProductoDAO> {

    private Connection conn;
    public ProductoDAO(Connection conexion) {
        this.conn = conexion;
    }

    @Override
    public void createTable() throws SQLException {

    }

    @Override
    public void fillTable(String datos) throws SQLException {

    }

    @Override
    public void drop() throws SQLException {

    }

    @Override
    public LinkedList<ProductoDAO> getAll() throws SQLException {
        return null;
    }

    @Override
    public void delete(ProductoDAO productoDAO) throws SQLException {

    }

    @Override
    public void update(ProductoDAO productoDAO) throws SQLException {

    }

    @Override
    public void insert(ProductoDAO productoDAO) throws SQLException {

    }
}
