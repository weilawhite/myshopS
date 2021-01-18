package view;

import entity.Item;
import impl.ItemDaoImpl;
import util.Tools;

import java.util.List;
import java.util.Scanner;

public class ItemPage {
    public  void MainPage() {

        ItemDaoImpl itemDao = new ItemDaoImpl();
        //itemDao.insert(new entity.Item("iphone12 plus 2",24999,2,util.Tools.strToDate("2021-1-18"),"123"));
        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("選擇功能 1.商品資訊 2.新增商品 4.離開");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                List<Item> items = itemDao.findAll();
                for (Item item : items) {
                    System.out.println(item);
                }
            } else if (choice == 2) {
                System.out.println("輸入名稱:(-1 to exit)");
                String name = scanner.nextLine();
                if(name.equals("-1")){break;}
                System.out.println("輸入價格:");
                Double price = scanner.nextDouble();
                System.out.println("輸入數量:");
                int qty = scanner.nextInt();
                scanner.nextLine();
                System.out.println("輸入日期:(2021-1-1)");
                String date = scanner.nextLine();
                if(date.equals("")){
                    date=Tools.getToday();
                }
                System.out.println("輸入備註:");
                String info = scanner.nextLine();

                itemDao.insert(new Item(name, price, qty, Tools.strToDate(date), info));
            } else if (choice == 4) {
                break;
            }
            Tools.pressAnyKey();
        }


    }
}
