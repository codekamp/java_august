package CodeKamp;

import java.sql.*;

/**
 * Created by cerebro on 16/09/16.
 */
public class Demo {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("Please download sqlite JDBC from http://....");
            return;
        }


        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/CodeKamp/codekamp.sqlite");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            // this will take resultset pointer to next row which is first row
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getInt("age"));
            }

            statement = connection.createStatement();
            statement.execute("INSERT INTO students (name, email, age) VALUES ('Dharmesh', 'dharmesh@gmail.com', 19)");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
