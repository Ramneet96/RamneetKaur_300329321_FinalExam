package sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabaseService implements DatabaseInterface{

    Connection con;

    public DatabaseService(Connection con){
        this.con=con;
    }
    @Override
    public void add(Savings cat) throws ClassNotFoundException, SQLException {
        String quer1 = "INSERT INTO savingstable VALUES ( ?, ?,?,?,? )";
        PreparedStatement query = con.prepareStatement(quer1);

        query.setString(1, cat.getSavingscode());
        query.setString(2, cat.getCustname());
        query.setDouble(2, cat.getCdep());
        query.setInt(2, cat.getNyears());
        query.executeUpdate();
    }

    @Override
    public Savings edit(Savings cat, String custcode) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public void delete(String custtcode) throws SQLException {

    }

    @Override
    public List<Savings> display() throws ClassNotFoundException, SQLException {
        return null;
    }
}
