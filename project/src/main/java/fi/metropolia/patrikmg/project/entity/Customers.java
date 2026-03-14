package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
public class Customers {
    @Id
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    @OneToMany(mappedBy = "customer")
    private List<Orders> orders = new ArrayList<Orders>();

    public int getId() {return id;}
    public String getFirst_name() {return first_name;}
    public String getLast_name() {return last_name;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public List<Orders> getOrders() {return this.orders;}

    public void setFirst_name(String first_name) {this.first_name = first_name;}
    public void setLast_name(String last_name) {this.last_name = last_name;}
    public void setEmail(String email) {this.email = email;}
    public void setId(int id) {this.id = id;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setOrders(List<Orders> orders) {this.orders = orders;}

}
