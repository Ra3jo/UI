package com.example.ui.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Staff")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name="Fname")
    private String Fname;
    @Column(name="Mname")
    private String Mname;
    @Column(name="Lname")
    private  String  Lname;
    @Column(name="Email")
    private String Email;

}
