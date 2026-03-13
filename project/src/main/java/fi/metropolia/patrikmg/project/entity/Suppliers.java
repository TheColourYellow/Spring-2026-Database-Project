package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="suppliers")
public class Suppliers {
    @Id
    private int id;
    private String name;
    private String contact_name;
    private String phone;
    private String email;

    public int getId() {return id;}
    public String getName() {return name;}
    public String getContact_name() {return contact_name;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setContact_name(String contact_name) {this.contact_name = contact_name;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail(String email) {this.email = email;}

}
