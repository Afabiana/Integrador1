package main.java.DAO;

import main.java.factory.MySQLDAOFactory;
import main.java.interfaces.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class ClienteDAO implements DAO<ClienteDAO> {
    private Connection conn;

    public ClienteDAO(Connection conexion) {
        this.conn = conexion;
    }

    @Override
    public void createTable() throws SQLException {
        this.conn = MySQLDAOFactory.connect();
        String createTable = """
                CREATE TABLE IF NOT EXISTS cliente (
                  idCliente INT NOT NULL,
                  nombre VARCHAR(500) NOT NULL,
                  email VARCHAR(150) NOT NULL,
                  PRIMARY KEY (idCliente)
                );
                """
                ;
        this.conn.prepareStatement(createTable).execute();
        this.conn.commit();
        this.conn.close();
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
