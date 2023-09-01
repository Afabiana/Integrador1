package interfaces;

import java.sql.SQLException;
import java.util.LinkedList;

public interface DAO<T> {
    void createTable() throws SQLException;
    void fillTable(String datos) throws SQLException;

    void drop() throws SQLException;

    void insert(T t) throws SQLException;

    void update(T t) throws SQLException;

    void delete(T t) throws SQLException;

    LinkedList<T> getAll() throws SQLException;
}
