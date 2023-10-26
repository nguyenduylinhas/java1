package BaiThucHanh;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    ArrayList<BaiThucHanh.lineItems> lineItems = new ArrayList<BaiThucHanh.lineItems>();

    public Order(String mikeTyson, Date date) {
    }

    public Order() {

    }

    public double cost() {
        double totalCost = 0;
        for (BaiThucHanh.lineItems item : lineItems) {
            totalCost += item.cost();
        }
        return totalCost;
    }

    public boolean addProduct(BaiThucHanh.lineItems.Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            BaiThucHanh.lineItems item = new lineItems(product, quantity);
            lineItems.add(item);
            product.setQuantity(product.getQuantity() - quantity);
            return true;
        } else {
            return false;
        }
    }
}

