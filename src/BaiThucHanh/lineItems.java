package BaiThucHanh;

public class lineItems {
    public lineItems(Product product, int quantity) {
    }

    public double cost() {
        double totalCost = 0;
        lineItems[] lineItems = new lineItems[0];
        for (BaiThucHanh.lineItems item : lineItems) {
            totalCost += item.cost();
        }
        return totalCost;
    }


    public class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
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

    public class LineItems {
        private Product product;
        private int quantity;

        public LineItems(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public double cost() {
            return product.getPrice() * quantity;
        }
    }

}
