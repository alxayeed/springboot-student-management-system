package com.example.sms.entity;

import javax.persistence.*;

@Entity //makes simple java class into jpa entity
// maps this entity with database table. table name is provided as 'students'
// default name is the class name
@Table(name = "students")
public class Student {

    @Id // marks this field as pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy for pk generation
    private Long id;

    //maps with db column. name and nullable fields is provided explicitly
    // default is the field name
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;

    //default constructor- needed for hibernate to generate objects dynamically
    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
