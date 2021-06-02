package com.immo.senekeur.BiensImmobilier;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
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
    @Lob
    private byte[] photos;
    

    public BiensImmobilier() {
    }

    public BiensImmobilier(Integer id,String region, String ville, byte[] photos) {
        this.id = id;
        this.region = region;
        this.ville = ville;
        this.photos = photos;
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

    public byte[] getPhotos() {
        return photos;
      }
    
      public void setPhotos(byte[] photos) {
        this.photos = photos;
      }

    public void setVille(String ville) {
        this.ville = ville;
    }

}
