package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;
import fi.metropolia.patrikmg.project.util.OrderitemsId;

@Entity
@IdClass(OrderitemsId.class)
@Table(name="orderitems")
public class Orderitems {
    @Id
    private int order_id;
    @Id
    private int product_id;
    private int quantity;
    private double unit_price;

    private int getOrder_id() {return order_id;}
    private int getProduct_id() {return product_id;}
    private int getQuantity() {return quantity;}
    private double getUnit_price() {return unit_price;}

    private void setOrder_id(int order_id) {this.order_id = order_id;}
    private void setProduct_id(int product_id) {this.product_id = product_id;}
    private void setQuantity(int quantity) {this.quantity = quantity;}
    private void setUnit_price(double unit_price) {this.unit_price = unit_price;}
}
