package com.immo.senekeur.BiensImmobilier.Maison;
import com.immo.senekeur.BiensImmobilier.BiensImmobilier;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("MAISON")
public class Maison extends BiensImmobilier{
    
    private Integer nombre_chambre;

    public Maison(){
        super();
    }

    
    public Maison(Integer id, String region, String ville , byte[] photos) {
        super(id, region, ville, photos);
    }

    public Integer getChambres() {
        return nombre_chambre;
    }

    public void setNombreChambres(Integer nombre_chambre) {
        this.nombre_chambre = nombre_chambre;
    }
    
 
}
