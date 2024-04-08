package com.example.gestiondestock.bean;

import com.example.gestiondestock.enums.Langue;
import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String adresse1;
    private String adresse2;
    private Double codePostal;

    private String ville;
    private String pays;
    private Double telephone;
    private String siteWeb;
    @ManyToOne

    private Devise devise ;
    private String nom;
    private Double numeroFiscale;
    private String email;
    private Double rabais;
    @ManyToOne

    private NiveauxDePrix niveauxDePrix;

    private Langue langue;
    @ManyToOne

    private Taxe taxe;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getTelephone() {
        return telephone;
    }

    public void setTelephone(Double telephone) {
        this.telephone = telephone;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
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

    public Double getNumeroFiscale() {
        return numeroFiscale;
    }

    public void setNumeroFiscale(Double numeroFiscale) {
        this.numeroFiscale = numeroFiscale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getRabais() {
        return rabais;
    }

    public void setRabais(Double rabais) {
        this.rabais = rabais;
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", adresse1='" + adresse1 + '\'' +
                ", adresse2='" + adresse2 + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", telephone=" + telephone +
                ", siteWeb='" + siteWeb + '\'' +
                ", devise=" + devise +
                ", nom='" + nom + '\'' +
                ", numeroFiscale=" + numeroFiscale +
                ", email='" + email + '\'' +
                ", rabais=" + rabais +
                ", niveauxDePrix=" + niveauxDePrix +
                ", langue=" + langue +
                ", taxe=" + taxe +
                '}';
    }
}