package com.immo.senekeur.BiensImmobilier;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "bien_type")
@Table(name="biens")
public abstract class BiensImmobilier implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String region;
    private String ville;
    

    public BiensImmobilier() {
    }

    public BiensImmobilier(Integer id,String region, String ville) {
        this.id = id;
        this.region = region;
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public String getVille(){
        return ville;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

}
