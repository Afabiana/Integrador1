package DAO;

import interfaces.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class FacturaProductoDAO implements DAO<FacturaProductoDAO> {
    private Connection conn;
    public FacturaProductoDAO(Connection conexion) {
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
    public LinkedList<FacturaProductoDAO> getAll() throws SQLException {
        return null;
    }

    @Override
    public void delete(FacturaProductoDAO facturaProductoDAO) throws SQLException {

    }

    @Override
    public void update(FacturaProductoDAO facturaProductoDAO) throws SQLException {

    }

    @Override
    public void insert(FacturaProductoDAO facturaProductoDAO) throws SQLException {

    }
}
