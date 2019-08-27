package org.katas.refactoring;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<LineItem> listItem;

    public Order(String customerName, String address, List<LineItem> listItem) {
        this.customerName = customerName;
        this.address = address;
        this.listItem = listItem;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return listItem;
    }
}
