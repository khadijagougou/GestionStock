package com.example.gestiondestock.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NiveauxDeStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Produits nomProduit;
    private Produits usg;
    private Produits aPorterDeMain;
    private Produits emplacementBac;
    private Produits pointDecmd;
private Long id;

    public Produits getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(Produits nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Produits getUsg() {
        return usg;
    }

    public void setUsg(Produits usg) {
        this.usg = usg;
    }

    public Produits getaPorterDeMain() {
        return aPorterDeMain;
    }

    public void setaPorterDeMain(Produits aPorterDeMain) {
        this.aPorterDeMain = aPorterDeMain;
    }

    public Produits getEmplacementBac() {
        return emplacementBac;
    }

    public void setEmplacementBac(Produits emplacementBac) {
        this.emplacementBac = emplacementBac;
    }

    public Produits getPointDecmd() {
        return pointDecmd;
    }

    public void setPointDecmd(Produits pointDecmd) {
        this.pointDecmd = pointDecmd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "NiveauxDeStock{" +
                "nomProduit=" + nomProduit +
                ", usg=" + usg +
                ", aPorterDeMain=" + aPorterDeMain +
                ", emplacementBac=" + emplacementBac +
                ", pointDecmd=" + pointDecmd +
                ", id=" + id +
                '}';
    }
}
