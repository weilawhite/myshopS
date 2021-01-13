import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static String url = "jdbc:mysql://localhost:3306/myshop?characterEncoding=UTF-8";
    static String user = "root";
    static String password = "123456";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
            //System.out.println(conn);
        } catch (
                SQLException troubles) {
            troubles.printStackTrace();
        }
        System.out.println("Connection fail.");
        return null;
    }
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("connect close.");
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }


    }

}
