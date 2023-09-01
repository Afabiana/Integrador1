package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

import interfaces.DAO;
public class FacturaDAO implements DAO<FacturaDAO>{
    private Connection conn;

    public FacturaDAO(Connection conexion) {
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
    public LinkedList<FacturaDAO> getAll() throws SQLException {
        return null;
    }

    @Override
    public void delete(FacturaDAO facturaDAO) throws SQLException {

    }

    @Override
    public void update(FacturaDAO facturaDAO) throws SQLException {

    }

    @Override
    public void insert(FacturaDAO facturaDAO) throws SQLException {

    }
}
