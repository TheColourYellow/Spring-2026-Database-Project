package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="supplieraddresses")

public class Supplieraddresses {
    @Id
    private int id;
    private int supplier_id;
    private String street_address;
    private String postal_code;
    private String city;
    private String country;

    public int getId() {return id;}
    public int getSupplier_id() {return supplier_id;}
    public String getStreet_address() {return street_address;}
    public String getPostal_code() {return postal_code;}
    public String getCity() {return city;}
    public String getCountry() {return country;}

    public void setId(int id) {this.id = id;}
    public void setSupplier_id(int supplier_id) {this.supplier_id = supplier_id;}
    public void setStreet_address(String street_address) {this.street_address = street_address;}
    public void setPostal_code(String postal_code) {this.postal_code = postal_code;}
    public void setCity(String city) {this.city = city;}
    public void setCountry(String country) {this.country = country;}
}
