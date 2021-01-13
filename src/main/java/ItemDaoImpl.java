import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    public boolean update(Item item) {
        return false;
    }

    public boolean add(Item item) {
        return false;
    }

    public boolean check(Item item) {
        return false;
    }

    public List<Item> findAll() {
        List<Item> items = new ArrayList<Item>();
        String sql = "select * from items";
        Connection conn = DBUtil.getConnection();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int qty = resultSet.getInt("qty");
                Date create_date = resultSet.getDate("create_date");
                String info = resultSet.getString("info");
                items.add(new Item(id, name, price, qty, create_date, info));
                //System.out.println(id + "," + name + "," + price + "," + qty + "," + create_date + "," + info);


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        return items;
    }

    public Item findById(int id) {
        return null;
    }
}
