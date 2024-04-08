package com.example.gestiondestock.bean;

import com.example.gestiondestock.enums.Langue;
import jakarta.persistence.*;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double siteWeb;
    private Devise devise;
    private String nom;
    private String email;
    private Double telephone;
    private String adresse1;
    private String adresse2;
    private Double codePostal;

    private String ville;
    private String pays;
    @ManyToOne

    private NiveauxDePrix niveauxDePrix;

    private Langue langue;
    @ManyToOne

    private Taxe taxe;
    private Double rabais;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(Double siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getTelephone() {
        return telephone;
    }

    public void setTelephone(Double telephone) {
        this.telephone = telephone;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public Double getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Double codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public NiveauxDePrix getNiveauxDePrix() {
        return niveauxDePrix;
    }

    public void setNiveauxDePrix(NiveauxDePrix niveauxDePrix) {
        this.niveauxDePrix = niveauxDePrix;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public Taxe getTaxe() {
        return taxe;
    }

    public void setTaxe(Taxe taxe) {
        this.taxe = taxe;
    }

    public Double getRabais() {
        return rabais;
    }

    public void setRabais(Double rabais) {
        this.rabais = rabais;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", siteWeb=" + siteWeb +
                ", devise=" + devise +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", adresse1='" + adresse1 + '\'' +
                ", adresse2='" + adresse2 + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", niveauxDePrix=" + niveauxDePrix +
                ", langue=" + langue +
                ", taxe=" + taxe +
                ", rabais=" + rabais +
                '}';
    }
}










