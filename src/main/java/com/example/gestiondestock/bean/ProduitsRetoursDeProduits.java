package com.example.gestiondestock.bean;

import jakarta.persistence.*;

@Entity
public class ProduitsRetoursDeProduits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id ;
    @ManyToOne

    private Produits produits;
    @ManyToOne

    private RetoursDeProduits retoursDeProduits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produits getProduits() {
        return produits;
    }

    public void setProduits(Produits produits) {
        this.produits = produits;
    }

    public RetoursDeProduits getRetoursDeProduits() {
        return retoursDeProduits;
    }

    public void setRetoursDeProduits(RetoursDeProduits retoursDeProduits) {
        this.retoursDeProduits = retoursDeProduits;
    }
}
