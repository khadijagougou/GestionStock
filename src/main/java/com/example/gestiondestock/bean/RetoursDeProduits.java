package com.example.gestiondestock.bean;

import jakarta.persistence.*;

@Entity
public class RetoursDeProduits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne

    private Client client;

    private Double cout;
    private Double disponible;
    private Double unitesTotal;
    private Double reference;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



    public Double getCout() {
        return cout;
    }

    public void setCout(Double cout) {
        this.cout = cout;
    }

    public Double getDisponible() {
        return disponible;
    }

    public void setDisponible(Double disponible) {
        this.disponible = disponible;
    }

    public Double getUnitesTotal() {
        return unitesTotal;
    }

    public void setUnitesTotal(Double unitesTotal) {
        this.unitesTotal = unitesTotal;
    }

    public Double getReference() {
        return reference;
    }

    public void setReference(Double reference) {
        this.reference = reference;
    }
}
