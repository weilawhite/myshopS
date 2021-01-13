import javax.xml.soap.Text;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class MyShop {
    public static void main(String[] args) {

        ItemDaoImpl itemDao=new ItemDaoImpl();
        List<Item> items=itemDao.findAll();
        System.out.println(items);
        /*
        Connection conn = DBUtil.getConnection();

        System.out.println(conn);

        Statement statement = null;
        ResultSet resultSet = null;

        if (conn != null) {
            try {
                String insert = "insert into items (name,price,qty,info,create_date) values ('i phone充電器3',390,10,'oem','2020-08-25');";
                String insert2 = "insert into customers (name,password,phone) values ('Tony','123456','0000000000');";
                String update = "update items set info='無備註' where info is null";
                statement = conn.createStatement();
                int result = statement.executeUpdate(update);
                if (result > 0) {
                    System.out.println("insert");
                } else {
                    System.out.println("fail");
                }
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

*/

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
