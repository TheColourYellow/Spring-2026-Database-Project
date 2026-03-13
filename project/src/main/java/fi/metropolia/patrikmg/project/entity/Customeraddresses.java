package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="customeraddresses")
public class Customeraddresses {
    @Id
    private int id;
    private int customer_id;
    private String street_address;
    private String postal_code;
    private String city;
    private String country;

    private int getId() {return id;}
    private int getCustomer_id() {return customer_id;}
    private String getStreet_address() {return street_address;}
    private String getPostal_code() {return postal_code;}
    private String getCity() {return city;}
    private String getCountry() {return country;}

    private void setId(int id) {this.id = id;}
    private void setCustomer_id(int customer_id) {this.customer_id = customer_id;}
    private void setStreet_address(String street_address) {this.street_address = street_address;}
    private void setPostal_code(String postal_code) {this.postal_code = postal_code;}
    private void setCity(String city) {this.city = city;}
    private void setCountry(String country) {this.country = country;}
}
