import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Tyler on 1/16/17.
 */
public class AddBook {

    private String title;

    AddBook(String addTitle) {
        title = addTitle;
    }

    AddBook book = new AddBook();

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:sqlite3:library.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);
            statement.executeUpdate("insert into books("+book.title)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
