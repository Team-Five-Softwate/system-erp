package com.example.systemerp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaccion {

    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String concept;
    private float amount;
    private int createdAt;
    private int UpdatedAt;

    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Empleado empleado;

    /* Constructor */
    public Transaccion(){

    }

    /* Setter & Getter */
    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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
