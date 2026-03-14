package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="products")
public class Products {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private double price;
    @Column(name="stock_quantity")
    private int quantity;
    private int category_id;
    private int supplier_id;
    @ManyToMany
    private List<Suppliers> suppliers = new ArrayList<Suppliers>();
    /*
    //Related to relationship with orderitem list
    @ManyToOne
    private Orderitems orderitems;
    */

    public int getId() {return id;}
    public String getName() {return name;}
    public String getDescription() {return description;}
    public double getPrice() {return price;}
    public int getStock_quantity() {return quantity;}
    public int getCategory_id() {return category_id;}
    public int getSupplier_id() {return supplier_id;}
    //public Orderitems getOrderitems() {return orderitems;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setPrice(double price) {this.price = price;}
    public void setStock_quantity(int stock_quantity) {this.quantity = stock_quantity;}
    public void setCategory_id(int category_id) {this.category_id = category_id;}
    public void setSupplier_id(int supplier_id) {this.supplier_id = supplier_id;}
    //public void setOrderitems(Orderitems orderitems) {this.orderitems = orderitems;}

}
