package userAccountManagment;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
        Connection connection = null;
        public Connection connect(){
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kullanici", "postgres", "postgres");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return  connection;
        }
    }
