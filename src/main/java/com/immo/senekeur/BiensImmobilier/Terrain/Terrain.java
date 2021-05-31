package com.immo.senekeur.BiensImmobilier.Terrain;
import com.immo.senekeur.BiensImmobilier.BiensImmobilier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("TERRAIN")
public class Terrain extends BiensImmobilier{

    private Integer superficie;


    public Terrain() {
        super();
    }

    public Terrain(Integer id, String region, String ville, byte[] photos) {
        super(id, region, ville, photos);
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
}
