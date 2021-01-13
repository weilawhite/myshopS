import java.util.Date;

public class Item {
    int id;
    String name;
    double price;
    int qty;
    Date create_date;
    String info;

    public Item(int id, String name, double price, int qty, Date create_date, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.create_date = create_date;
        this.info = info;
    }

    @Override
    public String toString() {
        return String.format("%d %s %.2f %d %s %s", id, name, price, qty, create_date, info);
    }
}
