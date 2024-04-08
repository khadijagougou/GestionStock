package com.example.gestiondestock.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Taxe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String abreviation;
    private Double tauxImposition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public Double getTauxImposition() {
        return tauxImposition;
    }

    public void setTauxImposition(Double tauxImposition) {
        this.tauxImposition = tauxImposition;
    }


    @Override
    public String toString() {
        return "Taxe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", abreviation='" + abreviation + '\'' +
                ", tauxImposition=" + tauxImposition +
                '}';
    }
}
