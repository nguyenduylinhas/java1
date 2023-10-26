package BaiThucHanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc =new Scanner(System.in);
        int tomatos = sc.nextInt();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = formatter.parse("2023-08-08 11:30:00");

        Order mikeTysonOrder = new Order("Mike Tyson", date);

        Product tomato = new Product("5 qua", 10, 5);
        String qua = null;
        if (tomato == new Product( qua,5,5)){
            System.out.println("mua hàng thành công"+ tomato);
        }
        SimpleDateFormat formatters = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = formatters.parse("2023-08-09 13:14:00");
        Order chrisEvansOrder = new Order("chris Evans", date);
        String address = new String();
        Order  Iphone = new Order();
        Order Fooball = new Order();
    }
}