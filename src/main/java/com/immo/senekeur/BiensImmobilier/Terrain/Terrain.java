package com.immo.senekeur.BiensImmobilier.Terrain;
import com.immo.senekeur.BiensImmobilier.BiensImmobilier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("TERRAIN")
public class Terrain extends BiensImmobilier{

    private Integer superficie;


    public Terrain(Integer id, String region, String ville) {
        super(id, region, ville);
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
}
