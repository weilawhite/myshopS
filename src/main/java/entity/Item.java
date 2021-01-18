package entity;

import java.util.Date;

public class Item {
    int id;
    String name;
    double price;
    int qty;
    Date create_date;
    String info;

    public Item(String name, double price, int qty, Date create_date, String info) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.create_date = create_date;
        this.info = info;
    }

    public Item(int id, String name, double price, int qty, Date create_date, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.create_date = create_date;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return String.format("%d %s %.2f %d %s %s", id, name, price, qty, create_date, info);
    }
}
