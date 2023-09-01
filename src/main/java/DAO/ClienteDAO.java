package DAO;

import interfaces.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class ClienteDAO implements DAO<ClienteDAO> {
    private Connection conn;

    public ClienteDAO(Connection conexion) throws SQLException {
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
    public LinkedList<ClienteDAO> getAll() throws SQLException {
        return null;
    }

    @Override
    public void delete(ClienteDAO clienteDAO) throws SQLException {

    }

    @Override
    public void update(ClienteDAO clienteDAO) throws SQLException {

    }

    @Override
    public void insert(ClienteDAO clienteDAO) throws SQLException {

    }
}
