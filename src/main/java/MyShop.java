import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyShop {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String user="root";
        String password="123456";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn= DriverManager.getConnection(url,user,password);
            System.out.println(conn);

        } catch (SQLException troubles) {
            troubles.printStackTrace();
        }finally {
            if(conn!=null) {
                try {
                    conn.close();
                    System.out.println("connect close.");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
