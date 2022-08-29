package com.example.systemerp.entity;

import javax.persistence.*;

@Entity
public class Empresa {

    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private int createdAt;
    private int UpdatedAt;

    @OneToMany
    private Empleado empleado;

    /* Constructor */
    public Empresa(){

    }

    /* Setter & Getter */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        UpdatedAt = updatedAt;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
