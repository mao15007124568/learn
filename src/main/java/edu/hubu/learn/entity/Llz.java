package edu.hubu.learn.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "llz")
@Data
public class Llz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String llzname;

    private String llzpassword;

    private String llzemail;

    private String llzphone;

}