package broker;

import service.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Broker
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        orders.forEach(Order::execute);
        orders.clear();
    }
}
