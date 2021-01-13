import javax.xml.soap.Text;
import java.sql.*;

public class MyShop {
    public static void main(String[] args) {
        Connection conn = DBUtil.getConnection();

        System.out.println(conn);

        Statement statement = null;
        ResultSet resultSet = null;

        if (conn != null) {
            try {
                statement = conn.createStatement();
                resultSet = statement.executeQuery("select * from items;");


                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    double price = resultSet.getDouble("price");
                    int qty = resultSet.getInt("qty");
                    Date create_date = resultSet.getDate("create_date");
                    String info = resultSet.getString("info");

                    System.out.println(id + "," + name + "," + price + "," + qty + "," + create_date + "," + info);


                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        DBUtil.close(conn);



        /*
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
        }*/
    }
}
