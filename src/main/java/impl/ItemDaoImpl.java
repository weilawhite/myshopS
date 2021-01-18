package impl;

import dao.ItemDao;
import entity.Item;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    public boolean update(Item item) {
        return false;
    }

    /*public boolean add(entity.Item item) {
        return false;
    }*/

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

            System.out.println(throwables.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }


        return items;
    }

    public boolean insert(Item item) {
        Connection connection= DBUtil.getConnection();
        if(connection==null){
            try {
                connection.close();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
            return false;
        }

        String sqlStr="Insert into items (name, price, qty, create_date, info) values (?,?,?,?,?);";

        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sqlStr);
            preparedStatement.setString(1,item.getName());
            preparedStatement.setDouble(2,item.getPrice());
            preparedStatement.setInt(3,item.getQty());
            preparedStatement.setString(4,item.getCreate_date().toString());
            preparedStatement.setString(5,item.getInfo());
            preparedStatement.execute();
            System.out.println("新增完成");
            return true;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }


        return false;
    }

    public Item findById(int id) {
        return null;
    }
}
