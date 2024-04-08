package com.example.gestiondestock.bean;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime date_paiement;
    @ManyToOne
    private MethodePaiement methodePaiement;
    private Double total;
    private Double effectivementpaye;
    private Double montantPaye;
    private String Reference;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDate_paiement() {
        return date_paiement;
    }

    public void setDate_paiement(LocalDateTime date_paiement) {
        this.date_paiement = date_paiement;
    }

    public MethodePaiement getMethodePaiement() {
        return methodePaiement;
    }

    public void setMethodePaiement(MethodePaiement methodePaiement) {
        this.methodePaiement = methodePaiement;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getEffectivementpaye() {
        return effectivementpaye;
    }

    public void setEffectivementpaye(Double effectivementpaye) {
        this.effectivementpaye = effectivementpaye;
    }

    public Double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(Double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }
}