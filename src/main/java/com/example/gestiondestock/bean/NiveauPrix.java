package com.example.gestiondestock.bean;

import com.example.gestiondestock.enums.Taper;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NiveauPrix {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private Taper taper;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Taper getTaper() {
        return taper;
    }

    public void setTaper(Taper taper) {
        this.taper = taper;
    }
}