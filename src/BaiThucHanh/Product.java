package BaiThucHanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String sku;
    private String category;
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.sku=sku;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category=category;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class LineItems {
    private Product product;
    private int quantity;

    public LineItems(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double cost() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}
