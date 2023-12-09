package com.example.empadd.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="emp")
public class Employee {
    //id, name, email, bloodgroup

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="bloodgroup")
    private String bloodgroup;
}
