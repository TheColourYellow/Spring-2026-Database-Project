package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;
import fi.metropolia.patrikmg.project.util.OrderitemsId;

import java.util.ArrayList;
import java.util.List;

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
    /*
    //Related to product relation

    @OneToMany(mappedBy = "orderitems")
    private List<Products> products = new ArrayList<Products>();
     */

    public int getOrder_id() {return order_id;}
    public int getProduct_id() {return product_id;}
    public int getQuantity() {return quantity;}
    public double getUnit_price() {return unit_price;}
    //public List<Products> getProducts() {return products;}

    public void setOrder_id(int order_id) {this.order_id = order_id;}
    public void setProduct_id(int product_id) {this.product_id = product_id;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setUnit_price(double unit_price) {this.unit_price = unit_price;}
    //public void setProducts(List<Products> products) {this.products = products;}
}
