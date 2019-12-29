/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entité;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author ASUS
 */

@Entity
public class etudiants implements Serializable {
     @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id ;
    private String nom ;
    private String prenom ;
   @Temporal(TemporalType.DATE)
   @JsonFormat(pattern="yyyy-MM-dd")
    private Date datenaissance ;
    private String email ;
    private int tel ;
    private int taux ;
    private int moyenne ;
    

    public etudiants(String nom, String prenom, Date datenaissance, String email, int tel,int taux,int moyenne) 
    {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.email = email;
        this.tel = tel    ;
        this.taux = taux ;
        this.moyenne = moyenne ;
    }

    public etudiants() {
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setTaux(int taux) {
        this.taux = taux;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return tel;
    }

    public int getTaux() {
        return taux;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }

    
    
    
    
    
    

}
