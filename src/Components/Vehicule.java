package Components;

import java.util.Date;

public class Vehicule {
    private Modele mod ;
    private String numéroPlaque  ;
    private Integer prixLocation ,  numéroInterne ;
    private Date DateCirculation ;


    public Vehicule(Modele mod , String numéroPlaque ,Integer prixLocation , Integer numéroInterne ){
        this.mod = mod ;
        this.numéroInterne = numéroInterne ;
        this.numéroPlaque = numéroPlaque ;
        this.prixLocation = prixLocation;

    }

    public Integer getNuméroInterne() {
        return numéroInterne;
    }

    public void setNuméroInterne(Integer numéroInterne) {
        this.numéroInterne = numéroInterne;
    }
}
