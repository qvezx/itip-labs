package lab_3;

import java.util.HashMap;

public class Orders {
    private HashMap<Integer, Order> orders;

    public Orders() {
        orders = new HashMap<>();
    }

    public void addOrder(int orderNumber, Order order) {
        orders.put(orderNumber, order);
    }

    public Order getOrder(int orderNumber) {
        return orders.get(orderNumber);
    }

    public void removeOrder(int orderNumber) {
        if (orders.containsKey(orderNumber)) {
            orders.remove(orderNumber);
        }
    }

    public void displayOrders() {
        for (Integer orderNumber : orders.keySet()) {
            System.out.println("Order number: " + orderNumber + ", Details: " + orders.get(orderNumber));
        }
    }
}