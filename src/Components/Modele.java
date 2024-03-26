package Components;

public class Modele {
    private String designation , marque ,typeCarburant , typeBoiteVitesse ;
    private Integer Id , capacite  , puissanceFiscale ;

    public Integer getId() {
        return Id;
    }

    public Modele(String designation , String marque , String typeCarburant , String typeBoiteVitesse , Integer Id , Integer capacite , Integer puissanceFiscale){
        this.designation = designation ;
        this.marque = marque ;
        this.typeCarburant = typeCarburant ; this.typeBoiteVitesse= typeBoiteVitesse ;this.Id = Id ;
        this.capacite = capacite  ; this.puissanceFiscale = puissanceFiscale ;
    }

    public enum modeles{} ;


}
