package sample;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseInterface {


    public void add(Savings cat) throws ClassNotFoundException, SQLException;
    public Savings edit(Savings cat, String custcode) throws SQLException, ClassNotFoundException;
    public void delete(String custtcode) throws SQLException;
    public List<Savings> display() throws ClassNotFoundException, SQLException;

}
