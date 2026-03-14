package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int customer_id;
    @Temporal(TemporalType.DATE)
    private java.util.Date order_date;
    @Temporal(TemporalType.DATE)
    private java.util.Date delivery_date;
    private int shipping_address_id;
    private String status;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false)
    private Customers customer;

    public int getId() {return this.id;}
    public int getCustomer_id() {return this.customer_id;}
    public java.util.Date getOrder_date() {return this.order_date;}
    public java.util.Date getDelivery_date() {return this.delivery_date;}
    //public LocalDate getOrder_date() {return this.order_date;}
    //public LocalDate getDelivery_date() {return this.delivery_date;}
    public int getShipping_address_id() {return this.shipping_address_id;}
    public String getStatus() {return this.status;}
    public Customers getCustomers() {return this.customer;}


    public void setId(int id) {this.id=id;}
    public void setCustomer_id(int customer_id) {this.customer_id=customer_id;}
    public void setOrder_date(java.util.Date order_date) {this.order_date=order_date;}
    public void setDelivery_date(java.util.Date delivery_date) {this.delivery_date=delivery_date;}
    //public void setOrder_date(LocalDate order_date) {this.order_date=order_date;}
    //public void setDelivery_date(LocalDate delivery_date) {this.delivery_date=delivery_date;}
    public void setShipping_address_id(int shipping_address_id) {
        this.shipping_address_id=shipping_address_id;
    }
    public void setStatus(String status) {this.status=status;}
    public void setCustomers(Customers customer) {this.customer=customer;}

}
