package dao;

import entity.Item;

import java.util.List;

public interface ItemDao {
    public boolean update(Item item);
    //public boolean add(entity.Item item);
    public boolean check(Item item);
    public boolean insert(Item item);
    public List<Item> findAll();
    public Item findById(int id);
}
