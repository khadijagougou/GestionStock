package com.example.gestiondestock.bean;

import jakarta.persistence.*;

@Entity
public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private Double usg;
    private Double codeAbarre ;
    private Double prixDeGros ;
    private Double prixDeVenteConseillé ;
    @ManyToOne
    private NiveauDePrix niveauDePrix;
    private Double coutInitial;
    private Double qteMinDeCmd;
    @ManyToOne
    private Taxe taxe;
    @ManyToOne
    private NiveauxDeStock niveauxDeStock;


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

    public Double getUsg() {
        return usg;
    }

    public void setUsg(Double usg) {
        this.usg = usg;
    }

    public Double getCodeAbarre() {
        return codeAbarre;
    }

    public void setCodeAbarre(Double codeAbarre) {
        this.codeAbarre = codeAbarre;
    }

    public Double getPrixDeGros() {
        return prixDeGros;
    }

    public void setPrixDeGros(Double prixDeGros) {
        this.prixDeGros = prixDeGros;
    }

    public Double getPrixDeVenteConseillé() {
        return prixDeVenteConseillé;
    }

    public void setPrixDeVenteConseillé(Double prixDeVenteConseillé) {
        this.prixDeVenteConseillé = prixDeVenteConseillé;
    }



    public Double getCoutInitial() {
        return coutInitial;
    }

    public void setCoutInitial(Double coutInitial) {
        this.coutInitial = coutInitial;
    }

    public Double getQteMinDeCmd() {
        return qteMinDeCmd;
    }

    public void setQteMinDeCmd(Double qteMinDeCmd) {
        this.qteMinDeCmd = qteMinDeCmd;
    }

    public Taxe getTaxe() {
        return taxe;
    }

    public void setTaxe(Taxe taxe) {
        this.taxe = taxe;
    }

    public NiveauxDeStock getNiveauxDeStock() {
        return niveauxDeStock;
    }

    public void setNiveauxDeStock(NiveauxDeStock niveauxDeStock) {
        this.niveauxDeStock = niveauxDeStock;
    }


    @Override
    public String toString() {
        return "Produits{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", usg=" + usg +
                ", codeAbarre=" + codeAbarre +
                ", prixDeGros=" + prixDeGros +
                ", prixDeVenteConseillé=" + prixDeVenteConseillé +
                ", niveauDePrix=" + niveauDePrix +
                ", coutInitial=" + coutInitial +
                ", qteMinDeCmd=" + qteMinDeCmd +
                ", taxe=" + taxe +
                ", niveauxDeStock=" + niveauxDeStock +
                '}';
    }
}