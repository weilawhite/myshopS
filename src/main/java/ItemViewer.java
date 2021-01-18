import dao.ItemDao;
import entity.Item;
import impl.ItemDaoImpl;
import util.Tools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemViewer implements ActionListener {
    private JPanel MainPanel;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField qtyField;
    private JTextField dateField;
    private JTextArea infoArea;
    JButton insertBtn;
    private JButton updateBtn;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel dateLabel;
    private JLabel qtyLabel;
    private JLabel infoLabel;
    //
    ItemDao itemDao;


    ItemViewer() {
        itemDao = new ItemDaoImpl();
        insertBtn.addActionListener(this);
        updateBtn.addActionListener(this);
    }

    //


    public static void main(String[] args) {
        ItemViewer iv = new ItemViewer();
        JFrame frame = new JFrame("ItemViewer");
        frame.setContentPane(iv.MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==insertBtn){

            String name= nameField.getText();
            double price=Double.parseDouble(priceField.getText());
            int qty= Integer.parseInt(qtyField.getText());
            String date=dateField.getText();
            String info=infoArea.getText();

            itemDao.insert(new Item(name,price,qty, Tools.strToDate(date),info));
        }else if(e.getSource()==updateBtn)
    {

            System.out.println("我沒做啊");
        }
    }
}
