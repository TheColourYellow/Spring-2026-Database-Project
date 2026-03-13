package fi.metropolia.patrikmg.project.entity;

import jakarta.persistence.*;

@Entity
@Table(name="contacts")
public class Contacts {
    @Id
    private int id;
    private String email;
    private String reference;

}
