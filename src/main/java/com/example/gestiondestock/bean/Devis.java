package com.example.gestiondestock.bean;

import com.example.gestiondestock.enums.NouvelleDevis;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Devis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private NouvelleDevis nouvelleDevis;
    private double taux_echange;//convertion entre Euro et devis choisi

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NouvelleDevis getNouvelleDevis() {
        return nouvelleDevis;
    }

    public void setNouvelleDevis(NouvelleDevis nouvelleDevis) {
        this.nouvelleDevis = nouvelleDevis;
    }

    public double getTaux_echange() {
        return taux_echange;
    }

    public void setTaux_echange(double taux_echange) {
        this.taux_echange = taux_echange;
    }
}
