package id.my.hifra.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NoteModel extends BaseModel {

    public NoteModel() throws SQLException {
        super();
    }

    public int addNote(String title, String body) throws SQLException {
        String query = "INSERT INTO notes " +
                "(title, body) " +
                "VALUES (?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, body);

        return preparedStatement.executeUpdate();
    }

    public ResultSet getNotes() throws SQLException {
        String query = "SELECT * FROM notes";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        return preparedStatement.executeQuery();
    }
}
