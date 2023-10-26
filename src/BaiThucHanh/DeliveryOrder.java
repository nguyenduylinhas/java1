package BaiThucHanh;

public class DeliveryOrder extends Order {
    private String address;

    public DeliveryOrder(String address) {
        super();
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

