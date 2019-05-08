package solid_Task;

import java.util.Date;

public class Order {

    private Date order_date;
    private int order_id;

    public Order(Date order_date, int order_id) {
        this.order_date = order_date;
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "Order{" +
               "order_date=" + order_date +
               ", order_id=" + order_id +
               '}';
    }
}