package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBtest {


    public String testJDBC() {
        String DBresult = "";
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://20.107.243.74:3306/sys", "root", "mypassword");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from `sys`.`Personer`");

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                DBresult = DBresult + " " +  id + " : " + name;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return DBresult;
    }
}
