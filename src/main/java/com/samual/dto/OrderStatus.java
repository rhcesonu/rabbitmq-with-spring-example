package com.samual.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderStatus")
public class OrderStatus {

    @Id
    private String id;
    private Order order;
    private String orderStatus;
    private String message;

    public OrderStatus() {
    }

    public OrderStatus(String id, Order order, String orderStatus, String message) {
        this.id = id;
        this.order = order;
        this.orderStatus = orderStatus;
        this.message = message;
    }

    public OrderStatus(Order order, String orderStatus, String message) {
        this.order = order;
        this.orderStatus = orderStatus;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", orderStatus='" + orderStatus + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
